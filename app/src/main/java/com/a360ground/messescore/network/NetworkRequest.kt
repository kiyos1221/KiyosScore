package com.a360ground.messescore.network

import android.content.Context
import android.content.Intent
import android.support.v4.content.LocalBroadcastManager
import android.widget.Toast
import com.a360ground.messescore.databases.CacheScoreManager
import com.a360ground.messescore.interfaces.ApiTopNews
import com.a360ground.messescore.models.News
import io.realm.Realm
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by Kiyos Solomon on 2/25/2017.
 */
class NetworkRequest {

    fun getRetrofit(): Retrofit {
        var retrofitBuilder = Retrofit.Builder()
                .baseUrl("http://192.168.137.1/KiyosScore/wp-json/")
                .addConverterFactory(GsonConverterFactory.create())

        var retrofit = retrofitBuilder.build();

        return retrofit
    }

    fun loadMore(context : Context): List<News>{
        var networkRequest = NetworkRequest()

        Realm.init(context)

        val retrofit = networkRequest.getRetrofit()

        val apiTopNews = retrofit.create(ApiTopNews::class.java)

        val callAllNews = apiTopNews.getAllNews()

        callAllNews.enqueue(object : Callback<List<News>> {
            override fun onResponse(call: Call<List<News>>, response: Response<List<News>>) {

                CacheScoreManager.insertNews(response.body())

                var intent = Intent("content_loaded")

                intent.putExtra("Loaded",true)

                LocalBroadcastManager.getInstance(context).sendBroadcast(intent)

            }

            override fun onFailure(call: Call<List<News>>, t: Throwable) {
                Toast.makeText(context, t.printStackTrace().toString(), Toast.LENGTH_LONG).show()
            }
        })
    }
}