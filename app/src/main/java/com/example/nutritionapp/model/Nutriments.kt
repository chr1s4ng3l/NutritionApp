package com.example.nutritionapp.model


import com.google.gson.annotations.SerializedName

data class Nutriments(
    @SerializedName("alcohol")
    val alcohol: Int? = null,
    @SerializedName("alcohol_100g")
    val alcohol100g: Int? = null,
    @SerializedName("alcohol_serving")
    val alcoholServing: Int? = null,
    @SerializedName("alcohol_unit")
    val alcoholUnit: String? = null,
    @SerializedName("alcohol_value")
    val alcoholValue: Int? = null,
    @SerializedName("carbohydrates")
    val carbohydrates: Double? = null,
    @SerializedName("carbohydrates_100g")
    val carbohydrates100g: Double? = null,
    @SerializedName("carbohydrates_modifier")
    val carbohydratesModifier: String? = null,
    @SerializedName("carbohydrates_prepared_unit")
    val carbohydratesPreparedUnit: String? = null,
    @SerializedName("carbohydrates_serving")
    val carbohydratesServing: Double? = null,
    @SerializedName("carbohydrates_unit")
    val carbohydratesUnit: String? = null,
    @SerializedName("carbohydrates_value")
    val carbohydratesValue: Double? = null,
    @SerializedName("carbon-footprint-from-known-ingredients_100g")
    val carbonFootprintFromKnownIngredients100g: Double? = null,
    @SerializedName("carbon-footprint-from-known-ingredients_product")
    val carbonFootprintFromKnownIngredientsProduct: Double? = null,
    @SerializedName("carbon-footprint-from-known-ingredients_serving")
    val carbonFootprintFromKnownIngredientsServing: Double? = null,
    @SerializedName("cocoa")
    val cocoa: Double? = null,
    @SerializedName("cocoa_100g")
    val cocoa100g: Double? = null,
    @SerializedName("cocoa_label")
    val cocoaLabel: String? = null,
    @SerializedName("cocoa_serving")
    val cocoaServing: Double? = null,
    @SerializedName("cocoa_unit")
    val cocoaUnit: String? = null,
    @SerializedName("cocoa_value")
    val cocoaValue: Double? = null,
    @SerializedName("energy")
    val energy: Double? = null,
    @SerializedName("energy_100g")
    val energy100g: Double? = null,
    @SerializedName("energy-kcal")
    val energyKcal: Double? = null,
    @SerializedName("energy-kcal_100g")
    val energyKcal100g: Double? = null,
    @SerializedName("energy-kcal_prepared_unit")
    val energyKcalPreparedUnit: String? = null,
    @SerializedName("energy-kcal_serving")
    val energyKcalServing: Double? = null,
    @SerializedName("energy-kcal_unit")
    val energyKcalUnit: String? = null,
    @SerializedName("energy-kcal_value")
    val energyKcalValue: Double? = null,
    @SerializedName("energy-kcal_value_computed")
    val energyKcalValueComputed: Double? = null,
    @SerializedName("energy-kj")
    val energyKj: Double? = null,
    @SerializedName("energy-kj_100g")
    val energyKj100g: Double? = null,
    @SerializedName("energy-kj_prepared_unit")
    val energyKjPreparedUnit: String? = null,
    @SerializedName("energy-kj_serving")
    val energyKjServing: Double? = null,
    @SerializedName("energy-kj_unit")
    val energyKjUnit: String? = null,
    @SerializedName("energy-kj_value")
    val energyKjValue: Double? = null,
    @SerializedName("energy-kj_value_computed")
    val energyKjValueComputed: Double? = null,
    @SerializedName("energy_prepared_unit")
    val energyPreparedUnit: String? = null,
    @SerializedName("energy_serving")
    val energyServing: Double? = null,
    @SerializedName("energy_unit")
    val energyUnit: String? = null,
    @SerializedName("energy_value")
    val energyValue: Double? = null,
    @SerializedName("fat")
    val fat: Double? = null,
    @SerializedName("fat_100g")
    val fat100g: Double? = null,
    @SerializedName("fat_prepared_unit")
    val fatPreparedUnit: String? = null,
    @SerializedName("fat_serving")
    val fatServing: Double? = null,
    @SerializedName("fat_unit")
    val fatUnit: String? = null,
    @SerializedName("fat_value")
    val fatValue: Double? = null,
    @SerializedName("fiber")
    val fiber: Double? = null,
    @SerializedName("fiber_100g")
    val fiber100g: Double? = null,
    @SerializedName("fiber_modifier")
    val fiberModifier: String? = null,
    @SerializedName("fiber_prepared_unit")
    val fiberPreparedUnit: String? = null,
    @SerializedName("fiber_serving")
    val fiberServing: Double? = null,
    @SerializedName("fiber_unit")
    val fiberUnit: String? = null,
    @SerializedName("fiber_value")
    val fiberValue: Double? = null,
    @SerializedName("fruits-vegetables-nuts")
    val fruitsVegetablesNuts: Double? = null,
    @SerializedName("fruits-vegetables-nuts_100g")
    val fruitsVegetablesNuts100g: Double? = null,
    @SerializedName("fruits-vegetables-nuts-estimate")
    val fruitsVegetablesNutsEstimate: Int? = null,
    @SerializedName("fruits-vegetables-nuts-estimate_100g")
    val fruitsVegetablesNutsEstimate100g: Int? = null,
    @SerializedName("fruits-vegetables-nuts-estimate-from-ingredients_100g")
    val fruitsVegetablesNutsEstimateFromIngredients100g: Double? = null,
    @SerializedName("fruits-vegetables-nuts-estimate-from-ingredients_serving")
    val fruitsVegetablesNutsEstimateFromIngredientsServing: Double? = null,
    @SerializedName("fruits-vegetables-nuts-estimate_label")
    val fruitsVegetablesNutsEstimateLabel: String? = null,
    @SerializedName("fruits-vegetables-nuts-estimate_serving")
    val fruitsVegetablesNutsEstimateServing: Int? = null,
    @SerializedName("fruits-vegetables-nuts-estimate_unit")
    val fruitsVegetablesNutsEstimateUnit: String? = null,
    @SerializedName("fruits-vegetables-nuts-estimate_value")
    val fruitsVegetablesNutsEstimateValue: Int? = null,
    @SerializedName("fruits-vegetables-nuts_label")
    val fruitsVegetablesNutsLabel: String? = null,
    @SerializedName("fruits-vegetables-nuts_serving")
    val fruitsVegetablesNutsServing: Double? = null,
    @SerializedName("fruits-vegetables-nuts_unit")
    val fruitsVegetablesNutsUnit: String? = null,
    @SerializedName("fruits-vegetables-nuts_value")
    val fruitsVegetablesNutsValue: Double? = null,
    @SerializedName("iron")
    val iron: Double? = null,
    @SerializedName("iron_100g")
    val iron100g: Double? = null,
    @SerializedName("iron_label")
    val ironLabel: String? = null,
    @SerializedName("iron_serving")
    val ironServing: Double? = null,
    @SerializedName("iron_unit")
    val ironUnit: String? = null,
    @SerializedName("iron_value")
    val ironValue: Double? = null,
    @SerializedName("magnesium")
    val magnesium: Double? = null,
    @SerializedName("magnesium_100g")
    val magnesium100g: Double? = null,
    @SerializedName("magnesium_label")
    val magnesiumLabel: String? = null,
    @SerializedName("magnesium_serving")
    val magnesiumServing: Double? = null,
    @SerializedName("magnesium_unit")
    val magnesiumUnit: String? = null,
    @SerializedName("magnesium_value")
    val magnesiumValue: Int? = null,
    @SerializedName("nova-group")
    val novaGroup: Int? = null,
    @SerializedName("nova-group_100g")
    val novaGroup100g: Int? = null,
    @SerializedName("nova-group_serving")
    val novaGroupServing: Int? = null,
    @SerializedName("nutrition-score-fr")
    val nutritionScoreFr: Int? = null,
    @SerializedName("nutrition-score-fr_100g")
    val nutritionScoreFr100g: Int? = null,
    @SerializedName("phosphorus")
    val phosphorus: Double? = null,
    @SerializedName("phosphorus_100g")
    val phosphorus100g: Double? = null,
    @SerializedName("phosphorus_label")
    val phosphorusLabel: String? = null,
    @SerializedName("phosphorus_serving")
    val phosphorusServing: Double? = null,
    @SerializedName("phosphorus_unit")
    val phosphorusUnit: String? = null,
    @SerializedName("phosphorus_value")
    val phosphorusValue: Int? = null,
    @SerializedName("proteins")
    val proteins: Double? = null,
    @SerializedName("proteins_100g")
    val proteins100g: Double? = null,
    @SerializedName("proteins_prepared_unit")
    val proteinsPreparedUnit: String? = null,
    @SerializedName("proteins_serving")
    val proteinsServing: Double? = null,
    @SerializedName("proteins_unit")
    val proteinsUnit: String? = null,
    @SerializedName("proteins_value")
    val proteinsValue: Double? = null,
    @SerializedName("salt")
    val salt: Double? = null,
    @SerializedName("salt_100g")
    val salt100g: Double? = null,
    @SerializedName("salt_prepared_unit")
    val saltPreparedUnit: String? = null,
    @SerializedName("salt_serving")
    val saltServing: Double? = null,
    @SerializedName("salt_unit")
    val saltUnit: String? = null,
    @SerializedName("salt_value")
    val saltValue: Double? = null,
    @SerializedName("saturated-fat")
    val saturatedFat: Double? = null,
    @SerializedName("saturated-fat_100g")
    val saturatedFat100g: Double? = null,
    @SerializedName("saturated-fat_prepared_unit")
    val saturatedFatPreparedUnit: String? = null,
    @SerializedName("saturated-fat_serving")
    val saturatedFatServing: Double? = null,
    @SerializedName("saturated-fat_unit")
    val saturatedFatUnit: String? = null,
    @SerializedName("saturated-fat_value")
    val saturatedFatValue: Double? = null,
    @SerializedName("sodium")
    val sodium: Double? = null,
    @SerializedName("sodium_100g")
    val sodium100g: Double? = null,
    @SerializedName("sodium_prepared_unit")
    val sodiumPreparedUnit: String? = null,
    @SerializedName("sodium_serving")
    val sodiumServing: Double? = null,
    @SerializedName("sodium_unit")
    val sodiumUnit: String? = null,
    @SerializedName("sodium_value")
    val sodiumValue: Double? = null,
    @SerializedName("sugars")
    val sugars: Double? = null,
    @SerializedName("sugars_100g")
    val sugars100g: Double? = null,
    @SerializedName("sugars_prepared_unit")
    val sugarsPreparedUnit: String? = null,
    @SerializedName("sugars_serving")
    val sugarsServing: Double? = null,
    @SerializedName("sugars_unit")
    val sugarsUnit: String? = null,
    @SerializedName("sugars_value")
    val sugarsValue: Double? = null,
    @SerializedName("trans-fat")
    val transFat: Double? = null,
    @SerializedName("trans-fat_100g")
    val transFat100g: Double? = null,
    @SerializedName("trans-fat_label")
    val transFatLabel: String? = null,
    @SerializedName("trans-fat_serving")
    val transFatServing: Double? = null,
    @SerializedName("trans-fat_unit")
    val transFatUnit: String? = null,
    @SerializedName("trans-fat_value")
    val transFatValue: Double? = null,
    @SerializedName("vitamin-b1")
    val vitaminB1: Double? = null,
    @SerializedName("vitamin-b1_100g")
    val vitaminB1100g: Double? = null,
    @SerializedName("vitamin-b1_label")
    val vitaminB1Label: String? = null,
    @SerializedName("vitamin-b1_serving")
    val vitaminB1Serving: Double? = null,
    @SerializedName("vitamin-b1_unit")
    val vitaminB1Unit: String? = null,
    @SerializedName("vitamin-b1_value")
    val vitaminB1Value: Double? = null,
    @SerializedName("vitamin-b2")
    val vitaminB2: Double? = null,
    @SerializedName("vitamin-b2_100g")
    val vitaminB2100g: Double? = null,
    @SerializedName("vitamin-b2_label")
    val vitaminB2Label: String? = null,
    @SerializedName("vitamin-b2_serving")
    val vitaminB2Serving: Double? = null,
    @SerializedName("vitamin-b2_unit")
    val vitaminB2Unit: String? = null,
    @SerializedName("vitamin-b2_value")
    val vitaminB2Value: Double? = null,
    @SerializedName("vitamin-b9")
    val vitaminB9: Double? = null,
    @SerializedName("vitamin-b9_100g")
    val vitaminB9100g: Double? = null,
    @SerializedName("vitamin-b9_label")
    val vitaminB9Label: String? = null,
    @SerializedName("vitamin-b9_serving")
    val vitaminB9Serving: Double? = null,
    @SerializedName("vitamin-b9_unit")
    val vitaminB9Unit: String? = null,
    @SerializedName("vitamin-b9_value")
    val vitaminB9Value: Int? = null,
    @SerializedName("vitamin-pp")
    val vitaminPp: Double? = null,
    @SerializedName("vitamin-pp_100g")
    val vitaminPp100g: Double? = null,
    @SerializedName("vitamin-pp_label")
    val vitaminPpLabel: String? = null,
    @SerializedName("vitamin-pp_serving")
    val vitaminPpServing: Double? = null,
    @SerializedName("vitamin-pp_unit")
    val vitaminPpUnit: String? = null,
    @SerializedName("vitamin-pp_value")
    val vitaminPpValue: Int? = null,
    @SerializedName("zinc")
    val zinc: Double? = null,
    @SerializedName("zinc_100g")
    val zinc100g: Double? = null,
    @SerializedName("zinc_label")
    val zincLabel: String? = null,
    @SerializedName("zinc_serving")
    val zincServing: Double? = null,
    @SerializedName("zinc_unit")
    val zincUnit: String? = null,
    @SerializedName("zinc_value")
    val zincValue: Double? = null
)