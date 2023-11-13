package com.example.retrofit_hhero12.network

import com.example.retrofit_hhero12.model.HeroModel
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("rest-api-sample/data.php")
    fun getAllHeroes(): Call<HeroModel>
}