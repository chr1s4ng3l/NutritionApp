package com.example.nutritionapp.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
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
    productViewModel: ProductViewModel? = null, navController: NavController? = null
) {

    val product = productViewModel?.selectedProduct
    println("Datos $product")

    productViewModel?.insertProductHistory(product)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .background(Color.White)
    ) {

        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current).data(product?.imageUrl)
                .crossfade(true).build(),
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
                .height(260.dp)
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

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp, top = 5.dp, bottom = 50.dp),
            elevation = 20.dp,
            backgroundColor = Color.White,
            shape = RoundedCornerShape(
                corner = CornerSize(16.dp)
            )
        ) {

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(10.dp)
            ) {
                Text(
                    color = Color.Gray,
                    fontSize = 20.sp,
                    text = "Information",
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Start,
                    modifier = Modifier.padding(bottom = 10.dp)
                )


                Text(
                    color = Color.Black,
                    fontSize = 15.sp,
                    text = stringResource(R.string.countries),
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Start
                )

                Text(
                    color = Color.Black,
                    fontSize = 12.sp,
                    text = product?.countries ?: "Countries not available",
                    fontWeight = FontWeight.Normal,
                    textAlign = TextAlign.Start,
                    modifier = Modifier.padding(bottom = 10.dp)

                )
                Text(
                    color = Color.Black,
                    fontSize = 15.sp,
                    text = stringResource(R.string.catr),
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Start

                )

                Text(
                    color = Color.Black,
                    fontSize = 12.sp,
                    text = product?.categories ?: "Categories not available",
                    fontWeight = FontWeight.Normal,
                    textAlign = TextAlign.Start,
                    modifier = Modifier.padding(bottom = 10.dp)

                )

                Text(
                    color = Color.Black,
                    fontSize = 15.sp,
                    text = stringResource(R.string.Ingredients),
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Start,

                    )

                Text(
                    color = Color.Black,
                    fontSize = 12.sp,
                    text = product?.ingredients ?: "Ingredients not available",
                    fontWeight = FontWeight.Normal,
                    textAlign = TextAlign.Start,
                    modifier = Modifier.padding(bottom = 10.dp)

                )

                Column(
                    modifier = Modifier
                        .padding(top = 40.dp, start = 10.dp, end = 10.dp)
                        .fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    Image(
                        painter = painterResource(id = R.drawable.barcode),
                        contentDescription = "novaimage",
                        modifier = Modifier
                            .size(150.dp)
                    )
                    Text(
                        color = Color.Black,
                        fontSize = 15.sp,
                        text = product?.id ?: "Barcode not available",
                        fontWeight = FontWeight.ExtraBold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .fillMaxWidth().padding(bottom = 20.dp)


                    )

                }


            }


        }


    }

}

/*

Nutri Score
A.-Very good nutritional quality
B.- Good nutritional quality
C.-Average nutritional quality
D.-Poor nutritional quality
E.-Bad nutritional quality
Null.- Missing data score

 */

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun NutriscoreDetails(productViewModel: ProductViewModel?, navController: NavController?) {

    val nutriGrade = productViewModel?.selectedProduct?.nutriScoreGrade
    var imageRoute: Int? = null
    var phrase: String? = null
    var colorType: Color? = null

    when (nutriGrade) {
        "a" -> {
            imageRoute = R.drawable.a
            colorType = GreenLightA
            phrase = "Very good nutritional quality"

        }
        "b" -> {
            imageRoute = R.drawable.b
            colorType = GreenLightB
            phrase = "Good nutritional quality"
        }
        "c" -> {
            imageRoute = R.drawable.c
            colorType = YellowLight
            phrase = "Average nutritional quality"
        }
        "d" -> {
            imageRoute = R.drawable.d
            colorType = OrangeLight
            phrase = "Poor nutritional quality"

        }
        "e" -> {
            imageRoute = R.drawable.e
            colorType = RedLight
            phrase = "Bad nutritional quality"

        }
    }

    Surface(modifier = Modifier
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
                .background(color = colorType ?: GrayLight),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(imageRoute ?: R.drawable.nutriscoreunknown),
                contentDescription = "nutriscore",
                modifier = Modifier
                    .padding(5.dp)
                    .weight(1f)
            )
            Text(
                color = Green,
                fontSize = 18.sp,
                text = phrase ?: "Missing data score",
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier.weight(2f)
            )
        }
    }
}


