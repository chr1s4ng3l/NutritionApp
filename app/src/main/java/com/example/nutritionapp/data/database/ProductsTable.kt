package com.example.nutritionapp.data.database

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.nutritionapp.data.model.domain.ProductDomain

@Entity(tableName = "products")
data class ProductTable(

    @PrimaryKey
    val idProduct: String = "",
    val productName: String = "",
    val categories: String = "",
    val countries: String = "",
    val imageUrl: String = "",
    val ingredients: String = "",
    val nutriScoreGrade: String = "",
    val novGroup: Int = 0,
    val productQuantity: String = "",
    val ecoScoreGrade: String = "",
    val isClick: Boolean = false


)


fun ProductDomain.toDomainTable(): ProductTable {
    return ProductTable(
        this.id,
        this.productName,
        this.categories,
        this.countries,
        this.imageUrl,
        this.ingredients,
        this.nutriScoreGrade,
        this.novGroup,
        this.productQuantity,
        this.ecoScoreGrade,
        this.isClick

    )
}