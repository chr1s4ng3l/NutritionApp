package com.example.nutritionapp.model


import com.google.gson.annotations.SerializedName

data class CategoriesProperties(
    @SerializedName("agribalyse_food_code:en")
    val agribalyseFoodCodeEn: String? = null,
    @SerializedName("agribalyse_proxy_food_code:en")
    val agribalyseProxyFoodCodeEn: String? = null,
    @SerializedName("ciqual_food_code:en")
    val ciqualFoodCodeEn: String? = null
)