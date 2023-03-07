package com.example.nutritionapp.model


import com.google.gson.annotations.SerializedName

data class Agribalyse(
    @SerializedName("agribalyse_food_code")
    val agribalyseFoodCode: String? = null,
    @SerializedName("agribalyse_proxy_food_code")
    val agribalyseProxyFoodCode: String? = null,
    @SerializedName("co2_agriculture")
    val co2Agriculture: Double? = null,
    @SerializedName("co2_consumption")
    val co2Consumption: Double? = null,
    @SerializedName("co2_distribution")
    val co2Distribution: Double? = null,
    @SerializedName("co2_packaging")
    val co2Packaging: Double? = null,
    @SerializedName("co2_processing")
    val co2Processing: Double? = null,
    @SerializedName("co2_total")
    val co2Total: Double? = null,
    @SerializedName("co2_transportation")
    val co2Transportation: Double? = null,
    @SerializedName("code")
    val code: String? = null,
    @SerializedName("dqr")
    val dqr: String? = null,
    @SerializedName("ef_agriculture")
    val efAgriculture: Double? = null,
    @SerializedName("ef_consumption")
    val efConsumption: Double? = null,
    @SerializedName("ef_distribution")
    val efDistribution: Double? = null,
    @SerializedName("ef_packaging")
    val efPackaging: Double? = null,
    @SerializedName("ef_processing")
    val efProcessing: Double? = null,
    @SerializedName("ef_total")
    val efTotal: Double? = null,
    @SerializedName("ef_transportation")
    val efTransportation: Double? = null,
    @SerializedName("is_beverage")
    val isBeverage: Int? = null,
    @SerializedName("name_en")
    val nameEn: String? = null,
    @SerializedName("name_fr")
    val nameFr: String? = null,
    @SerializedName("score")
    val score: Int? = null,
    @SerializedName("version")
    val version: String? = null,
    @SerializedName("warning")
    val warning: String? = null
)