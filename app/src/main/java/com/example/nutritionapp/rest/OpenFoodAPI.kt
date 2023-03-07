package com.example.nutritionapp.rest

import com.example.nutritionapp.model.ProductResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface OpenFoodAPI {

    @GET(PRODUCTS_PATH)
    suspend fun getAllProducts(
        @Query("json") Json: Boolean? = true
    ): Response<ProductResponse>


    @GET(API_PATH)
    suspend fun getProductByCode(
//        @Path("v2") v2: String = "v2",
//        @Path("search") search: String? = "search",
        @Query("code") code: String?
    ): Response<ProductResponse>


    //https://us-en.openfoodfacts.org/api/2/product/858176002157
    //https://world.openfoodfacts.org/api/v2/search?code=858176002157


    companion object {
        const val BASE_PATH = "https://world.openfoodfacts.org/"
        private const val PRODUCTS_PATH = "products"
        private const val API_PATH = "api/v2/search"
    }
}