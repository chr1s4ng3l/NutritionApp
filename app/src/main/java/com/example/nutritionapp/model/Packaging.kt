package com.example.nutritionapp.model


import com.google.gson.annotations.SerializedName

data class Packaging(
    @SerializedName("non_recyclable_and_non_biodegradable_materials")
    val nonRecyclableAndNonBiodegradableMaterials: Int? = 0,
    @SerializedName("packagings")
    val packagings: List<Packaging>? = listOf(),
    @SerializedName("score")
    val score: Double? = 0.0,
    @SerializedName("value")
    val value: Int? = 0,
    @SerializedName("warning")
    val warning: String? = ""
)