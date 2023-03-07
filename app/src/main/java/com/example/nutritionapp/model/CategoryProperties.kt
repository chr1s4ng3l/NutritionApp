package com.example.nutritionapp.model


import com.google.gson.annotations.SerializedName

data class CategoryProperties(
    @SerializedName("ciqual_food_name:en")
    val ciqualFoodNameEn: String? = null,
    @SerializedName("ciqual_food_name:fr")
    val ciqualFoodNameFr: String? = null
)