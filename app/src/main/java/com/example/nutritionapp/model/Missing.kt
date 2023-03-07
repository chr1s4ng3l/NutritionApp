package com.example.nutritionapp.model


import com.google.gson.annotations.SerializedName

data class Missing(
    @SerializedName("agb_category")
    val agbCategory: Int? = null,
    @SerializedName("ingredients")
    val ingredients: Int? = null,
    @SerializedName("labels")
    val labels: Int? = null,
    @SerializedName("origins")
    val origins: Int? = null,
    @SerializedName("packagings")
    val packagings: Int? = null
)