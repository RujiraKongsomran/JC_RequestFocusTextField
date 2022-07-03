package com.rujirakongsomran.jc_requestfocustextfield

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rujirakongsomran.jc_requestfocustextfield.ui.theme.JC_RequestFocusTextFieldTheme

@Composable
fun MainScreen() {
    var value by remember { mutableStateOf("") }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(40.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextField(
            value = value,
            onValueChange = { value = it },
            placeholder = {
                Text(text = "Enter your name")
            }
        )
    }
}

@Preview(showSystemUi = true)
@Composable
fun MainScreenPreview() {
    JC_RequestFocusTextFieldTheme {
        MainScreen()
    }
}