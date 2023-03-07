package com.example.nutritionapp.model


import com.google.gson.annotations.SerializedName

data class ThreatenedSpecies(
    @SerializedName("ingredient")
    val ingredient: String? = null,
    @SerializedName("value")
    val value: Int? = null,
    @SerializedName("warning")
    val warning: String? = null
)