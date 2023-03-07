package com.example.nutritionapp.model


import com.google.gson.annotations.SerializedName

data class NutrientLevels(
    @SerializedName("fat")
    val fat: String? = null,
    @SerializedName("salt")
    val salt: String? = null,
    @SerializedName("saturated-fat")
    val saturatedFat: String? = null,
    @SerializedName("sugars")
    val sugars: String? = null
)