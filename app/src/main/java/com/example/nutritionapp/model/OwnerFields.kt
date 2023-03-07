package com.example.nutritionapp.model


import com.google.gson.annotations.SerializedName

data class OwnerFields(
    @SerializedName("abbreviated_product_name")
    val abbreviatedProductName: Int? = null,
    @SerializedName("abbreviated_product_name_fr")
    val abbreviatedProductNameFr: Int? = null,
    @SerializedName("allergens")
    val allergens: Int? = null,
    @SerializedName("brand_owner")
    val brandOwner: Int? = null,
    @SerializedName("brands")
    val brands: Int? = null,
    @SerializedName("carbohydrates")
    val carbohydrates: Int? = null,
    @SerializedName("categories")
    val categories: Int? = null,
    @SerializedName("conservation_conditions_fr")
    val conservationConditionsFr: Int? = null,
    @SerializedName("countries")
    val countries: Int? = null,
    @SerializedName("customer_service_fr")
    val customerServiceFr: Int? = null,
    @SerializedName("data_sources")
    val dataSources: Int? = null,
    @SerializedName("emb_codes")
    val embCodes: Int? = null,
    @SerializedName("energy")
    val energy: Int? = null,
    @SerializedName("energy-kcal")
    val energyKcal: Int? = null,
    @SerializedName("energy-kj")
    val energyKj: Int? = null,
    @SerializedName("fat")
    val fat: Int? = null,
    @SerializedName("fiber")
    val fiber: Int? = null,
    @SerializedName("fruits-vegetables-nuts")
    val fruitsVegetablesNuts: Int? = null,
    @SerializedName("generic_name_fr")
    val genericNameFr: Int? = null,
    @SerializedName("ingredients_text_fr")
    val ingredientsTextFr: Int? = null,
    @SerializedName("labels")
    val labels: Int? = null,
    @SerializedName("lang")
    val lang: Int? = null,
    @SerializedName("lc")
    val lc: Int? = null,
    @SerializedName("link")
    val link: Int? = null,
    @SerializedName("manufacturing_places")
    val manufacturingPlaces: Int? = null,
    @SerializedName("no_nutrition_data")
    val noNutritionData: Int? = null,
    @SerializedName("nutriscore_grade_producer")
    val nutriscoreGradeProducer: Int? = null,
    @SerializedName("nutrition_data_per")
    val nutritionDataPer: Int? = null,
    @SerializedName("nutrition_data_prepared_per")
    val nutritionDataPreparedPer: Int? = null,
    @SerializedName("obsolete")
    val obsolete: Int? = null,
    @SerializedName("origin_fr")
    val originFr: Int? = null,
    @SerializedName("origins")
    val origins: Int? = null,
    @SerializedName("owner")
    val owner: Int? = null,
    @SerializedName("packaging")
    val packaging: Int? = null,
    @SerializedName("packaging_text_fr")
    val packagingTextFr: Int? = null,
    @SerializedName("preparation_fr")
    val preparationFr: Int? = null,
    @SerializedName("producer_product_id")
    val producerProductId: Int? = null,
    @SerializedName("producer_version_id")
    val producerVersionId: Int? = null,
    @SerializedName("product_name_fr")
    val productNameFr: Int? = null,
    @SerializedName("proteins")
    val proteins: Int? = null,
    @SerializedName("quantity")
    val quantity: Int? = null,
    @SerializedName("recycling_instructions_to_discard_fr")
    val recyclingInstructionsToDiscardFr: Int? = null,
    @SerializedName("salt")
    val salt: Int? = null,
    @SerializedName("saturated-fat")
    val saturatedFat: Int? = null,
    @SerializedName("serving_size")
    val servingSize: Int? = null,
    @SerializedName("stores")
    val stores: Int? = null,
    @SerializedName("sugars")
    val sugars: Int? = null,
    @SerializedName("traces")
    val traces: Int? = null
)