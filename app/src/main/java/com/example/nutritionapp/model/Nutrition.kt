package com.example.nutritionapp.model


import com.google.gson.annotations.SerializedName

data class Nutrition(
    @SerializedName("database")
    val database: String? = null,
    @SerializedName("entry")
    val entry: String? = null
)