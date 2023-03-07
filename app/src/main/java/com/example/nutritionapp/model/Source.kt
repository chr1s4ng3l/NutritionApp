package com.example.nutritionapp.model


import com.google.gson.annotations.SerializedName

data class Source(
    @SerializedName("fields")
    val fields: List<String?>? = null,
    @SerializedName("id")
    val id: String? = null,
    @SerializedName("images")
    val images: List<String?>? = null,
    @SerializedName("import_t")
    val importT: Int? = null,
    @SerializedName("manufacturer")
    val manufacturer: Int? = null,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("source_licence")
    val sourceLicence: String? = null,
    @SerializedName("source_licence_url")
    val sourceLicenceUrl: String? = null,
    @SerializedName("url")
    val url: String? = null
)