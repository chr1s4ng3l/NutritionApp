package com.example.nutritionapp.model


import com.google.gson.annotations.SerializedName

data class ImpactsQuantiles(
    @SerializedName("Climate_change")
    val climateChange: ClimateChange? = null,
    @SerializedName("EF_single_score")
    val eFSingleScore: EFSingleScore? = null
)