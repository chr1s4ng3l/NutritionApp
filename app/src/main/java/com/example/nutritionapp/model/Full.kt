package com.example.nutritionapp.model


import com.google.gson.annotations.SerializedName

data class Full(
    @SerializedName("h")
    val h: Int? = null,
    @SerializedName("w")
    val w: Int? = null
)