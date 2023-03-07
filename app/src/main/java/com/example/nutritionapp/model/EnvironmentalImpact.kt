package com.example.nutritionapp.model


import com.google.gson.annotations.SerializedName

data class EnvironmentalImpact(
    @SerializedName("database")
    val database: String? = null,
    @SerializedName("entry")
    val entry: String? = null
)