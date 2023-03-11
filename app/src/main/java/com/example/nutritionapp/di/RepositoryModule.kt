package com.example.nutritionapp.di

import com.example.nutritionapp.data.database.LocalRepository
import com.example.nutritionapp.data.database.LocalRepositoryImpl
import com.example.nutritionapp.rest.ProductRepository
import com.example.nutritionapp.rest.ProductRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun provideProductRepository(productRepositoryImpl: ProductRepositoryImpl): ProductRepository


    @Binds
    abstract fun provideLocalRepository(localRepository: LocalRepositoryImpl): LocalRepository

}