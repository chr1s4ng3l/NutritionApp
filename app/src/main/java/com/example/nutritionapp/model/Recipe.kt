package com.example.nutritionapp.model


import com.google.gson.annotations.SerializedName

data class Recipe(
    @SerializedName("en:durum_wheat_semolina_pasta")
    val enDurumWheatSemolinaPasta: Double? = null,
    @SerializedName("en:water")
    val enWater: Double? = null
)