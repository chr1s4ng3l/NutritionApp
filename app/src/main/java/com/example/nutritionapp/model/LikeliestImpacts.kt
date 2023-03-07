package com.example.nutritionapp.model


import com.google.gson.annotations.SerializedName

data class LikeliestImpacts(
    @SerializedName("Climate_change")
    val climateChange: Double? = null,
    @SerializedName("EF_single_score")
    val eFSingleScore: Double? = null
)