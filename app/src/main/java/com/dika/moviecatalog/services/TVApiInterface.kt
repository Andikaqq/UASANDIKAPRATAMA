package com.dika.moviecatalog.services

import com.dika.moviecatalog.models.TVResponse
import retrofit2.Call
import retrofit2.http.GET

interface TVApiInterface {
    @GET("/3/tv/popular?api_key=d9bdbf7664eebfa3fa8d1319afc0599b")
    fun getTVList(): Call<TVResponse>

}