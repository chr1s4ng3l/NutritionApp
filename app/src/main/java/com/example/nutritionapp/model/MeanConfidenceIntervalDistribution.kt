package com.example.nutritionapp.model


import com.google.gson.annotations.SerializedName

data class MeanConfidenceIntervalDistribution(
    @SerializedName("Climate_change")
    val climateChange: List<List<Double?>?>? = null,
    @SerializedName("EF_single_score")
    val eFSingleScore: List<List<Double?>?>? = null
)