package com.example.nutritionapp.view.bottomnav

import com.example.nutritionapp.R

sealed class BottomBarScreen(

    val route: String,
    val title: String,
    val icon: Int,
    val iconFocused: Int


) {

    object Home : BottomBarScreen(

        route = "home",
        title = "Home",
        icon = R.drawable.ic_bottom_home,
        iconFocused = R.drawable.ic_bottom_home_focused
    )

    object Profile : BottomBarScreen(
        route = "history",
        title = "History",
        icon = R.drawable.ic_bottom_profile,
        iconFocused = R.drawable.ic_bottom_profile_focused
    )
}
