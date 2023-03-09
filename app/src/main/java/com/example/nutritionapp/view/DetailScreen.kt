package com.example.nutritionapp.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.nutritionapp.R
import com.example.nutritionapp.ui.theme.*
import com.example.nutritionapp.viewmodel.ProductViewModel

@Composable
fun ProductDetailScreen(
    productViewModel: ProductViewModel? = null,
    navController: NavController? = null
) {
    val product = productViewModel?.selectedProduct

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {

        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data(product?.imageUrl)
                .crossfade(true)
                .build(),
            placeholder = painterResource(R.drawable.ic_launcher_background),
            error = painterResource(id = R.drawable.productnon),
            contentDescription = stringResource(R.string.app_name),
            contentScale = ContentScale.Crop,
            alignment = Alignment.Center,
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)


        )

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(280.dp)
                .padding(start = 10.dp, end = 10.dp, top = 5.dp, bottom = 5.dp),
            elevation = 20.dp,
            backgroundColor = Color.White,
            shape = RoundedCornerShape(
                corner = CornerSize(16.dp)
            )
        ) {

            Column(modifier = Modifier.padding(10.dp)) {

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 10.dp)
                ) {
                    Text(
                        color = Color.Black,
                        text = product?.productName ?: "Product name not available",
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Start,
                        modifier = Modifier.weight(1f)
                    )
                    Text(
                        color = Color.DarkGray,
                        text = product?.productQuantity ?: "Quantity not available",
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.End,
                        modifier = Modifier.weight(1f)
                    )
                }


                //ABCDE
                NutriscoreDetails(productViewModel, navController)

                //ABCDE
                EcoScoreDetails(productViewModel, navController)

                //1234
                NovascoreDetails(productViewModel, navController)

            }

        }


    }

}



@OptIn(ExperimentalMaterialApi::class)
@Composable
fun NutriscoreDetails(productViewModel: ProductViewModel?, navController: NavController?) {
    Surface(
        modifier = Modifier
            .padding(bottom = 10.dp)
            .fillMaxWidth()
            .clip(RoundedCornerShape(12.dp)),
        shape = RectangleShape,
        onClick = {
            productViewModel?.flgScore = "nutriscore"
            navController?.navigate("scoreDetails")
        }

    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = GreenLight),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(R.drawable.b),
                contentDescription = "nutriscore",
                modifier = Modifier
                    .padding(5.dp)
                    .weight(1f)
            )
            Text(
                color = Green,
                fontSize = 18.sp,
                text = "Good nutritional quality",
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier
                    .weight(2f)
            )
        }
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun EcoScoreDetails(productViewModel: ProductViewModel?, navController: NavController?) {
    Surface(
        modifier = Modifier
            .padding(bottom = 10.dp)
            .fillMaxWidth()
            .clip(RoundedCornerShape(12.dp)),
        shape = RectangleShape,
        onClick = {
            productViewModel?.flgScore = "ecoescore"
            navController?.navigate("scoreDetails")
        }

        ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = GrayLight),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(R.drawable.econull),
                contentDescription = "nutriscore",
                modifier = Modifier
                    .padding(5.dp)
                    .size(50.dp)
                    .weight(1f)
            )
            Text(
                color = Color.Black,
                fontSize = 18.sp,
                text = "Not yet applicable for the category",
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier
                    .weight(2f)
            )
        }
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun NovascoreDetails(productViewModel: ProductViewModel?, navController: NavController?) {
    Surface(
        modifier = Modifier
            .clip(RoundedCornerShape(12.dp)),
        shape = RectangleShape,
        onClick = {
            productViewModel?.flgScore = "novaescore"
            navController?.navigate("scoreDetails")
        }

        ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = RedLight),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .background(Color.Red)
                    .height(30.dp)
                    .width(20.dp)
            ) {
                Text(
                    text = "4",
                    color = Color.White,
                    fontWeight = FontWeight.ExtraBold,
                    modifier = Modifier
                        .padding(
                            start = 5.dp,
                            end = 5.dp, top = 2.dp
                        ), fontSize = 17.sp
                )
            }
            Text(
                color = Red,
                fontSize = 18.sp,
                text = "Ultra processed food",
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier
                    .padding(start = 10.dp, end = 10.dp)
                    .weight(2f)
            )
        }
    }
}


@Preview(showSystemUi = true, showBackground = true)
@Composable
fun Preview() {
    ProductDetailScreen()
}