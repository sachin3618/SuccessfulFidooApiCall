package com.example.fidooapicall.model

data class CouponsAvailable(
    val coupon_desc: String,
    val coupon_name: String,
    val discount: String,
    val discount_type: String,
    val expiry_date: String,
    val mininum_amt: String,
    val upto: String
)