package com.example.nutritionapp.model


import com.google.gson.annotations.SerializedName

data class ImpactsUnits(
    @SerializedName("Climate_change")
    val climateChange: String? = null,
    @SerializedName("EF_single_score")
    val eFSingleScore: String? = null
)