package com.hsalihkucuk.jatpackcodev4

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow

class AnaSayfa : Screen {
    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    override fun Content(){
        val navigator = LocalNavigator.currentOrThrow

        Scaffold(topBar = { TopAppBar(title = { Text(text = "Ana Sayfa") }) }) { paddingValues ->
            Column(modifier = Modifier.fillMaxSize().padding(paddingValues), verticalArrangement = Arrangement.SpaceEvenly, horizontalAlignment = Alignment.CenterHorizontally) {
                Button(onClick = {
                    navigator.push(SayfaA())
                }) {
                    Text(text = "Git -> A", fontSize = 32.sp)
                }
                Button(onClick = {
                    navigator.push(SayfaX())
                }) {
                    Text(text = "Git -> X", fontSize = 32.sp)
                }
            }
        }
    }
}