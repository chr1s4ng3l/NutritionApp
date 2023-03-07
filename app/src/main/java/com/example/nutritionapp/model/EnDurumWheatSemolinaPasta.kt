package com.example.nutritionapp.model


import com.google.gson.annotations.SerializedName

data class EnDurumWheatSemolinaPasta(
    @SerializedName("environmental_impact")
    val environmentalImpact: List<EnvironmentalImpact?>? = null,
    @SerializedName("nutrition")
    val nutrition: List<Nutrition?>? = null
)