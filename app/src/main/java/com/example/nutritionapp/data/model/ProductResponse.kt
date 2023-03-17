package com.example.nutritionapp.data.model


import com.google.gson.annotations.SerializedName

data class ProductResponse(
    @SerializedName("products")
    val products: List<Product>? = listOf()
)