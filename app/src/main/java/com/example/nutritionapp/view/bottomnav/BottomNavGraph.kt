package com.example.nutritionapp.view.bottomnav

import android.app.Activity
import android.content.pm.ActivityInfo
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.nutritionapp.view.*
import com.example.nutritionapp.viewmodel.ProductViewModel


@Composable
fun BottomNavGraph(productViewModel: ProductViewModel, navHostController: NavHostController) {


    NavHost(navController = navHostController, startDestination = BottomBarScreen.Home.route) {
        composable(route = BottomBarScreen.Home.route) {

            CameraPreview(productViewModel, navHostController)
        }
        composable(route = BottomBarScreen.Profile.route) {
            ProfileScreen()
        }

        composable("products") {
            productViewModel.getProductByCode(productViewModel.barcode)
            ProductScreen(productViewModel = productViewModel, navHostController)

        }


        composable("details") {
            ProductDetailScreen(productViewModel = productViewModel)

        }


        composable("search") {
            SearchScreen("", {})

        }


    }

}

