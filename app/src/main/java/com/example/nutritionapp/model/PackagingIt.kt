package com.example.nutritionapp.model


import com.google.gson.annotations.SerializedName

data class PackagingIt(
    @SerializedName("angle")
    val angle: Any? = Any(),
    @SerializedName("coordinates_image_size")
    val coordinatesImageSize: String? = "",
    @SerializedName("geometry")
    val geometry: String? = "",
    @SerializedName("imgid")
    val imgid: String? = "",
    @SerializedName("normalize")
    val normalize: Any? = Any(),
    @SerializedName("rev")
    val rev: String? = "",
    @SerializedName("sizes")
    val sizes: Sizes? = Sizes(),
    @SerializedName("white_magic")
    val whiteMagic: Any? = Any(),
    @SerializedName("x1")
    val x1: Any? = Any(),
    @SerializedName("x2")
    val x2: Any? = Any(),
    @SerializedName("y1")
    val y1: Any? = Any(),
    @SerializedName("y2")
    val y2: Any? = Any()
)