package com.example.nutritionapp.model


import com.google.gson.annotations.SerializedName

data class ImpactDistributions(
    @SerializedName("Climate_change")
    val climateChange: List<Double?>? = null,
    @SerializedName("EF_single_score")
    val eFSingleScore: List<Double?>? = null
)