package com.example.nutritionapp.model


import com.google.gson.annotations.SerializedName

data class EnWater(
    @SerializedName("environmental_impact")
    val environmentalImpact: List<EnvironmentalImpact>? = listOf(),
    @SerializedName("nutrition")
    val nutrition: List<Nutrition>? = listOf()
)