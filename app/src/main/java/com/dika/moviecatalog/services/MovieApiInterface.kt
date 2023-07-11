package com.dika.moviecatalog.services

import retrofit2.Call
import com.dika.moviecatalog.models.MovieResponse
import retrofit2.http.GET

interface MovieApiInterface {
    @GET("/3/movie/popular?api_key=d9bdbf7664eebfa3fa8d1319afc0599b")
    fun getMovieList(): Call<MovieResponse>

}