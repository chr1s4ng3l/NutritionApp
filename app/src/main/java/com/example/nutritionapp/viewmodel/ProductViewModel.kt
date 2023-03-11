package com.example.nutritionapp.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.nftapp.utils.UIState
import com.example.nutritionapp.data.database.LocalRepository
import com.example.nutritionapp.data.database.ProductTable
import com.example.nutritionapp.data.model.domain.ProductDomain
import com.example.nutritionapp.rest.ProductRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

private const val TAG = "ProductViewModel"

@HiltViewModel
class ProductViewModel @Inject constructor(
    private val repo: ProductRepository,
    private val localRepository: LocalRepository
) : ViewModel() {


    var barcode: String = ""
    var tag: String = ""
    var flgScore: String = ""
    var selectedProduct: ProductDomain? = null
    var selectedProductHistory: ProductTable? = null

    private val _product: MutableLiveData<UIState<List<ProductDomain>>> =
        MutableLiveData(UIState.LOADING)
    val product: LiveData<UIState<List<ProductDomain>>> get() = _product

    private val _productTag: MutableLiveData<UIState<List<ProductDomain>>> =
        MutableLiveData(UIState.LOADING)
    val productTag: LiveData<UIState<List<ProductDomain>>> get() = _productTag

    private val _productInHistory: MutableLiveData<UIState<List<ProductTable>>> =
        MutableLiveData(UIState.LOADING)
    val productInHistory: LiveData<UIState<List<ProductTable>>> get() = _productInHistory


    init {
        getProductByCode()
        getProductByTag()
    }

    fun getProductByCode(code: String? = null) {
        code?.let {
            viewModelScope.launch {
                repo.getProductByCode(code).collect {
                    _product.value = it
                    Log.d(TAG, "getProduct: $it")

                }
            }
        }
    }

    fun getProductByTag(tag: String? = null) {
        tag?.let {
            viewModelScope.launch {
                repo.getProductByTag(tag).collect {
                    _productTag.value = it
                    Log.d(TAG, "getProduct: $it")

                }
            }
        }

    }


    fun insertProductHistory(product: ProductDomain? = null) {
        product?.let {
            println("Holallallalaljscjh")
            viewModelScope.launch {
                println("ajajjajajaj -> -> ->")
                localRepository.insertProduct(product)

            }

        }

    }


    fun getProductHistory() {
        viewModelScope.launch {
            _productInHistory.value = localRepository.getProduct()

        }
    }

}