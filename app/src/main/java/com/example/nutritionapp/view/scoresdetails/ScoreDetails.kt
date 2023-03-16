package com.example.nutritionapp.view.scoresdetails

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.nutritionapp.R
import com.example.nutritionapp.ui.theme.GreenLight
import com.example.nutritionapp.viewmodel.ProductViewModel

@Composable
fun DetailScreen(productViewModel: ProductViewModel? = null) {
    when (productViewModel?.flgScore) {
        "nutriscore" -> {
            NutriScoreDetails()

        }
        "novaescore" -> {
            NovaScoreDetails()

        }
        "ecoescore" -> {
            EcoScoreDetails()

        }
    }
}

@Composable
fun EcoScoreDetails() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .background(Color.White)
    ) {

        Text(
            text = stringResource(R.string.EcoTitle),
            fontSize = 25.sp,
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier.padding(top = 10.dp, start = 10.dp, end = 10.dp),
            color = Color.Black
        )
        
        MyImage(imageId = R.drawable.ecoscorea)


        Text(
            text = stringResource(R.string.EcoSubtitle1),
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 5.dp, bottom = 5.dp, start = 10.dp, end = 10.dp),
            color = Color.Black
        )
        
        MySurface(R.string.EcoSubtitle1a, R.string.EcoSubtitle1a1, R.string.EcoBody1)


        Text(
            text = stringResource(R.string.EcoSubtitle2),
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 5.dp, bottom = 5.dp, start = 10.dp, end = 10.dp),
            color = Color.Black
        )

        Text(
            text = stringResource(R.string.EcoBody2),
            fontSize = 12.sp,
            fontWeight = FontWeight.Normal,
            modifier = Modifier.padding(10.dp),
            color = Color.Black
        )
        
        MyImage(imageId = R.drawable.ecoscoreimpactenvironnemental)


        Text(
            text = stringResource(R.string.EcoSupport),
            fontSize = 12.sp,
            fontWeight = FontWeight.Normal,
            modifier = Modifier.padding(10.dp),
            color = Color.Black
        )

        MyImage(imageId = R.drawable.ecoscoreacteurs)

        Text(
            text = stringResource(R.string.EcoSubtitle3),
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 5.dp, bottom = 5.dp, start = 10.dp, end = 10.dp),
            color = Color.Black
        )

        MySurface(R.string.EcoSubtitle3a, R.string.EcoSubtitle3a1, R.string.EcoBody3)

        Text(
            text = stringResource(R.string.moreInfoEco),
            fontSize = 12.sp,
            fontWeight = FontWeight.Normal,
            color = Color.Blue,
            textDecoration = TextDecoration.Underline,
            modifier = Modifier.padding(
                start = 10.dp, end = 10.dp, top = 5.dp, bottom = 50.dp
            )
        )

    }

}

@Composable
fun NovaScoreDetails() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .background(Color.White)
    ) {

        Text(
            text = stringResource(R.string.NovaTitle),
            fontSize = 25.sp,
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier.padding(top = 10.dp, start = 10.dp, end = 10.dp),
            color = Color.Black
        )
        Text(
            text = stringResource(R.string.NovaSubtitle),
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 5.dp, bottom = 5.dp, start = 10.dp, end = 10.dp),
            color = Color.Black
        )

        Text(
            text = stringResource(R.string.NovaBody1),
            fontSize = 12.sp,
            fontWeight = FontWeight.Normal,
            modifier = Modifier.padding(10.dp),
            color = Color.Black
        )

       // MyImage(imageId = R.drawable.novascoregroup)

        Text(
            text = stringResource(R.string.NovaElement),
            fontSize = 12.sp,
            fontWeight = FontWeight.Normal,
            modifier = Modifier.padding(10.dp),
            color = Color.Black
        )

        Text(
            text = stringResource(R.string.NovaWhatIs),
            fontSize = 18.sp,
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier.padding(
                start = 10.dp, end = 10.dp, top = 5.dp, bottom = 5.dp
            ),
            color = Color.Black
        )


        MySurfaceBody(R.string.NovaDefine)


        MyImage(imageId = R.drawable.novatable)

        Text(
            text = stringResource(R.string.moreInfoNova),
            fontSize = 12.sp,
            fontWeight = FontWeight.Normal,
            color = Color.Blue,
            textDecoration = TextDecoration.Underline,
            modifier = Modifier.padding(
                start = 10.dp, end = 10.dp, top = 5.dp, bottom = 50.dp
            )
        )


    }
}


