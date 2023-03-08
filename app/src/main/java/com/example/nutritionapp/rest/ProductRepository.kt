package com.example.nutritionapp.rest

import android.util.Log
import com.example.nftapp.utils.FailureResponse
import com.example.nftapp.utils.NullAssetsResponse
import com.example.nftapp.utils.UIState
import com.example.nutritionapp.model.domain.ProductDomain
import com.example.nutritionapp.model.domain.toDomain
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject


private const val TAG = "ProductRepository"

interface ProductRepository {
    suspend fun getProductByTag(tag: String): Flow<UIState<List<ProductDomain>>>
    suspend fun getProductByCode(code: String): Flow<UIState<List<ProductDomain>>>

}

class ProductRepositoryImpl @Inject constructor(
    private val api: OpenFoodAPI,
    private val ioDispatcher: CoroutineDispatcher
) : ProductRepository {
    override suspend fun getProductByTag(tag: String): Flow<UIState<List<ProductDomain>>> = flow {

        emit(UIState.LOADING)

        try {

            val response = api.getProductsByTag(tag)
            if (response.isSuccessful) {
                response.body()?.let {
                    Log.d(TAG, "Response -> $response")
                    Log.d(TAG, "Response Body -> ${it}")
                    emit(UIState.SUCCESS(it.products.toDomain()))
                } ?: throw NullAssetsResponse()
            } else throw FailureResponse(response.errorBody().toString())


        } catch (e: Exception) {
            emit(UIState.ERROR(e))
        }
    }.flowOn(ioDispatcher)

    override suspend fun getProductByCode(code: String): Flow<UIState<List<ProductDomain>>> = flow {
        emit(UIState.LOADING)

        try {

            val response = api.getProductByCode(code)
            if (response.isSuccessful) {
                response.body()?.let {
                    Log.d(TAG, "Response -> $response")
                    Log.d(TAG, "Response Body -> ${it}")
                    emit(UIState.SUCCESS(it.products.toDomain()))
                } ?: throw NullAssetsResponse()
            } else throw FailureResponse(response.errorBody().toString())


        } catch (e: Exception) {
            emit(UIState.ERROR(e))
        }
    }.flowOn(ioDispatcher)

}