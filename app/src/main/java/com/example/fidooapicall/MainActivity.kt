package com.example.fidooapicall

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.fidooapicall.model.ResModel
import retrofit2.*
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val retrofit = Retrofit.Builder()
            .baseUrl("https://fidoo.in/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val retro = retrofit.create(ResInterface::class.java)

        retro.RestrauntDetails(
            "90",
            "1550130e0ad712ba5f41a2ca471105d5",
            "5",
            "28.395430799999993",
            "76.97582060000005",
            "0",
            "0"
        ).enqueue(object : Callback<ResModel>{
            override fun onResponse(call: Call<ResModel>, response: Response<ResModel>) {
                Log.i("successs", response.body().toString())
            }

            override fun onFailure(call: Call<ResModel>, t: Throwable) {
                TODO("Not yet implemented")
            }

        })

    }
}