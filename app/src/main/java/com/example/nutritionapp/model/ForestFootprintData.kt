package com.example.nutritionapp.model


import com.google.gson.annotations.SerializedName

data class ForestFootprintData(
    @SerializedName("footprint_per_kg")
    val footprintPerKg: Double? = null,
    @SerializedName("grade")
    val grade: String? = null,
    @SerializedName("ingredients")
    val ingredients: List<Ingredient?>? = null
)