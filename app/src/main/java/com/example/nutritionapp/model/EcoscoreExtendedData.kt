package com.example.nutritionapp.model


import com.google.gson.annotations.SerializedName

data class EcoscoreExtendedData(
    @SerializedName("error")
    val error: String? = "",
    @SerializedName("impact")
    val impact: Impact? = Impact()
)