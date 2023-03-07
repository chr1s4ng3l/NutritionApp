package com.example.nutritionapp.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.*
import androidx.navigation.NavController
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.nftapp.utils.UIState
import com.example.nutritionapp.R
import com.example.nutritionapp.model.domain.ProductDomain
import com.example.nutritionapp.viewmodel.ProductViewModel

@Composable
fun ProductScreen(productViewModel: ProductViewModel, navController: NavController) {
    when (val state = productViewModel.product.observeAsState(UIState.LOADING).value) {
        is UIState.LOADING -> {}
        is UIState.SUCCESS -> {
            ProductList(state.response, navController) {
                productViewModel.selectedProduct = it
            }
        }
        is UIState.ERROR -> {}
    }
}

@Composable
fun ProductList(
    products: List<ProductDomain>,
    navController: NavController? = null,
    selectedProduct: ((ProductDomain) -> Unit)? = null

) {

    Column(Modifier.background(color = Color.White).fillMaxSize()) {
        LazyVerticalGrid(columns = GridCells.Fixed(1), content = {
            itemsIndexed(items = products) { index, product ->
                ProductItem(product = product, navController, selectedProduct)
            }
        })
    }


}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun ProductItem(
    product: ProductDomain,
    navController: NavController? = null,
    selectedProduct: ((ProductDomain) -> Unit)? = null

) {


    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(280.dp)
            .padding(horizontal = 7.dp, vertical = 7.dp),
        elevation = 12.dp,
        backgroundColor = Color.White,
        shape = RoundedCornerShape(corner = CornerSize(16.dp)),
        onClick = {
            selectedProduct?.invoke(product)
            navController?.navigate("details")
        }
    ) {

        Column(modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)) {

            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data(product.imageUrl)
                    .crossfade(true)
                    .build(),
                placeholder = painterResource(R.drawable.ic_launcher_background),
                error = painterResource(id = R.drawable.nopicture),
                contentDescription = stringResource(R.string.app_name),
                contentScale = ContentScale.None,
                alignment = Alignment.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)


            )

            Text(
                text = product.productName ?: "Product name not available",
                fontWeight = FontWeight.Normal,
                color = Color.Black,
                fontSize = 16.sp,
                textAlign = TextAlign.Start,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp)
            )

        }
    }


}
