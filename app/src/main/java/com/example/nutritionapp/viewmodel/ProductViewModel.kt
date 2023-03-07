package com.example.nutritionapp.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.nftapp.utils.UIState
import com.example.nutritionapp.model.domain.ProductDomain
import com.example.nutritionapp.rest.ProductRepositoryImpl
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

private const val TAG = "ProductViewModel"

@HiltViewModel
class ProductViewModel @Inject constructor(private val repo: ProductRepositoryImpl) : ViewModel() {


    var barcode: String = ""
    var selectedProduct: ProductDomain? = null

    private val _product: MutableLiveData<UIState<List<ProductDomain>>> =
        MutableLiveData(UIState.LOADING)
    val product: LiveData<UIState<List<ProductDomain>>> get() = _product


    init {
        getProductByCode()
    }

     fun getProductByCode(code: String? = null) {
        code?.let {
            viewModelScope.launch {
                repo.getProductByCode(code).collect() {
                    _product.value = it
                    Log.d(TAG, "getProduct: $it")

                }
            }
        }

    }
}