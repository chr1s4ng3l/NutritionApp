package com.example.nutritionapp.model


import com.google.gson.annotations.SerializedName

data class ProductionSystem(
    @SerializedName("labels")
    val labels: List<String?>? = null,
    @SerializedName("value")
    val value: Int? = null,
    @SerializedName("warning")
    val warning: String? = null
)