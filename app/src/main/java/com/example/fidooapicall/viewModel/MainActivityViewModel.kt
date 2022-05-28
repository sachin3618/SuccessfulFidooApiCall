package com.example.fidooapicall.viewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.fidooapicall.RetrofitHelper
import com.example.fidooapicall.model.ResModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivityViewModel : ViewModel() {
    var RestDetails = MutableLiveData<ResModel>()
    val _RestDetails : LiveData<ResModel> = RestDetails


    fun FetchRestrauntDetails(){
        val retro = RetrofitHelper.getInstance()

        retro.RestrauntDetails(
            "90",
            "1550130e0ad712ba5f41a2ca471105d5",
            "5",
            "28.395430799999993",
            "76.97582060000005",
            "0",
            "0"
        ).enqueue(object : Callback<ResModel> {
            override fun onResponse(call: Call<ResModel>, response: Response<ResModel>) {
                RestDetails.value = response.body()
            }

            override fun onFailure(call: Call<ResModel>, t: Throwable) {
                Log.i("Fail", "Failed")
            }

        })
    }

}