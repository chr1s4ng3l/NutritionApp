package com.example.nutritionapp.data.database

import com.example.nftapp.utils.UIState
import com.example.nutritionapp.data.model.domain.ProductDomain
import javax.inject.Inject

interface LocalRepository {

    suspend fun insertProduct(productDomain: ProductDomain)

    suspend fun deleteProduct(productDomain: ProductDomain)

    suspend fun getProduct(): UIState<List<ProductTable>>
}


class LocalRepositoryImpl @Inject constructor(private val productDao: ProductDao) :
    LocalRepository {

    override suspend fun insertProduct(productDomain: ProductDomain) {
        try {

            println("<-<-<_<_<____<__<-,_")
            val productTable = productDomain.toDomainTable()
            productDao.insertProducts(productTable)

        } catch (e: Exception) {
            e.message
        }
    }

    override suspend fun deleteProduct(productDomain: ProductDomain) {
        try {

            val productTable = productDomain.toDomainTable()
            productDao.deleteProduct(productTable)

        } catch (e: Exception) {
            e.message
        }
    }

    override suspend fun getProduct(): UIState<List<ProductTable>> {
        return try {
            UIState.SUCCESS(productDao.getProductFromDatabase())
        } catch (e: Exception) {
            UIState.ERROR(e)
        }
    }



}
