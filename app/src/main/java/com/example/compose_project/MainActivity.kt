package com.example.compose_project

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose_project.ui.theme.Compose_projectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Compose_projectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    // Row
                    Row(
                        modifier = Modifier
                            .height(500.dp)
                            .width(500.dp)
                            .background(Color.LightGray),
                            horizontalArrangement = Arrangement.Start

                    ) {
                        CustomItem(weight = 1f, color = MaterialTheme.colorScheme.error)
                        CustomItem(weight = 3f)
                    }

                    // Column
                    Column(
                        modifier = Modifier
                            .height(500.dp)
                            .width(500.dp)
                            .background(Color.LightGray),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        CustomItem(weight = 1f, color = MaterialTheme.colorScheme.error)
                        CustomItem(weight = 3f)
                    }
                }
            }
        }
    }
}

// Row Compose
@Composable
fun RowScope.CustomItem(weight: Float, color: Color = MaterialTheme.colorScheme.primary) {
    Surface(
        modifier = Modifier
            .width(50.dp)
            .height(50.dp)
            .weight(weight),
        color = color
    ) {}
}

// Column compose
@Composable
fun ColumnScope.CustomItem(weight: Float, color: Color = MaterialTheme.colorScheme.primary) {
    Surface(
        modifier = Modifier
            .width(50.dp)
            .weight(weight),
        color = color
    ) {}
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Compose_projectTheme {
        Row(
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.Start
        ) {
            CustomItem(weight = 1f, color = MaterialTheme.colorScheme.error)
            CustomItem(weight = 3f)
        }

        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            CustomItem(weight = 1f, color = MaterialTheme.colorScheme.error)
            CustomItem(weight = 3f)
        }
    }
}