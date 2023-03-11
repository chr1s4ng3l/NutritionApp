package com.example.nutritionapp.data.model.domain

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.nutritionapp.data.model.Product

data class ProductDomain(

    val id: String,
    val productName: String,
    val categories: String,
    val countries: String,
    val imageUrl: String,
    val ingredients: String,
    val nutriScoreGrade: String,
    val novGroup: Int,
    val productQuantity: String,
    val ecoScoreGrade: String,
    val isClick: Boolean


)

fun List<Product>?.toDomain(): List<ProductDomain> =
    this?.map {
        ProductDomain(
            id = it.id ?: "ID not available",
            productName = it.productName ?: "Product Name not available",
            categories = it.categories ?: "Category Name not available",
            countries = it.countries ?: "Countries Name not available",
            imageUrl = it.imageUrl ?: "ImageThumb not available",
            ingredients = it.ingredientsText ?: "Ingredients not available",
            nutriScoreGrade = it.nutriscoreGrade ?: "Nutriscore not available",
            novGroup = it.novaGroup ?: 0,
            productQuantity = it.quantity ?: "Quantity not available",
            ecoScoreGrade = it.ecoscoreGrade ?: "?",
            isClick = false

        )


    } ?: emptyList()


