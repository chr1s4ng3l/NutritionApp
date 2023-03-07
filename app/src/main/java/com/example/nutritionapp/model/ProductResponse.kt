package com.example.nutritionapp.model


import com.google.gson.annotations.SerializedName

data class ProductResponse(
    @SerializedName("count")
    val count: Int? = 0,
    @SerializedName("page")
    val page: Int? = 0,
    @SerializedName("page_count")
    val pageCount: Int? = 0,
    @SerializedName("page_size")
    val pageSize: Int? = 0,
    @SerializedName("products")
    val products: List<Product>? = listOf(),
    @SerializedName("skip")
    val skip: Int? = 0
)