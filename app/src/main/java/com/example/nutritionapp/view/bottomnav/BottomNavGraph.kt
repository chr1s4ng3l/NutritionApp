package com.example.nutritionapp.view.bottomnav

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.nutritionapp.view.CameraPreview
import com.example.nutritionapp.view.ProductScreen
import com.example.nutritionapp.view.ProfileScreen
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

        }

    }

}

