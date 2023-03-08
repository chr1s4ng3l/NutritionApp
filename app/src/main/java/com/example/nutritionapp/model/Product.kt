package com.example.nutritionapp.model


import com.google.gson.annotations.SerializedName

data class Product(
//    @SerializedName("abbreviated_product_name")
//    val abbreviatedProductName: String? = "",
//    @SerializedName("abbreviated_product_name_fr")
//    val abbreviatedProductNameFr: String? = "",
//    @SerializedName("abbreviated_product_name_fr_imported")
//    val abbreviatedProductNameFrImported: String? = "",
//    @SerializedName("abbreviated_product_name_imported")
//    val abbreviatedProductNameImported: String? = "",
//    @SerializedName("added_countries_tags")
//    val addedCountriesTags: List<Any>? = listOf(),
//    @SerializedName("additives_debug_tags")
//    val additivesDebugTags: List<String>? = listOf(),
//    @SerializedName("additives_n")
//    val additivesN: Int? = 0,
//    @SerializedName("additives_old_n")
//    val additivesOldN: Int? = 0,
//    @SerializedName("additives_old_tags")
//    val additivesOldTags: List<String>? = listOf(),
//    @SerializedName("additives_original_tags")
//    val additivesOriginalTags: List<String>? = listOf(),
//    @SerializedName("additives_prev_original_tags")
//    val additivesPrevOriginalTags: List<String>? = listOf(),
//    @SerializedName("additives_tags")
//    val additivesTags: List<String>? = listOf(),
//    @SerializedName("allergens")
//    val allergens: String? = "",
//    @SerializedName("allergens_from_ingredients")
//    val allergensFromIngredients: String? = "",
//    @SerializedName("allergens_from_user")
//    val allergensFromUser: String? = "",
//    @SerializedName("allergens_hierarchy")
//    val allergensHierarchy: List<String>? = listOf(),
//    @SerializedName("allergens_imported")
//    val allergensImported: String? = "",
//    @SerializedName("allergens_lc")
//    val allergensLc: String? = "",
//    @SerializedName("allergens_tags")
//    val allergensTags: List<String>? = listOf(),
//    @SerializedName("amino_acids_prev_tags")
//    val aminoAcidsPrevTags: List<Any>? = listOf(),
//    @SerializedName("amino_acids_tags")
//    val aminoAcidsTags: List<Any>? = listOf(),
//    @SerializedName("brand_owner")
//    val brandOwner: String? = "",
//    @SerializedName("brand_owner_imported")
//    val brandOwnerImported: String? = "",
//    @SerializedName("brands")
//    val brands: String? = "",
//    @SerializedName("brands_imported")
//    val brandsImported: String? = "",
//    @SerializedName("brands_tags")
//    val brandsTags: List<String>? = listOf(),
//    @SerializedName("carbon_footprint_from_known_ingredients_debug")
//    val carbonFootprintFromKnownIngredientsDebug: String? = "",
//    @SerializedName("carbon_footprint_percent_of_known_ingredients")
//    val carbonFootprintPercentOfKnownIngredients: Double? = 0.0,
//    @SerializedName("categories")
//    val categories: String? = "",
//    @SerializedName("categories_hierarchy")
//    val categoriesHierarchy: List<String>? = listOf(),
//    @SerializedName("categories_imported")
//    val categoriesImported: String? = "",
//    @SerializedName("categories_lc")
//    val categoriesLc: String? = "",
//    @SerializedName("categories_old")
//    val categoriesOld: String? = "",
//    @SerializedName("categories_properties")
//    val categoriesProperties: CategoriesProperties? = CategoriesProperties(),
//    @SerializedName("categories_properties_tags")
//    val categoriesPropertiesTags: List<String>? = listOf(),
//    @SerializedName("categories_tags")
//    val categoriesTags: List<String>? = listOf(),
//    @SerializedName("category_properties")
//    val categoryProperties: CategoryProperties? = CategoryProperties(),
//    @SerializedName("checked")
//    val checked: String? = "",
//    @SerializedName("checkers")
//    val checkers: List<Any>? = listOf(),
//    @SerializedName("checkers_tags")
//    val checkersTags: List<String>? = listOf(),
//    @SerializedName("ciqual_food_name_tags")
//    val ciqualFoodNameTags: List<String>? = listOf(),
//    @SerializedName("cities_tags")
//    val citiesTags: List<String>? = listOf(),
//    @SerializedName("code")
//    val code: String? = "",
//    @SerializedName("codes_tags")
//    val codesTags: List<String>? = listOf(),
//    @SerializedName("compared_to_category")
//    val comparedToCategory: String? = "",
//    @SerializedName("complete")
//    val complete: Int? = 0,
//    @SerializedName("completed_t")
//    val completedT: Int? = 0,
//    @SerializedName("completeness")
//    val completeness: Double? = 0.0,
//    @SerializedName("conservation_conditions")
//    val conservationConditions: String? = "",
//    @SerializedName("conservation_conditions_fr")
//    val conservationConditionsFr: String? = "",
//    @SerializedName("conservation_conditions_fr_imported")
//    val conservationConditionsFrImported: String? = "",
//    @SerializedName("correctors")
//    val correctors: List<String>? = listOf(),
//    @SerializedName("correctors_tags")
//    val correctorsTags: List<String>? = listOf(),
//    @SerializedName("countries")
//    val countries: String? = "",
//    @SerializedName("countries_beforescanbot")
//    val countriesBeforescanbot: String? = "",
//    @SerializedName("countries_hierarchy")
//    val countriesHierarchy: List<String>? = listOf(),
//    @SerializedName("countries_imported")
//    val countriesImported: String? = "",
//    @SerializedName("countries_lc")
//    val countriesLc: String? = "",
//    @SerializedName("countries_tags")
//    val countriesTags: List<String>? = listOf(),
//    @SerializedName("created_t")
//    val createdT: Int? = 0,
//    @SerializedName("creator")
//    val creator: String? = "",
//    @SerializedName("customer_service")
//    val customerService: String? = "",
//    @SerializedName("customer_service_fr")
//    val customerServiceFr: String? = "",
//    @SerializedName("customer_service_fr_imported")
//    val customerServiceFrImported: String? = "",
//    @SerializedName("data_quality_bugs_tags")
//    val dataQualityBugsTags: List<Any>? = listOf(),
//    @SerializedName("data_quality_errors_tags")
//    val dataQualityErrorsTags: List<Any>? = listOf(),
//    @SerializedName("data_quality_info_tags")
//    val dataQualityInfoTags: List<String>? = listOf(),
//    @SerializedName("data_quality_tags")
//    val dataQualityTags: List<String>? = listOf(),
//    @SerializedName("data_quality_warnings_tags")
//    val dataQualityWarningsTags: List<String>? = listOf(),
//    @SerializedName("data_sources")
//    val dataSources: String? = "",
//    @SerializedName("data_sources_imported")
//    val dataSourcesImported: String? = "",
//    @SerializedName("data_sources_tags")
//    val dataSourcesTags: List<String>? = listOf(),
//    @SerializedName("debug_param_sorted_langs")
//    val debugParamSortedLangs: List<String>? = listOf(),
//    @SerializedName("debug_tags")
//    val debugTags: List<String>? = listOf(),
//    @SerializedName("downgraded")
//    val downgraded: String? = "",
//    @SerializedName("ecoscore_data")
//    val ecoscoreData: EcoscoreData? = EcoscoreData(),
//    @SerializedName("ecoscore_extended_data")
//    val ecoscoreExtendedData: EcoscoreExtendedData? = EcoscoreExtendedData(),
//    @SerializedName("ecoscore_extended_data_version")
//    val ecoscoreExtendedDataVersion: String? = "",
//    @SerializedName("ecoscore_grade")
//    val ecoscoreGrade: String? = "",
//    @SerializedName("ecoscore_score")
//    val ecoscoreScore: Int? = 0,
//    @SerializedName("ecoscore_tags")
//    val ecoscoreTags: List<String>? = listOf(),
//    @SerializedName("editors")
//    val editors: List<String>? = listOf(),
//    @SerializedName("editors_tags")
//    val editorsTags: List<String>? = listOf(),
//    @SerializedName("emb_codes")
//    val embCodes: String? = "",
//    @SerializedName("emb_codes_20141016")
//    val embCodes20141016: String? = "",
//    @SerializedName("emb_codes_imported")
//    val embCodesImported: String? = "",
//    @SerializedName("emb_codes_orig")
//    val embCodesOrig: String? = "",
//    @SerializedName("emb_codes_tags")
//    val embCodesTags: List<String>? = listOf(),
//    @SerializedName("entry_dates_tags")
//    val entryDatesTags: List<String>? = listOf(),
//    @SerializedName("environment_impact_level")
//    val environmentImpactLevel: String? = "",
//    @SerializedName("environment_impact_level_tags")
//    val environmentImpactLevelTags: List<Any>? = listOf(),
//    @SerializedName("expiration_date")
//    val expirationDate: String? = "",
//    @SerializedName("food_groups")
//    val foodGroups: String? = "",
//    @SerializedName("food_groups_tags")
//    val foodGroupsTags: List<String>? = listOf(),
//    @SerializedName("forest_footprint_data")
//    val forestFootprintData: ForestFootprintData? = ForestFootprintData(),
//    @SerializedName("fruits-vegetables-nuts_100g_estimate")
//    val fruitsVegetablesNuts100gEstimate: Int? = 0,
//    @SerializedName("generic_name")
//    val genericName: String? = "",
//    @SerializedName("generic_name_ar")
//    val genericNameAr: String? = "",
//    @SerializedName("generic_name_bg")
//    val genericNameBg: String? = "",
//    @SerializedName("generic_name_ca")
//    val genericNameCa: String? = "",
//    @SerializedName("generic_name_ch")
//    val genericNameCh: String? = "",
//    @SerializedName("generic_name_da")
//    val genericNameDa: String? = "",
//    @SerializedName("generic_name_de")
//    val genericNameDe: String? = "",
//    @SerializedName("generic_name_en")
//    val genericNameEn: String? = "",
//    @SerializedName("generic_name_es")
//    val genericNameEs: String? = "",
//    @SerializedName("generic_name_fr")
//    val genericNameFr: String? = "",
//    @SerializedName("generic_name_fr_imported")
//    val genericNameFrImported: String? = "",
//    @SerializedName("generic_name_id")
//    val genericNameId: String? = "",
//    @SerializedName("generic_name_it")
//    val genericNameIt: String? = "",
//    @SerializedName("generic_name_ko")
//    val genericNameKo: String? = "",
//    @SerializedName("generic_name_nb")
//    val genericNameNb: String? = "",
//    @SerializedName("generic_name_nl")
//    val genericNameNl: String? = "",
//    @SerializedName("generic_name_no")
//    val genericNameNo: String? = "",
//    @SerializedName("generic_name_pl")
//    val genericNamePl: String? = "",
//    @SerializedName("generic_name_pt")
//    val genericNamePt: String? = "",
//    @SerializedName("generic_name_ru")
//    val genericNameRu: String? = "",
//    @SerializedName("generic_name_sr")
//    val genericNameSr: String? = "",
//    @SerializedName("generic_name_sv")
//    val genericNameSv: String? = "",
//    @SerializedName("generic_name_xx")
//    val genericNameXx: String? = "",
//    @SerializedName("generic_name_xx_debug_tags")
//    val genericNameXxDebugTags: List<Any>? = listOf(),
//    @SerializedName("generic_name_zh")
//    val genericNameZh: String? = "",
//    @SerializedName("grades")
//    val grades: Grades? = Grades(),
//    @SerializedName("id")
//    val id: String? = "",
//    @SerializedName("image_front_small_url")
//    val imageFrontSmallUrl: String? = "",
//    @SerializedName("image_front_thumb_url")
//    val imageFrontThumbUrl: String? = "",
//    @SerializedName("image_front_url")
//    val imageFrontUrl: String? = "",
//    @SerializedName("image_ingredients_small_url")
//    val imageIngredientsSmallUrl: String? = "",
//    @SerializedName("image_ingredients_thumb_url")
//    val imageIngredientsThumbUrl: String? = "",
//    @SerializedName("image_ingredients_url")
//    val imageIngredientsUrl: String? = "",
//    @SerializedName("image_nutrition_small_url")
//    val imageNutritionSmallUrl: String? = "",
//    @SerializedName("image_nutrition_thumb_url")
//    val imageNutritionThumbUrl: String? = "",
//    @SerializedName("image_nutrition_url")
//    val imageNutritionUrl: String? = "",
//    @SerializedName("image_packaging_small_url")
//    val imagePackagingSmallUrl: String? = "",
//    @SerializedName("image_packaging_thumb_url")
//    val imagePackagingThumbUrl: String? = "",
//    @SerializedName("image_packaging_url")
//    val imagePackagingUrl: String? = "",
//    @SerializedName("image_small_url")
//    val imageSmallUrl: String? = "",
    @SerializedName("image_thumb_url")
    val imageThumbUrl: String? = "",
    @SerializedName("image_url")
    val imageUrl: String? = "",
//    @SerializedName("informers")
//    val informers: List<String>? = listOf(),
//    @SerializedName("informers_tags")
//    val informersTags: List<String>? = listOf(),
//    @SerializedName("ingredients")
//    val ingredients: List<Ingredient>? = listOf(),
//    @SerializedName("ingredients_analysis_tags")
//    val ingredientsAnalysisTags: List<String>? = listOf(),
//    @SerializedName("ingredients_debug")
//    val ingredientsDebug: List<String>? = listOf(),
//    @SerializedName("ingredients_from_or_that_may_be_from_palm_oil_n")
//    val ingredientsFromOrThatMayBeFromPalmOilN: Int? = 0,
//    @SerializedName("ingredients_from_palm_oil_n")
//    val ingredientsFromPalmOilN: Int? = 0,
//    @SerializedName("ingredients_from_palm_oil_tags")
//    val ingredientsFromPalmOilTags: List<Any>? = listOf(),
//    @SerializedName("ingredients_hierarchy")
//    val ingredientsHierarchy: List<String>? = listOf(),
//    @SerializedName("ingredients_ids_debug")
//    val ingredientsIdsDebug: List<String>? = listOf(),
//    @SerializedName("ingredients_n")
//    val ingredientsN: Int? = 0,
//    @SerializedName("ingredients_n_tags")
//    val ingredientsNTags: List<String>? = listOf(),
//    @SerializedName("ingredients_original_tags")
//    val ingredientsOriginalTags: List<String>? = listOf(),
//    @SerializedName("ingredients_percent_analysis")
//    val ingredientsPercentAnalysis: Int? = 0,
//    @SerializedName("ingredients_tags")
//    val ingredientsTags: List<String>? = listOf(),
//    @SerializedName("ingredients_text")
//    val ingredientsText: String? = "",
//    @SerializedName("ingredients_text_ar")
//    val ingredientsTextAr: String? = "",
//    @SerializedName("ingredients_text_bg")
//    val ingredientsTextBg: String? = "",
//    @SerializedName("ingredients_text_ca")
//    val ingredientsTextCa: String? = "",
//    @SerializedName("ingredients_text_ch")
//    val ingredientsTextCh: String? = "",
//    @SerializedName("ingredients_text_da")
//    val ingredientsTextDa: String? = "",
//    @SerializedName("ingredients_text_de")
//    val ingredientsTextDe: String? = "",
//    @SerializedName("ingredients_text_de_ocr_1544388405")
//    val ingredientsTextDeOcr1544388405: String? = "",
//    @SerializedName("ingredients_text_de_ocr_1544388405_result")
//    val ingredientsTextDeOcr1544388405Result: String? = "",
//    @SerializedName("ingredients_text_debug")
//    val ingredientsTextDebug: String? = "",
//    @SerializedName("ingredients_text_debug_tags")
//    val ingredientsTextDebugTags: List<Any>? = listOf(),
//    @SerializedName("ingredients_text_en")
//    val ingredientsTextEn: String? = "",
//    @SerializedName("ingredients_text_en_imported")
//    val ingredientsTextEnImported: String? = "",
//    @SerializedName("ingredients_text_en_ocr_1615153764")
//    val ingredientsTextEnOcr1615153764: String? = "",
//    @SerializedName("ingredients_text_en_ocr_1615153764_result")
//    val ingredientsTextEnOcr1615153764Result: String? = "",
//    @SerializedName("ingredients_text_en_ocr_1642445989")
//    val ingredientsTextEnOcr1642445989: String? = "",
//    @SerializedName("ingredients_text_en_ocr_1642445989_result")
//    val ingredientsTextEnOcr1642445989Result: String? = "",
//    @SerializedName("ingredients_text_en_ocr_1643128902")
//    val ingredientsTextEnOcr1643128902: String? = "",
//    @SerializedName("ingredients_text_en_ocr_1643128902_result")
//    val ingredientsTextEnOcr1643128902Result: String? = "",
//    @SerializedName("ingredients_text_en_ocr_1657222706")
//    val ingredientsTextEnOcr1657222706: String? = "",
//    @SerializedName("ingredients_text_en_ocr_1657222706_result")
//    val ingredientsTextEnOcr1657222706Result: String? = "",
//    @SerializedName("ingredients_text_es")
//    val ingredientsTextEs: String? = "",
//    @SerializedName("ingredients_text_fr")
//    val ingredientsTextFr: String? = "",
//    @SerializedName("ingredients_text_fr_imported")
//    val ingredientsTextFrImported: String? = "",
//    @SerializedName("ingredients_text_fr_ocr_1547241845")
//    val ingredientsTextFrOcr1547241845: String? = "",
//    @SerializedName("ingredients_text_fr_ocr_1547241845_result")
//    val ingredientsTextFrOcr1547241845Result: String? = "",
//    @SerializedName("ingredients_text_fr_ocr_1552071960")
//    val ingredientsTextFrOcr1552071960: String? = "",
//    @SerializedName("ingredients_text_fr_ocr_1552071960_result")
//    val ingredientsTextFrOcr1552071960Result: String? = "",
//    @SerializedName("ingredients_text_fr_ocr_1563700160")
//    val ingredientsTextFrOcr1563700160: String? = "",
//    @SerializedName("ingredients_text_fr_ocr_1563700160_result")
//    val ingredientsTextFrOcr1563700160Result: String? = "",
//    @SerializedName("ingredients_text_fr_ocr_1642445989")
//    val ingredientsTextFrOcr1642445989: String? = "",
//    @SerializedName("ingredients_text_fr_ocr_1642445989_result")
//    val ingredientsTextFrOcr1642445989Result: String? = "",
//    @SerializedName("ingredients_text_fr_ocr_1643128902")
//    val ingredientsTextFrOcr1643128902: String? = "",
//    @SerializedName("ingredients_text_fr_ocr_1643128902_result")
//    val ingredientsTextFrOcr1643128902Result: String? = "",
//    @SerializedName("ingredients_text_id")
//    val ingredientsTextId: String? = "",
//    @SerializedName("ingredients_text_it")
//    val ingredientsTextIt: String? = "",
//    @SerializedName("ingredients_text_ko")
//    val ingredientsTextKo: String? = "",
//    @SerializedName("ingredients_text_nb")
//    val ingredientsTextNb: String? = "",
//    @SerializedName("ingredients_text_nl")
//    val ingredientsTextNl: String? = "",
//    @SerializedName("ingredients_text_no")
//    val ingredientsTextNo: String? = "",
//    @SerializedName("ingredients_text_pl")
//    val ingredientsTextPl: String? = "",
//    @SerializedName("ingredients_text_pt")
//    val ingredientsTextPt: String? = "",
//    @SerializedName("ingredients_text_ru")
//    val ingredientsTextRu: String? = "",
//    @SerializedName("ingredients_text_sr")
//    val ingredientsTextSr: String? = "",
//    @SerializedName("ingredients_text_sv")
//    val ingredientsTextSv: String? = "",
//    @SerializedName("ingredients_text_with_allergens")
//    val ingredientsTextWithAllergens: String? = "",
//    @SerializedName("ingredients_text_with_allergens_ar")
//    val ingredientsTextWithAllergensAr: String? = "",
//    @SerializedName("ingredients_text_with_allergens_bg")
//    val ingredientsTextWithAllergensBg: String? = "",
//    @SerializedName("ingredients_text_with_allergens_ca")
//    val ingredientsTextWithAllergensCa: String? = "",
//    @SerializedName("ingredients_text_with_allergens_ch")
//    val ingredientsTextWithAllergensCh: String? = "",
//    @SerializedName("ingredients_text_with_allergens_da")
//    val ingredientsTextWithAllergensDa: String? = "",
//    @SerializedName("ingredients_text_with_allergens_de")
//    val ingredientsTextWithAllergensDe: String? = "",
//    @SerializedName("ingredients_text_with_allergens_en")
//    val ingredientsTextWithAllergensEn: String? = "",
//    @SerializedName("ingredients_text_with_allergens_es")
//    val ingredientsTextWithAllergensEs: String? = "",
//    @SerializedName("ingredients_text_with_allergens_fr")
//    val ingredientsTextWithAllergensFr: String? = "",
//    @SerializedName("ingredients_text_with_allergens_it")
//    val ingredientsTextWithAllergensIt: String? = "",
//    @SerializedName("ingredients_text_with_allergens_ko")
//    val ingredientsTextWithAllergensKo: String? = "",
//    @SerializedName("ingredients_text_with_allergens_nb")
//    val ingredientsTextWithAllergensNb: String? = "",
//    @SerializedName("ingredients_text_with_allergens_nl")
//    val ingredientsTextWithAllergensNl: String? = "",
//    @SerializedName("ingredients_text_with_allergens_no")
//    val ingredientsTextWithAllergensNo: String? = "",
//    @SerializedName("ingredients_text_with_allergens_pl")
//    val ingredientsTextWithAllergensPl: String? = "",
//    @SerializedName("ingredients_text_with_allergens_pt")
//    val ingredientsTextWithAllergensPt: String? = "",
//    @SerializedName("ingredients_text_with_allergens_ru")
//    val ingredientsTextWithAllergensRu: String? = "",
//    @SerializedName("ingredients_text_with_allergens_sr")
//    val ingredientsTextWithAllergensSr: String? = "",
//    @SerializedName("ingredients_text_with_allergens_sv")
//    val ingredientsTextWithAllergensSv: String? = "",
//    @SerializedName("ingredients_text_with_allergens_zh")
//    val ingredientsTextWithAllergensZh: String? = "",
//    @SerializedName("ingredients_text_xx")
//    val ingredientsTextXx: String? = "",
//    @SerializedName("ingredients_text_xx_debug_tags")
//    val ingredientsTextXxDebugTags: List<Any>? = listOf(),
//    @SerializedName("ingredients_text_zh")
//    val ingredientsTextZh: String? = "",
//    @SerializedName("ingredients_that_may_be_from_palm_oil_n")
//    val ingredientsThatMayBeFromPalmOilN: Int? = 0,
//    @SerializedName("ingredients_that_may_be_from_palm_oil_tags")
//    val ingredientsThatMayBeFromPalmOilTags: List<String>? = listOf(),
//    @SerializedName("ingredients_with_specified_percent_n")
//    val ingredientsWithSpecifiedPercentN: Int? = 0,
//    @SerializedName("ingredients_with_specified_percent_sum")
//    val ingredientsWithSpecifiedPercentSum: Double? = 0.0,
//    @SerializedName("ingredients_with_unspecified_percent_n")
//    val ingredientsWithUnspecifiedPercentN: Int? = 0,
//    @SerializedName("ingredients_with_unspecified_percent_sum")
//    val ingredientsWithUnspecifiedPercentSum: Double? = 0.0,
//    @SerializedName("interface_version_created")
//    val interfaceVersionCreated: String? = "",
//    @SerializedName("interface_version_modified")
//    val interfaceVersionModified: String? = "",
//    @SerializedName("_keywords")
//    val keywords: List<String>? = listOf(),
//    @SerializedName("known_ingredients_n")
//    val knownIngredientsN: Int? = 0,
//    @SerializedName("labels")
//    val labels: String? = "",
//    @SerializedName("labels_hierarchy")
//    val labelsHierarchy: List<String>? = listOf(),
//    @SerializedName("labels_imported")
//    val labelsImported: String? = "",
//    @SerializedName("labels_lc")
//    val labelsLc: String? = "",
//    @SerializedName("labels_old")
//    val labelsOld: String? = "",
//    @SerializedName("labels_tags")
//    val labelsTags: List<String>? = listOf(),
//    @SerializedName("lang")
//    val lang: String? = "",
//    @SerializedName("lang_imported")
//    val langImported: String? = "",
//    @SerializedName("languages")
//    val languages: Languages? = Languages(),
//    @SerializedName("languages_codes")
//    val languagesCodes: LanguagesCodes? = LanguagesCodes(),
//    @SerializedName("languages_hierarchy")
//    val languagesHierarchy: List<String>? = listOf(),
//    @SerializedName("languages_tags")
//    val languagesTags: List<String>? = listOf(),
//    @SerializedName("last_check_dates_tags")
//    val lastCheckDatesTags: List<String>? = listOf(),
//    @SerializedName("last_checked_t")
//    val lastCheckedT: Int? = 0,
//    @SerializedName("last_checker")
//    val lastChecker: String? = "",
//    @SerializedName("last_edit_dates_tags")
//    val lastEditDatesTags: List<String>? = listOf(),
//    @SerializedName("last_editor")
//    val lastEditor: String? = "",
//    @SerializedName("last_image_dates_tags")
//    val lastImageDatesTags: List<String>? = listOf(),
//    @SerializedName("last_image_t")
//    val lastImageT: Int? = 0,
//    @SerializedName("last_modified_by")
//    val lastModifiedBy: String? = "",
//    @SerializedName("last_modified_t")
//    val lastModifiedT: Int? = 0,
//    @SerializedName("lc")
//    val lc: String? = "",
//    @SerializedName("lc_imported")
//    val lcImported: String? = "",
//    @SerializedName("link")
//    val link: String? = "",
//    @SerializedName("link_imported")
//    val linkImported: String? = "",
//    @SerializedName("main_countries_tags")
//    val mainCountriesTags: List<Any>? = listOf(),
//    @SerializedName("manufacturing_places")
//    val manufacturingPlaces: String? = "",
//    @SerializedName("manufacturing_places_imported")
//    val manufacturingPlacesImported: String? = "",
//    @SerializedName("manufacturing_places_tags")
//    val manufacturingPlacesTags: List<String>? = listOf(),
//    @SerializedName("max_imgid")
//    val maxImgid: Int? = 0,
//    @SerializedName("minerals_prev_tags")
//    val mineralsPrevTags: List<String>? = listOf(),
//    @SerializedName("minerals_tags")
//    val mineralsTags: List<String>? = listOf(),
//    @SerializedName("misc_tags")
//    val miscTags: List<String>? = listOf(),
//    @SerializedName("new_additives_n")
//    val newAdditivesN: Int? = 0,
//    @SerializedName("no_nutrition_data")
//    val noNutritionData: String? = "",
//    @SerializedName("no_nutrition_data_imported")
//    val noNutritionDataImported: String? = "",
    @SerializedName("nova_group")
    val novaGroup: Int? = 0,
//    @SerializedName("nova_group_debug")
//    val novaGroupDebug: String? = "",
//    @SerializedName("nova_group_error")
//    val novaGroupError: String? = "",
//    @SerializedName("nova_groups")
//    val novaGroups: String? = "",
//    @SerializedName("nova_groups_markers")
//    val novaGroupsMarkers: NovaGroupsMarkers? = NovaGroupsMarkers(),
//    @SerializedName("nova_groups_tags")
//    val novaGroupsTags: List<String>? = listOf(),
//    @SerializedName("nucleotides_prev_tags")
//    val nucleotidesPrevTags: List<Any>? = listOf(),
//    @SerializedName("nucleotides_tags")
//    val nucleotidesTags: List<Any>? = listOf(),
//    @SerializedName("nutrient_levels")
//    val nutrientLevels: NutrientLevels? = NutrientLevels(),
//    @SerializedName("nutrient_levels_tags")
//    val nutrientLevelsTags: List<String>? = listOf(),
//    @SerializedName("nutriments")
//    val nutriments: Nutriments? = Nutriments(),
//    @SerializedName("nutriscore_data")
//    val nutriscoreData: NutriscoreData? = NutriscoreData(),
    @SerializedName("nutriscore_grade")
    val nutriscoreGrade: String? = "",
//    @SerializedName("nutriscore_grade_producer")
//    val nutriscoreGradeProducer: String? = "",
//    @SerializedName("nutriscore_grade_producer_imported")
//    val nutriscoreGradeProducerImported: String? = "",
//    @SerializedName("nutriscore_score")
//    val nutriscoreScore: Int? = 0,
//    @SerializedName("nutriscore_score_opposite")
//    val nutriscoreScoreOpposite: Int? = 0,
//    @SerializedName("nutrition_data")
//    val nutritionData: String? = "",
//    @SerializedName("nutrition_data_per")
//    val nutritionDataPer: String? = "",
//    @SerializedName("nutrition_data_per_imported")
//    val nutritionDataPerImported: String? = "",
//    @SerializedName("nutrition_data_prepared")
//    val nutritionDataPrepared: String? = "",
//    @SerializedName("nutrition_data_prepared_per")
//    val nutritionDataPreparedPer: String? = "",
//    @SerializedName("nutrition_data_prepared_per_imported")
//    val nutritionDataPreparedPerImported: String? = "",
//    @SerializedName("nutrition_grade_fr")
//    val nutritionGradeFr: String? = "",
//    @SerializedName("nutrition_grades")
//    val nutritionGrades: String? = "",
//    @SerializedName("nutrition_grades_tags")
//    val nutritionGradesTags: List<String>? = listOf(),
//    @SerializedName("nutrition_score_beverage")
//    val nutritionScoreBeverage: Int? = 0,
//    @SerializedName("nutrition_score_debug")
//    val nutritionScoreDebug: String? = "",
//    @SerializedName("nutrition_score_warning_fruits_vegetables_nuts_estimate")
//    val nutritionScoreWarningFruitsVegetablesNutsEstimate: Int? = 0,
//    @SerializedName("nutrition_score_warning_fruits_vegetables_nuts_estimate_from_ingredients")
//    val nutritionScoreWarningFruitsVegetablesNutsEstimateFromIngredients: Int? = 0,
//    @SerializedName("nutrition_score_warning_fruits_vegetables_nuts_estimate_from_ingredients_value")
//    val nutritionScoreWarningFruitsVegetablesNutsEstimateFromIngredientsValue: Double? = 0.0,
//    @SerializedName("nutrition_score_warning_fruits_vegetables_nuts_from_category")
//    val nutritionScoreWarningFruitsVegetablesNutsFromCategory: String? = "",
//    @SerializedName("nutrition_score_warning_fruits_vegetables_nuts_from_category_value")
//    val nutritionScoreWarningFruitsVegetablesNutsFromCategoryValue: Int? = 0,
//    @SerializedName("nutrition_score_warning_no_fiber")
//    val nutritionScoreWarningNoFiber: Int? = 0,
//    @SerializedName("obsolete")
//    val obsolete: String? = "",
//    @SerializedName("obsolete_imported")
//    val obsoleteImported: String? = "",
//    @SerializedName("obsolete_since_date")
//    val obsoleteSinceDate: String? = "",
//    @SerializedName("origin")
//    val origin: String? = "",
//    @SerializedName("origin_ar")
//    val originAr: String? = "",
//    @SerializedName("origin_bg")
//    val originBg: String? = "",
//    @SerializedName("origin_ca")
//    val originCa: String? = "",
//    @SerializedName("origin_ch")
//    val originCh: String? = "",
//    @SerializedName("origin_da")
//    val originDa: String? = "",
//    @SerializedName("origin_de")
//    val originDe: String? = "",
//    @SerializedName("origin_en")
//    val originEn: String? = "",
//    @SerializedName("origin_es")
//    val originEs: String? = "",
//    @SerializedName("origin_fr")
//    val originFr: String? = "",
//    @SerializedName("origin_fr_imported")
//    val originFrImported: String? = "",
//    @SerializedName("origin_it")
//    val originIt: String? = "",
//    @SerializedName("origin_ko")
//    val originKo: String? = "",
//    @SerializedName("origin_nb")
//    val originNb: String? = "",
//    @SerializedName("origin_nl")
//    val originNl: String? = "",
//    @SerializedName("origin_no")
//    val originNo: String? = "",
//    @SerializedName("origin_pl")
//    val originPl: String? = "",
//    @SerializedName("origin_pt")
//    val originPt: String? = "",
//    @SerializedName("origin_ru")
//    val originRu: String? = "",
//    @SerializedName("origin_sr")
//    val originSr: String? = "",
//    @SerializedName("origin_sv")
//    val originSv: String? = "",
//    @SerializedName("origin_zh")
//    val originZh: String? = "",
//    @SerializedName("origins")
//    val origins: String? = "",
//    @SerializedName("origins_fr")
//    val originsFr: String? = "",
//    @SerializedName("origins_hierarchy")
//    val originsHierarchy: List<String>? = listOf(),
//    @SerializedName("origins_imported")
//    val originsImported: String? = "",
//    @SerializedName("origins_lc")
//    val originsLc: String? = "",
//    @SerializedName("origins_old")
//    val originsOld: String? = "",
//    @SerializedName("origins_tags")
//    val originsTags: List<String>? = listOf(),
//    @SerializedName("other_nutritional_substances_prev_tags")
//    val otherNutritionalSubstancesPrevTags: List<Any>? = listOf(),
//    @SerializedName("other_nutritional_substances_tags")
//    val otherNutritionalSubstancesTags: List<Any>? = listOf(),
//    @SerializedName("owner")
//    val owner: String? = "",
//    @SerializedName("owner_fields")
//    val ownerFields: OwnerFields? = OwnerFields(),
//    @SerializedName("owner_imported")
//    val ownerImported: String? = "",
//    @SerializedName("owners_tags")
//    val ownersTags: String? = "",
//    @SerializedName("packaging")
//    val packaging: String? = "",
//    @SerializedName("packaging_hierarchy")
//    val packagingHierarchy: List<String>? = listOf(),
//    @SerializedName("packaging_imported")
//    val packagingImported: String? = "",
//    @SerializedName("packaging_lc")
//    val packagingLc: String? = "",
//    @SerializedName("packaging_old")
//    val packagingOld: String? = "",
//    @SerializedName("packaging_old_before_taxonomization")
//    val packagingOldBeforeTaxonomization: String? = "",
//    @SerializedName("packaging_tags")
//    val packagingTags: List<String>? = listOf(),
//    @SerializedName("packaging_text")
//    val packagingText: String? = "",
//    @SerializedName("packaging_text_ar")
//    val packagingTextAr: String? = "",
//    @SerializedName("packaging_text_bg")
//    val packagingTextBg: String? = "",
//    @SerializedName("packaging_text_ca")
//    val packagingTextCa: String? = "",
//    @SerializedName("packaging_text_ch")
//    val packagingTextCh: String? = "",
//    @SerializedName("packaging_text_da")
//    val packagingTextDa: String? = "",
//    @SerializedName("packaging_text_de")
//    val packagingTextDe: String? = "",
//    @SerializedName("packaging_text_en")
//    val packagingTextEn: String? = "",
//    @SerializedName("packaging_text_es")
//    val packagingTextEs: String? = "",
//    @SerializedName("packaging_text_fr")
//    val packagingTextFr: String? = "",
//    @SerializedName("packaging_text_fr_imported")
//    val packagingTextFrImported: String? = "",
//    @SerializedName("packaging_text_id")
//    val packagingTextId: String? = "",
//    @SerializedName("packaging_text_it")
//    val packagingTextIt: String? = "",
//    @SerializedName("packaging_text_ko")
//    val packagingTextKo: String? = "",
//    @SerializedName("packaging_text_nb")
//    val packagingTextNb: String? = "",
//    @SerializedName("packaging_text_nl")
//    val packagingTextNl: String? = "",
//    @SerializedName("packaging_text_no")
//    val packagingTextNo: String? = "",
//    @SerializedName("packaging_text_pl")
//    val packagingTextPl: String? = "",
//    @SerializedName("packaging_text_pt")
//    val packagingTextPt: String? = "",
//    @SerializedName("packaging_text_ru")
//    val packagingTextRu: String? = "",
//    @SerializedName("packaging_text_sr")
//    val packagingTextSr: String? = "",
//    @SerializedName("packaging_text_sv")
//    val packagingTextSv: String? = "",
//    @SerializedName("packaging_text_zh")
//    val packagingTextZh: String? = "",
//    @SerializedName("packagings")
//    val packagings: List<Packaging>? = listOf(),
//    @SerializedName("packagings_complete")
//    val packagingsComplete: Int? = 0,
//    @SerializedName("photographers")
//    val photographers: List<Any>? = listOf(),
//    @SerializedName("photographers_tags")
//    val photographersTags: List<String>? = listOf(),
//    @SerializedName("pnns_groups_1")
//    val pnnsGroups1: String? = "",
//    @SerializedName("pnns_groups_1_tags")
//    val pnnsGroups1Tags: List<String>? = listOf(),
//    @SerializedName("pnns_groups_2")
//    val pnnsGroups2: String? = "",
//    @SerializedName("pnns_groups_2_tags")
//    val pnnsGroups2Tags: List<String>? = listOf(),
//    @SerializedName("popularity_key")
//    val popularityKey: Long? = 0,
//    @SerializedName("popularity_tags")
//    val popularityTags: List<String>? = listOf(),
//    @SerializedName("preparation")
//    val preparation: String? = "",
//    @SerializedName("preparation_fr")
//    val preparationFr: String? = "",
//    @SerializedName("preparation_fr_imported")
//    val preparationFrImported: String? = "",
//    @SerializedName("producer_product_id")
//    val producerProductId: String? = "",
//    @SerializedName("producer_product_id_imported")
//    val producerProductIdImported: String? = "",
//    @SerializedName("producer_version_id")
//    val producerVersionId: String? = "",
//    @SerializedName("producer_version_id_imported")
//    val producerVersionIdImported: String? = "",
    @SerializedName("product_name")
    val productName: String? = "",
//    @SerializedName("product_name_ar")
//    val productNameAr: String? = "",
//    @SerializedName("product_name_bg")
//    val productNameBg: String? = "",
//    @SerializedName("product_name_ca")
//    val productNameCa: String? = "",
//    @SerializedName("product_name_ch")
//    val productNameCh: String? = "",
//    @SerializedName("product_name_da")
//    val productNameDa: String? = "",
//    @SerializedName("product_name_de")
//    val productNameDe: String? = "",
//    @SerializedName("product_name_debug_tags")
//    val productNameDebugTags: List<Any>? = listOf(),
//    @SerializedName("product_name_zh")
//    val productNameZh: String? = "",
//    @SerializedName("product_quantity")
//    val productQuantity: Int? = 0,
//    @SerializedName("purchase_places")
//    val purchasePlaces: String? = "",
//    @SerializedName("purchase_places_tags")
//    val purchasePlacesTags: List<String>? = listOf(),
    @SerializedName("quantity")
    val quantity: String? = "",
//    @SerializedName("quantity_imported")
//    val quantityImported: String? = "",
//    @SerializedName("recycling_instructions_to_discard_fr")
//    val recyclingInstructionsToDiscardFr: String? = "",
//    @SerializedName("recycling_instructions_to_discard_fr_imported")
//    val recyclingInstructionsToDiscardFrImported: String? = "",
//    @SerializedName("removed_countries_tags")
//    val removedCountriesTags: List<Any>? = listOf(),
//    @SerializedName("rev")
//    val rev: Int? = 0,
//    @SerializedName("scans_n")
//    val scansN: Int? = 0,
//    @SerializedName("scores")
//    val scores: Scores? = Scores(),
//    @SerializedName("serving_quantity")
//    val servingQuantity: Double? = 0.0,
//    @SerializedName("serving_size")
//    val servingSize: String? = "",
//    @SerializedName("serving_size_imported")
//    val servingSizeImported: String? = "",
//    @SerializedName("sortkey")
//    val sortkey: Int? = 0,
//    @SerializedName("sources")
//    val sources: List<Source>? = listOf(),
//    @SerializedName("states")
//    val states: String? = "",
//    @SerializedName("states_hierarchy")
//    val statesHierarchy: List<String>? = listOf(),
//    @SerializedName("states_tags")
//    val statesTags: List<String>? = listOf(),
//    @SerializedName("stores")
//    val stores: String? = "",
//    @SerializedName("stores_imported")
//    val storesImported: String? = "",
//    @SerializedName("stores_tags")
//    val storesTags: List<String>? = listOf(),
//    @SerializedName("teams")
//    val teams: String? = "",
//    @SerializedName("teams_tags")
//    val teamsTags: List<String>? = listOf(),
//    @SerializedName("traces")
//    val traces: String? = "",
//    @SerializedName("traces_from_ingredients")
//    val tracesFromIngredients: String? = "",
//    @SerializedName("traces_from_user")
//    val tracesFromUser: String? = "",
//    @SerializedName("traces_hierarchy")
//    val tracesHierarchy: List<String>? = listOf(),
//    @SerializedName("traces_imported")
//    val tracesImported: String? = "",
//    @SerializedName("traces_lc")
//    val tracesLc: String? = "",
//    @SerializedName("traces_tags")
//    val tracesTags: List<String>? = listOf(),
//    @SerializedName("unique_scans_n")
//    val uniqueScansN: Int? = 0,
//    @SerializedName("unknown_ingredients_n")
//    val unknownIngredientsN: Int? = 0,
//    @SerializedName("unknown_nutrients_tags")
//    val unknownNutrientsTags: List<Any>? = listOf(),
//    @SerializedName("update_key")
//    val updateKey: String? = "",
//    @SerializedName("url")
//    val url: String? = "",
//    @SerializedName("vitamins_prev_tags")
//    val vitaminsPrevTags: List<String>? = listOf(),
//    @SerializedName("vitamins_tags")
//    val vitaminsTags: List<String>? = listOf(),
//    @SerializedName("weighers_tags")
//    val weighersTags: List<String>? = listOf(),
//    @SerializedName("weighters_tags")
//    val weightersTags: List<String>? = listOf(),
//    @SerializedName("with_sweeteners")
//    val withSweeteners: Int? = 0
)