package com.a360ground.messescore.interfaces

import com.a360ground.messescore.models.News
import io.reactivex.Observable
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by Kiyos Solomon on 2/25/2017.
 */

internal interface ApiTopNews {

    @GET("wp/v2/posts")
    fun getTopNews(@Query(value = "categories", encoded = true) id: Int): Call<List<News>>

    @GET("wp/v2/posts")
    fun getAllNews(): Call<List<News>>
}
