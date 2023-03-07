package com.example.nutritionapp.model


import com.google.gson.annotations.SerializedName

data class UncharacterizedIngredients(
    @SerializedName("impact")
    val impact: List<String?>? = null,
    @SerializedName("nutrition")
    val nutrition: List<String?>? = null
)