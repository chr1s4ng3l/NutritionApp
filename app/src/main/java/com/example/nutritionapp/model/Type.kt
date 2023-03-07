package com.example.nutritionapp.model


import com.google.gson.annotations.SerializedName

data class Type(
    @SerializedName("deforestation_risk")
    val deforestationRisk: Double? = null,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("soy_feed_factor")
    val soyFeedFactor: Double? = null,
    @SerializedName("soy_yield")
    val soyYield: Double? = null
)