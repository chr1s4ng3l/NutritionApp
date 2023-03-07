package com.example.nutritionapp.model


import com.google.gson.annotations.SerializedName

data class UncharacterizedIngredientsMassProportion(
    @SerializedName("impact")
    val impact: Double? = null,
    @SerializedName("nutrition")
    val nutrition: Double? = null
)