package com.example.retrofit_hhero12.model

import com.google.gson.annotations.SerializedName

data class HeroModel(
    @SerializedName("result")
    val `data`: List<DataHero>
)