@Composable
fun NutriScoreDetails() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .background(Color.White)
    ) {

        Text(
            text = stringResource(R.string.NutriScoreTitle),
            fontSize = 25.sp,
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier.padding(10.dp),
            color = Color.Black
        )


        MyImage(imageId = R.drawable.nutridetails)


        MySurface(R.string.nutriInfoTile, R.string.nutribody, R.string.nutribody2)


        Text(
            text = stringResource(R.string.tableNutriScore),
            fontSize = 18.sp,
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier.padding(
                start = 10.dp, end = 10.dp, top = 5.dp, bottom = 5.dp
            ),
            color = Color.Black
        )
        Text(
            text = stringResource(R.string.tableLooks),
            fontSize = 12.sp,
            fontWeight = FontWeight.Normal,
            modifier = Modifier.padding(
                start = 10.dp, end = 10.dp, top = 5.dp, bottom = 5.dp
            ),
            color = Color.Black
        )

        MyImage(imageId = R.drawable.nutritable)

        MySurfaceBody(body = R.string.explication)


        MyImage(imageId = R.drawable.nutrite)

        Text(
            text = stringResource(R.string.moreInfo),
            fontSize = 12.sp,
            fontWeight = FontWeight.Normal,
            color = Color.Blue,
            textDecoration = TextDecoration.Underline,
            modifier = Modifier.padding(
                start = 10.dp, end = 10.dp, top = 5.dp, bottom = 50.dp
            )
        )


    }
}


@Preview(showSystemUi = true, showBackground = true)
@Composable
fun MyPreviewScreen() {
    //NutriScoreDetails()
    EcoScoreDetails()

}


@Composable
fun MySurface(
    title: Int? = null, subtitle: Int? = null, body: Int? = null
) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                start = 10.dp, end = 10.dp, top = 5.dp, bottom = 5.dp
            ), shape = RoundedCornerShape(12.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = GreenLight)
        ) {
            Column {
                Text(
                    text = stringResource(title ?: R.string.empty), modifier = Modifier.padding(
                        start = 10.dp, end = 10.dp, top = 5.dp, bottom = 5.dp
                    ), fontWeight = FontWeight.ExtraBold, fontSize = 12.sp, color = Color.Black
                )

                Text(
                    text = stringResource(subtitle ?: R.string.empty), modifier = Modifier.padding(
                        start = 10.dp, end = 10.dp, top = 5.dp, bottom = 5.dp
                    ), fontWeight = FontWeight.Normal, fontSize = 12.sp, color = Color.Black
                )

                Text(
                    text = stringResource(body ?: R.string.empty), modifier = Modifier.padding(
                        start = 10.dp, end = 10.dp, top = 5.dp, bottom = 5.dp
                    ), fontWeight = FontWeight.Normal, fontSize = 12.sp, color = Color.Black
                )
            }


        }
    }

}

@Composable
fun MySurfaceBody(
    body: Int? = null
) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                start = 10.dp, end = 10.dp, top = 5.dp, bottom = 5.dp
            ), shape = RoundedCornerShape(12.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = GreenLight)
        ) {
            Column {
                Text(
                    text = stringResource(body ?: R.string.empty), modifier = Modifier.padding(
                        start = 10.dp, end = 10.dp, top = 5.dp, bottom = 5.dp
                    ), fontWeight = FontWeight.Normal, fontSize = 12.sp, color = Color.Black
                )
            }


        }
    }

}


@Composable
fun MyImage(imageId: Int) {
    Image(
        painter = painterResource(id = imageId),
        contentDescription = "novaimage",
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 10.dp, end = 10.dp, top = 5.dp, bottom = 5.dp)
    )

}