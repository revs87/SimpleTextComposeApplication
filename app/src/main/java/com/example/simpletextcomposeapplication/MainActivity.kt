package com.example.simpletextcomposeapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.ui.Modifier
import com.example.simpletextcomposeapplication.theme.MyTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val navTitle = getString(R.string.app_name)

        setContent {
            MyTheme {
                Scaffold(
                    topBar = { TopAppBar(title = { Text(text = navTitle) }) },
                    modifier = Modifier.fillMaxSize()
                ) { padding ->
                    Surface(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(padding)
                    ) {


                    }
                }
            }
        }
    }
}