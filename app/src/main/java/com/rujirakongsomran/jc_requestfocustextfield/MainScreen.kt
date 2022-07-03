package com.rujirakongsomran.jc_requestfocustextfield

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rujirakongsomran.jc_requestfocustextfield.ui.theme.JC_RequestFocusTextFieldTheme

@Composable
fun MainScreen() {
    val focusRequester = remember { FocusRequester() }
    var value by remember { mutableStateOf("") }

    LaunchedEffect(key1 = Unit) {
        focusRequester.requestFocus()
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(40.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextField(
            modifier = Modifier.focusRequester(focusRequester),
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