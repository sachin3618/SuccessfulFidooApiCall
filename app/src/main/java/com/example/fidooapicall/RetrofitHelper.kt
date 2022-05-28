package com.example.fidooapicall

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object RetrofitHelper {
    var retrofitService: ResInterface? = null

    fun getInstance(): ResInterface{
        val retrofit = Retrofit.Builder()
            .baseUrl("https://fidoo.in/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        retrofitService = retrofit.create(ResInterface::class.java)
        return retrofitService as ResInterface

    }
}