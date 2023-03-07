package com.example.nutritionapp.model


import com.google.gson.annotations.SerializedName

data class Ingredient(
    @SerializedName("conditions_tags")
    val conditionsTags: List<Any?>? = null,
    @SerializedName("footprint_per_kg")
    val footprintPerKg: Double? = null,
    @SerializedName("matching_tag_id")
    val matchingTagId: String? = null,
    @SerializedName("percent")
    val percent: Double? = null,
    @SerializedName("percent_estimate")
    val percentEstimate: Double? = null,
    @SerializedName("processing_factor")
    val processingFactor: Int? = null,
    @SerializedName("tag_id")
    val tagId: String? = null,
    @SerializedName("tag_type")
    val tagType: String? = null,
    @SerializedName("type")
    val type: Type? = null
)