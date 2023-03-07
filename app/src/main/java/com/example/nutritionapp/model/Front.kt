package com.example.nutritionapp.model


import com.google.gson.annotations.SerializedName

data class Front(
    @SerializedName("geometry")
    val geometry: String? = "",
    @SerializedName("imgid")
    val imgid: String? = "",
    @SerializedName("normalize")
    val normalize: String? = "",
    @SerializedName("rev")
    val rev: String? = "",
    @SerializedName("sizes")
    val sizes: Sizes? = Sizes(),
    @SerializedName("white_magic")
    val whiteMagic: String? = ""
)