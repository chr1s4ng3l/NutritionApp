package com.example.nutritionapp.view.bottomnav

import android.Manifest
import android.annotation.SuppressLint
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.nutritionapp.ui.theme.Grayt
import com.example.nutritionapp.ui.theme.Teal200
import com.example.nutritionapp.viewmodel.ProductViewModel
import com.google.accompanist.permissions.ExperimentalPermissionsApi
import com.google.accompanist.permissions.rememberPermissionState

@OptIn(ExperimentalPermissionsApi::class)
@SuppressLint("UnusedMaterialScaffoldPaddingParameter", "PermissionLaunchedDuringComposition")
@Composable
fun BottomNav() {

    val navController = rememberNavController()
    val productViewModel: ProductViewModel = hiltViewModel()
    val cameraPermissionState =
        rememberPermissionState(permission = Manifest.permission.CAMERA)




    Scaffold(bottomBar = { BottomBar(navHostController = navController) }) {

        cameraPermissionState.launchPermissionRequest()
        BottomNavGraph(productViewModel = productViewModel, navHostController = navController)


    }

}

@Composable
fun BottomBar(navHostController: NavHostController) {

    val screens = listOf(

        BottomBarScreen.Home,
        BottomBarScreen.Profile
    )

    val navStackBackEntry by navHostController.currentBackStackEntryAsState()
    val currentDestination = navStackBackEntry?.destination

    Row(
        Modifier
            .background(Color.White)
            .fillMaxWidth().background(color = Grayt),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {

        screens.forEach { screen ->
            AddItem(
                screen = screen,
                currentDestination = currentDestination,
                navHostController = navHostController
            )
        }

    }

}

@Composable
fun RowScope.AddItem(
    screen: BottomBarScreen,
    currentDestination: NavDestination?,
    navHostController: NavHostController
) {

    val selected = currentDestination?.hierarchy?.any { it.route == screen.route } == true

    val background =
        if (selected) Teal200.copy(0.6f) else Color.Transparent

    val contentColor =
        if (selected) Color.White else Color.Black

    Box(
        modifier = Modifier
            .height(40.dp)
            .clip(CircleShape)
            .background(background)
            .clickable(onClick = {
                navHostController.navigate(screen.route) {
                    popUpTo(navHostController.graph.findStartDestination().id)
                    launchSingleTop = true
                }
            })
    ) {

        Row(
            modifier = Modifier
                .padding(start = 50.dp, end = 50.dp, top = 8.dp, bottom = 8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(4.dp),
        ) {

            Icon(
                painter = painterResource(id = if (selected) screen.iconFocused else screen.icon),
                contentDescription = "icon",
                tint = contentColor
            )

            AnimatedVisibility(visible = selected) {
                Text(
                    text = screen.title,
                    color = contentColor

                )
            }
        }
    }

}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun BottomNavPreview() {
    BottomNav()

}













