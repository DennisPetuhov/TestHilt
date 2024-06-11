package com.example.testhilt.screens

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import com.example.testhilt.HomeViewModel


@Composable
fun MyScreen(modifier: Modifier = Modifier, vm: HomeViewModel) {
    val msg by vm.message.collectAsState()
    Row(modifier = modifier.fillMaxSize()) {
        Button(onClick = { vm.fetchData() }) {

        }
        Text(text = msg)
    }

}