package com.example.nutritionapp.model.domain

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.nutritionapp.model.Product

@Entity(tableName = "products")
data class ProductDomain(

    @PrimaryKey
    //val id: String,
    val productName: String,
    val imageUrl: String,
//    val imageFrontUrl: String,
//    val imageIngredientsUrl: String,
//    val ingredients: List<Ingredient>,
    val nutriScoreGrade: String,
    val novGroup: Int,
    val productQuantity: String,
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
            nutriScoreGrade = it.nutriscoreGrade ?: "Nutriscore not available",
            novGroup = it.novaGroup ?: 0,
            productQuantity = it.quantity ?: "Quantity not available"
//            ecoScoreGrade = it.ecoscoreGrade ?: "?"

        )


    } ?: emptyList()
