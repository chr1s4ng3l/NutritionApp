package com.example.nutritionapp.model


import com.google.gson.annotations.SerializedName

data class EcoscoreData(
    @SerializedName("adjustments")
    val adjustments: Adjustments? = Adjustments(),
    @SerializedName("agribalyse")
    val agribalyse: Agribalyse? = Agribalyse(),
    @SerializedName("ecoscore_not_applicable_for_category")
    val ecoscoreNotApplicableForCategory: String? = "",
    @SerializedName("grade")
    val grade: String? = "",
    @SerializedName("grades")
    val grades: Grades? = Grades(),
    @SerializedName("missing")
    val missing: Missing? = Missing(),
    @SerializedName("missing_agribalyse_match_warning")
    val missingAgribalyseMatchWarning: Int? = 0,
    @SerializedName("missing_data_warning")
    val missingDataWarning: Int? = 0,
    @SerializedName("missing_key_data")
    val missingKeyData: Int? = 0,
    @SerializedName("previous_data")
    val previousData: PreviousData? = PreviousData(),
    @SerializedName("score")
    val score: Int? = 0,
    @SerializedName("scores")
    val scores: Scores? = Scores(),
    @SerializedName("status")
    val status: String? = ""
)