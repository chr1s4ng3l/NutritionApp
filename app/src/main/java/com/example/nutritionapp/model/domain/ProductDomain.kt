package com.example.nutritionapp.model.domain

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.nutritionapp.model.Ingredient
import com.example.nutritionapp.model.Ingredients
import com.example.nutritionapp.model.NutriscoreData
import com.example.nutritionapp.model.Product

@Entity(tableName = "products")
data class ProductDomain(

    @PrimaryKey
    //val id: String,
    val productName: String?,
    val imageUrl: String,
//    val imageFrontUrl: String,
//    val imageIngredientsUrl: String,
//    val ingredients: List<Ingredient>,
//    val nutriScore: NutriscoreData,
//    val novGroup: Int,
//    val ecoScoreGrade: String


)

fun List<Product>?.toDomain(): List<ProductDomain> =
    this?.map {
        ProductDomain(
           // id = it.id ?: "ID not available",
            productName = it.productName ?: "Product Name not available",
            imageUrl = it.imageUrl ?: "ImageThumb not available",
//            imageFrontUrl = it.imageFrontUrl ?: "ImageFront not available",
//            imageIngredientsUrl = it.imageIngredientsUrl ?: "Image not available",
//            ingredients = it.ingredients ?: emptyList(),
//            nutriScore = it.nutriscoreData ?: NutriscoreData(1.0),
//            novGroup = it.novaGroup ?: 0,
//            ecoScoreGrade = it.ecoscoreGrade ?: "?"

        )


    } ?: emptyList()