/*
Eco Score

A.- Very low environmental impact
B.-Low environmental impact
C.-Moderate environmental impact
D.-High environmental impact
E.-Very high environmental impact
Null.- Missing data score

 */

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun EcoScoreDetails(productViewModel: ProductViewModel?, navController: NavController?) {

    val ecoGrade = productViewModel?.selectedProduct?.ecoScoreGrade
    var imageRoute: Int? = null
    var phrase: String? = null
    var colorType: Color? = null

    when (ecoGrade) {
        "a" -> {
            imageRoute = R.drawable.ecoa
            colorType = GreenLightA
            phrase = "Very low environmental impact"

        }
        "b" -> {
            imageRoute = R.drawable.ecob
            colorType = GreenLightB
            phrase = "Low environmental impact"
        }
        "c" -> {
            imageRoute = R.drawable.ecoc
            colorType = YellowLight
            phrase = "Moderate environmental impact"
        }
        "d" -> {
            imageRoute = R.drawable.ecod
            colorType = OrangeLight
            phrase = "High environmental impact"

        }
        "e" -> {
            imageRoute = R.drawable.ecoe
            colorType = RedLight
            phrase = "Very high environmental impact"

        }
    }
    Surface(modifier = Modifier
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
                .background(color = colorType ?: GrayLight),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(imageRoute ?: R.drawable.econull),
                contentDescription = "nutriscore",
                modifier = Modifier
                    .padding(5.dp)
                    .size(50.dp)
                    .weight(1f)
            )
            Text(
                color = Color.Black,
                fontSize = 18.sp,
                text = phrase ?: "Not yet applicable for the category",
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier.weight(2f)
            )
        }
    }
}

/*
Nova Score

1.-Unprocessed or minimally processed foods
2.-Processed culinary ingredients
3.-Processed foods
4.-Ultra processed foods
Null.-Missing data score

 */

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun NovascoreDetails(productViewModel: ProductViewModel?, navController: NavController?) {

    val novaGrade = productViewModel?.selectedProduct?.novGroup
    var phrase: String? = null
    var colorType: Color? = null
    var colorBox: Color? = null

    when (novaGrade) {
        1 -> {
            colorBox = Nova1
            colorType = GreenLightA
            phrase = "Very low environmental impact"

        }
        2 -> {
            colorBox = Nova2
            colorType = GreenLightB
            phrase = "Low environmental impact"
        }
        3 -> {
            colorBox = Nova3
            colorType = YellowLight
            phrase = "Moderate environmental impact"
        }
        4 -> {
            colorBox = Nova4
            colorType = OrangeLight
            phrase = "High environmental impact"

        }

    }
    Surface(modifier = Modifier.clip(RoundedCornerShape(12.dp)), shape = RectangleShape, onClick = {
        productViewModel?.flgScore = "novaescore"
        navController?.navigate("scoreDetails")
    }

    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = colorType ?: GrayLight),
            verticalAlignment = Alignment.CenterVertically
        ) {

            NovaBox(colorBox, novaGrade.toString())

            Text(
                color = Red,
                fontSize = 18.sp,
                text = phrase ?: "Missing nova score",
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier
                    .padding(start = 10.dp, end = 10.dp)
                    .weight(2f)
            )
        }
    }
}

@Composable
fun NovaBox(colorType: Color? = null, novaGrade: String? = null) {
    Box(
        modifier = Modifier
            .background(colorType ?: Color.DarkGray)
            .height(30.dp)
            .width(20.dp)
    ) {
        Text(
            text = novaGrade ?: "?",
            color = Color.White,
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier.padding(
                start = 5.dp, end = 5.dp, top = 2.dp
            ),
            fontSize = 17.sp
        )
    }

}


@Preview(showSystemUi = true, showBackground = true)
@Composable
fun Preview() {
    ProductDetailScreen()
}