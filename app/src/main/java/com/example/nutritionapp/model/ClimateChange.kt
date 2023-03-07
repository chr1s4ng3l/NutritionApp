package com.example.nutritionapp.model


import com.google.gson.annotations.SerializedName

data class ClimateChange(
    @SerializedName("0_05")
    val x005: Double? = null,
    @SerializedName("0_25")
    val x025: Double? = null,
    @SerializedName("0_5")
    val x05: Double? = null,
    @SerializedName("0_75")
    val x075: Double? = null,
    @SerializedName("0_95")
    val x095: Double? = null
)