package com.example.nutritionapp.model


import com.google.gson.annotations.SerializedName

data class DataSources(
    @SerializedName("en:durum_wheat_semolina_pasta")
    val enDurumWheatSemolinaPasta: EnDurumWheatSemolinaPasta? = EnDurumWheatSemolinaPasta(),
    @SerializedName("en:water")
    val enWater: EnWater? = EnWater()
)