package com.example.nutritionapp.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.nutritionapp.data.model.domain.ProductDomain

@Database(entities = [ProductTable::class], version = 1)
abstract class ProductsDatabase : RoomDatabase() {

    abstract fun  getProductDao(): ProductDao

}