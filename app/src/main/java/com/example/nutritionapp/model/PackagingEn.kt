package com.example.nutritionapp.model


import com.google.gson.annotations.SerializedName

data class PackagingEn(
    @SerializedName("angle")
    val angle: Int? = 0,
    @SerializedName("coordinates_image_size")
    val coordinatesImageSize: String? = "",
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
    val whiteMagic: String? = "",
    @SerializedName("x1")
    val x1: String? = "",
    @SerializedName("x2")
    val x2: String? = "",
    @SerializedName("y1")
    val y1: String? = "",
    @SerializedName("y2")
    val y2: String? = ""
)