package com.example.retrofit_hhero12.model

import com.google.gson.annotations.SerializedName

data class DataHero(
    @SerializedName("image")
    val image: String,

    @SerializedName("id")
    val id: Int,

    @SerializedName("title")
    val title: String
)
