package com.example.nutritionapp.model


import com.google.gson.annotations.SerializedName

data class PreviousData(
    @SerializedName("agribalyse")
    val agribalyse: Agribalyse? = Agribalyse(),
    @SerializedName("grade")
    val grade: String? = "",
    @SerializedName("score")
    val score: Int? = 0
)