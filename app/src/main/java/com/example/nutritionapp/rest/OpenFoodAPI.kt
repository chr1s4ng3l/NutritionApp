package com.example.nutritionapp.rest

import com.example.nutritionapp.model.ProductResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface OpenFoodAPI {

    @GET(SEARCH_PATH)
    suspend fun getProductsByTag(
        @Query("search_terms") search_terms: String?
    ): Response<ProductResponse>


    @GET(BARCODE_PATH)
    suspend fun getProductByCode(
        @Query("code") code: String?
    ): Response<ProductResponse>

    //Search -> https://world.openfoodfacts.org/cgi/search.pl?search_terms=ice+cream
    //Products -> https://us-en.openfoodfacts.org/api/2/product/858176002157
    //BarCode -> https://world.openfoodfacts.org/api/v2/search?code=858176002157


    companion object {
        const val BASE_PATH = "https://world.openfoodfacts.org/"
        private const val SEARCH_PATH = "cgi/search.pl"
        private const val BARCODE_PATH = "api/v2/search"
    }
}