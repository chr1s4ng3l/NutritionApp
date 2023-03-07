package com.example.nutritionapp.model


import com.google.gson.annotations.SerializedName

data class Impact(
    @SerializedName("average_total_used_mass")
    val averageTotalUsedMass: Double? = 0.0,
    @SerializedName("calculation_time")
    val calculationTime: Double? = 0.0,
    @SerializedName("confidence_score_distribution")
    val confidenceScoreDistribution: List<Double>? = listOf(),
    @SerializedName("const_relax_coef")
    val constRelaxCoef: Int? = 0,
    @SerializedName("data_sources")
    val dataSources: DataSources? = DataSources(),
    @SerializedName("ef_single_score_log_stddev")
    val efSingleScoreLogStddev: Double? = 0.0,
    @SerializedName("ignored_unknown_ingredients")
    val ignoredUnknownIngredients: List<Any>? = listOf(),
    @SerializedName("impact_distributions")
    val impactDistributions: ImpactDistributions? = ImpactDistributions(),
    @SerializedName("impacts_geom_means")
    val impactsGeomMeans: ImpactsGeomMeans? = ImpactsGeomMeans(),
    @SerializedName("impacts_geom_stdevs")
    val impactsGeomStdevs: ImpactsGeomStdevs? = ImpactsGeomStdevs(),
    @SerializedName("impacts_quantiles")
    val impactsQuantiles: ImpactsQuantiles? = ImpactsQuantiles(),
    @SerializedName("impacts_relative_interquartile")
    val impactsRelativeInterquartile: ImpactsRelativeInterquartile? = ImpactsRelativeInterquartile(),
    @SerializedName("impacts_units")
    val impactsUnits: ImpactsUnits? = ImpactsUnits(),
    @SerializedName("likeliest_impacts")
    val likeliestImpacts: LikeliestImpacts? = LikeliestImpacts(),
    @SerializedName("likeliest_recipe")
    val likeliestRecipe: LikeliestRecipe? = LikeliestRecipe(),
    @SerializedName("mass_ratio_uncharacterized")
    val massRatioUncharacterized: Double? = 0.0,
    @SerializedName("mean_confidence_interval_distribution")
    val meanConfidenceIntervalDistribution: MeanConfidenceIntervalDistribution? = MeanConfidenceIntervalDistribution(),
    @SerializedName("number_of_ingredients")
    val numberOfIngredients: Int? = 0,
    @SerializedName("number_of_runs")
    val numberOfRuns: Int? = 0,
    @SerializedName("product_quantity")
    val productQuantity: Int? = 0,
    @SerializedName("recipes")
    val recipes: List<Recipe>? = listOf(),
    @SerializedName("reliability")
    val reliability: Int? = 0,
    @SerializedName("total_used_mass_distribution")
    val totalUsedMassDistribution: List<Double>? = listOf(),
    @SerializedName("uncharacterized_ingredients")
    val uncharacterizedIngredients: UncharacterizedIngredients? = UncharacterizedIngredients(),
    @SerializedName("uncharacterized_ingredients_mass_proportion")
    val uncharacterizedIngredientsMassProportion: UncharacterizedIngredientsMassProportion? = UncharacterizedIngredientsMassProportion(),
    @SerializedName("uncharacterized_ingredients_ratio")
    val uncharacterizedIngredientsRatio: UncharacterizedIngredientsRatio? = UncharacterizedIngredientsRatio(),
    @SerializedName("warnings")
    val warnings: List<String>? = listOf()
)