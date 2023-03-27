package com.example.nutritionapp.data.model


import com.google.gson.annotations.SerializedName

data class Product(
    @SerializedName("categories")
    val categories: String? = "",
    @SerializedName("countries")
    val countries: String? = "",
    @SerializedName("ecoscore_grade")
    val ecoscoreGrade: String? = "",
    @SerializedName("id")
    val id: String? = "",
    @SerializedName("image_thumb_url")
    val imageThumbUrl: String? = "",
    @SerializedName("image_url")
    val imageUrl: String? = "",
    @SerializedName("ingredients_text")
    val ingredientsText: String? = "",
    @SerializedName("nova_group")
    val novaGroup: Int? = 0,
    @SerializedName("nutriscore_grade")
    val nutriscoreGrade: String? = "",
    @SerializedName("product_name")
    val productName: String? = "",
    @SerializedName("quantity")
    val quantity: String? = "",

    )

