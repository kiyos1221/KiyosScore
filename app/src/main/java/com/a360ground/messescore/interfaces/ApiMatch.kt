package com.a360ground.messescore.interfaces

import com.a360ground.messescore.models.Match

import io.reactivex.Observable
import retrofit2.http.GET

/**
 * Created by Kiyos Solomon on 2/24/2017.
 */

interface ApiMatch {

    @GET("/sportspress/v2/sp_event")
    fun getMatch():Observable<List<Match>>;

}
