package com.example.fidooapicall.model

data class ResModel(
    val accessToken: String,
    val accountId: String,
    val curations: List<Curation>,
    val distance_end: String,
    val distance_start: String,
    val error: Boolean,
    val error_code: Int,
    val more_value: Boolean,
    val page_count: String,
    val store_list: List<Store>,
    val total_count: Int
)