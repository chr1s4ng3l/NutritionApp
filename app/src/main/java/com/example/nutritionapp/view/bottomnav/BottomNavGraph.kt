package com.example.nutritionapp.view.bottomnav

import androidx.compose.foundation.layout.size
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.nutritionapp.ui.theme.Teal200
import com.example.nutritionapp.view.*
import com.example.nutritionapp.view.scoresdetails.DetailScreen
import com.example.nutritionapp.viewmodel.ProductViewModel


@Composable
fun BottomNavGraph(productViewModel: ProductViewModel, navHostController: NavHostController) {


    NavHost(navController = navHostController, startDestination = BottomBarScreen.Home.route) {
        composable(route = BottomBarScreen.Home.route) {

            CameraPreview(productViewModel, navHostController)
        }
        composable(route = BottomBarScreen.Profile.route) {
            productViewModel.getProductHistory()
            ProductHistoryScreen(productViewModel = productViewModel, navHostController)

        }

        composable("search") {

            Scaffold(
                topBar = {
                    MyToolbar("Search", navController = navHostController)
                }, backgroundColor = Color.White,
                content = {
                    it.calculateTopPadding()
                    it.calculateBottomPadding()

                    ShowProductsBySearch(productViewModel, navHostController)
                })
        }

        composable("products") {
            if (productViewModel.tag.isNotEmpty()) {
                productViewModel.getProductByTag(productViewModel.tag)
                Scaffold(
                    topBar = {
                        MyToolbar(productViewModel.tag, navController = navHostController)
                    }, backgroundColor = Color.White,
                    content = {
                        it.calculateTopPadding()
                        it.calculateBottomPadding()

                        ProductTagScreen(
                            productViewModel = productViewModel,
                            navController = navHostController
                        )
                    })


            } else if (productViewModel.barcode.isNotEmpty()) {
                productViewModel.getProductByCode(productViewModel.barcode)

                Scaffold(
                    topBar = {
                        MyToolbar(productViewModel.barcode, navController = navHostController)
                    }, backgroundColor = Color.White,
                    content = {
                        it.calculateTopPadding()
                        it.calculateBottomPadding()

                        ProductScreen(productViewModel = productViewModel, navHostController)
                    })
            }

        }


        composable("details") {

            Scaffold(
                topBar = {
                    productViewModel.selectedProduct?.productName?.let { it1 ->
                        MyToolbar(
                            it1,
                            navController = navHostController
                        )
                    }
                }, backgroundColor = Color.White,
                content = {
                    it.calculateTopPadding()
                    it.calculateBottomPadding()

                    ProductDetailScreen(productViewModel = productViewModel, navHostController)
                })
        }

        composable("ScoreDetails") {

            Scaffold(
                topBar = {
                    MyToolbar("ScoreDetails", navController = navHostController)
                }, backgroundColor = Color.White,
                content = {
                    it.calculateTopPadding()
                    it.calculateBottomPadding()

                    DetailScreen(productViewModel)
                })
        }

    }

}

@Composable
fun MyToolbar(title: String, navController: NavHostController) {
    TopAppBar(
        title = { Text(text = title) },
        backgroundColor = Teal200,
        navigationIcon = {
            IconButton(onClick = { navController.popBackStack() }) {
                Icon(Icons.Default.ArrowBack, contentDescription = "Back")
            }
        },
    )
}




