package com.example.fidooapicall

import com.example.fidooapicall.model.ResModel
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface ResInterface {
    @FormUrlEncoded
    @POST("api/method/storeList.inc.php")
    fun RestrauntDetails(
        @Field("accountId") accountId: String,
        @Field("accessToken") accessToken: String,
        @Field("service_id") serviceId : String,
        @Field("latitude") latitude: String,
        @Field("longitude") longitude: String,
        @Field("distance_start") distanceStart: String,
        @Field("distance_end") distanceEnd: String
    ) : Call<ResModel>

}