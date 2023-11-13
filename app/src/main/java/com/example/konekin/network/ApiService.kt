package com.example.konekin.network

import com.example.konekin.model.Users
import com.example.konekin.model.Data
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("data.php")
    fun getSuperhero(): Call<Data>
}