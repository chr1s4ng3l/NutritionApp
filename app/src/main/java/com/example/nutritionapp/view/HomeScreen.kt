package com.example.nutritionapp.view

import androidx.compose.foundation.Image
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.*
import androidx.navigation.NavController
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.nftapp.utils.UIState
import com.example.nutritionapp.R
import com.example.nutritionapp.model.domain.ProductDomain
import com.example.nutritionapp.viewmodel.ProductViewModel



@Composable
fun ProductTagScreen(productViewModel: ProductViewModel, navController: NavController) {
    when (val state = productViewModel.productTag.observeAsState(UIState.LOADING).value) {
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
    Column(
        Modifier
            .background(color = Color.White)
            .fillMaxSize().padding(bottom = 40.dp)
    ) {
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
            .height(310.dp)
            .padding(horizontal = 30.dp, vertical = 7.dp),
        elevation = 12.dp,
        backgroundColor = Color.White,
        shape = RoundedCornerShape(corner = CornerSize(16.dp)),
        onClick = {
            selectedProduct?.invoke(product)
            navController?.navigate("details")
        }
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp)
        ) {

            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data(product.imageUrl)
                    .crossfade(true)
                    .build(),
                placeholder = painterResource(R.drawable.productnon),
                error = painterResource(id = R.drawable.productnon),
                contentDescription = stringResource(R.string.app_name),
                contentScale = ContentScale.None,
                alignment = Alignment.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)


            )

            Row(modifier = Modifier.fillMaxWidth()) {
                Text(
                    text = "${product.productName} - ${product.productQuantity}",
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    fontSize = 16.sp,
                    textAlign = TextAlign.Start,
                    modifier = Modifier
                        .padding(top = 10.dp)
                )

            }


            //0xFF3BAA3F green 1
            //0xFFFFC107 yellow 2
            //0xFFFF5722 orange 3
            //0xFFEC2718 red 4

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp, bottom = 10.dp)
            ) {

                NutriScore(product = product)

                NovaScore(product = product)

                EcoScore(product = product)

            }

        }
    }

}

@Composable
fun EcoScore(product: ProductDomain) {
    val ecoScoreGrade = product.ecoScoreGrade
    var imageRoute: Int? = null

    when (ecoScoreGrade) {
        "a" -> {
            imageRoute = R.drawable.ecoa
        }
        "b" -> {
            imageRoute = R.drawable.ecob
        }
        "c" -> {
            imageRoute = R.drawable.ecoc
        }
        "d" -> {
            imageRoute = R.drawable.ecod
        }
        "e" -> {
            imageRoute = R.drawable.ecoe
        }
        "unknown" -> {
            imageRoute = R.drawable.econull
        }
        "not-applicable" -> {
            imageRoute = R.drawable.econull
        }
    }

    Image(
        painter = painterResource(id = imageRoute ?: R.drawable.econull),
        contentDescription = "ecoscore"
    )

}

@Composable
fun NutriScore(product: ProductDomain) {
    val nutriGrade = product.nutriScoreGrade
    var imageRoute: Int? = null

    when (nutriGrade) {
        "a" -> {
            imageRoute = R.drawable.a
        }
        "b" -> {
            imageRoute = R.drawable.b
        }
        "c" -> {
            imageRoute = R.drawable.c
        }
        "d" -> {
            imageRoute = R.drawable.d
        }
        "e" -> {
            imageRoute = R.drawable.e
        }
    }

    Image(
        painter = painterResource(id = imageRoute ?: R.drawable.nutriscoreunknown),
        contentDescription = "nutriscore"
    )

}

@Composable
fun NovaScore(product: ProductDomain) {
    val novaGroup = product.novGroup
    var novaColor: Long? = null

    when (novaGroup) {
        1 -> {
            novaColor = 0xFF3BAA3F
        }
        2 -> {
            novaColor = 0xFFFFC107
        }
        3 -> {
            novaColor = 0xFFFF5722
        }
        4 -> {
            novaColor = 0xFFEC2718
        }
    }

    Column(modifier = Modifier.padding(start = 10.dp, top = 2.dp, end = 10.dp, bottom = 2.dp)) {
        Text(
            text = "NOVA",
            fontSize = 7.9.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Gray,
            textAlign = TextAlign.Center,
        )
        Box(
            modifier = Modifier
                .background(Color(color = novaColor ?: 0xFF6B6B6B))
                .width(20.dp)
        ) {
            Text(
                text = "$novaGroup",
                color = Color.White,
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier
                    .padding(
                        start = 5.dp,
                        end = 5.dp, top = 3.dp, bottom = 5.dp
                    ), fontSize = 18.sp
            )
        }

    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    ProductList(
        products = listOf(
            ProductDomain(
                productName = "Coca cola",
                imageUrl = "LALALA",
                nutriScoreGrade = "a",
                novGroup = 2,
                productQuantity = "300ml",
                ecoScoreGrade = "a"
            ),

            ProductDomain(
                productName = "Coca",
                imageUrl = "LALALA",
                nutriScoreGrade = "b",
                novGroup = 1,
                productQuantity = "300ml",
                ecoScoreGrade = "a"

            ),

            ProductDomain(
                productName = "Coca",
                imageUrl = "LALALA",
                nutriScoreGrade = "c",
                novGroup = 2,
                productQuantity = "300ml",
                ecoScoreGrade = "a"


            ),

            ProductDomain(
                productName = "Coca",
                imageUrl = "LALALA",
                nutriScoreGrade = "d",
                novGroup = 3,
                productQuantity = "300ml",
                ecoScoreGrade = "a"

            ),

            ProductDomain(
                productName = "Coca",
                imageUrl = "LALALA",
                nutriScoreGrade = "e",
                novGroup = 4,
                productQuantity = "300ml",
                ecoScoreGrade = "a"


            ),

            ProductDomain(
                productName = "Coca",
                imageUrl = "LALALA",
                nutriScoreGrade = "unknown",
                novGroup = 0,
                productQuantity = "300ml",
                ecoScoreGrade = "a"

            )

        )

    )
}
