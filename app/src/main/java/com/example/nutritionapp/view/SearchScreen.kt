package com.example.nutritionapp.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.nutritionapp.R

@Composable
fun SearchScreen(search: String, onValueChange: (String) -> Unit) {

    val focusRequester = remember{ FocusRequester() }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {

        OutlinedTextField(value = search,
            onValueChange = { onValueChange(it) },
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
            placeholder = { Text(text = stringResource(R.string.search)) }
        )

        LaunchedEffect(Unit) {
            focusRequester.requestFocus()
        }

    }

}


@Preview(showSystemUi = true, showBackground = true)
@Composable
fun ScreenPreview() {
    SearchScreen("" ){

    }
}