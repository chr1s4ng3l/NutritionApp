package com.example.nutritionapp.data.database

import androidx.room.*

@Dao
interface ProductDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertProducts(vararg product: ProductTable)


    @Delete
    suspend fun deleteProduct(vararg product: ProductTable)


    @Query("SELECT * FROM products")
    suspend fun getProductFromDatabase(): List<ProductTable>

}