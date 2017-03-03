package com.a360ground.messescore.network

import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by Kiyos Solomon on 2/25/2017.
 */
class NetworkRequest {

    fun getRetrofit():Retrofit{
        var retrofitBuilder = Retrofit.Builder()
                .baseUrl("http://192.168.137.1/KiyosScore/wp-json/")
                .addConverterFactory(GsonConverterFactory.create())

        var retrofit = retrofitBuilder.build();

        return retrofit

    }

}