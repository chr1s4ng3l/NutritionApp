package com.example.nutritionapp.model


import com.google.gson.annotations.SerializedName

data class OriginsOfIngredients(
    @SerializedName("aggregated_origins")
    val aggregatedOrigins: List<AggregatedOrigin?>? = null,
    @SerializedName("epi_score")
    val epiScore: Int? = null,
    @SerializedName("epi_value")
    val epiValue: Int? = null,
    @SerializedName("origins_from_origins_field")
    val originsFromOriginsField: List<String?>? = null,
    @SerializedName("transportation_score")
    val transportationScore: Int? = null,
    @SerializedName("transportation_scores")
    val transportationScores: TransportationScores? = null,
    @SerializedName("transportation_value")
    val transportationValue: Int? = null,
    @SerializedName("transportation_values")
    val transportationValues: TransportationValues? = null,
    @SerializedName("value")
    val value: Int? = null,
    @SerializedName("values")
    val values: Values? = null,
    @SerializedName("warning")
    val warning: String? = null
)