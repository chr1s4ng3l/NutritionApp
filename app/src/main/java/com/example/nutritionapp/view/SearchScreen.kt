package com.example.nutritionapp.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.nutritionapp.ui.theme.CardBlack
import com.example.nutritionapp.viewmodel.ProductViewModel

@Composable
fun SearchScreen(
    search: String,
    productViewModel: ProductViewModel? = null,
    navController: NavController? = null,
    onValueChange: (String) -> Unit
) {

    val focusRequester = remember { FocusRequester() }
    val focusManager = LocalFocusManager.current
    var errorState by remember { mutableStateOf(false) }


    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {

        OutlinedTextField(value = search,
            onValueChange = { onValueChange(it) },
            isError = errorState,
            leadingIcon = {
                Icon(
                    Icons.Default.Search,
                    contentDescription = "search",
                    tint = Color.Black
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
                .focusRequester(focusRequester),
            shape = RoundedCornerShape(16.dp),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = CardBlack, unfocusedBorderColor = Color.Green, textColor = Color.Black
            ),
            placeholder = { Text(text = "Search") },
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Done),
            keyboardActions = KeyboardActions(
                onDone = {

                    if (search.isEmpty()) {
                        errorState = true
                    } else {
                        productViewModel?.tag = search
                        navController?.navigate("products")
                        focusManager.clearFocus()
                  }

                }
            )

        )

        LaunchedEffect(Unit) {
            focusRequester.requestFocus()
        }
    }

}

@Composable
fun ShowProductsBySearch(productViewModel: ProductViewModel?, navController: NavController?) {
    var tag by remember {
        mutableStateOf("")
    }
    SearchScreen(search = tag, productViewModel, navController) {
        tag = it
    }


}


@Preview(showSystemUi = true, showBackground = true)
@Composable
fun ScreenPreview() {
    //ShowProductsBySearch()
}