package com.example.nutritionapp.model


import com.google.gson.annotations.SerializedName

data class AggregatedOrigin(
    @SerializedName("epi_score")
    val epiScore: Int? = null,
    @SerializedName("origin")
    val origin: String? = null,
    @SerializedName("percent")
    val percent: Int? = null,
    @SerializedName("transportation_score")
    val transportationScore: Int? = null
)