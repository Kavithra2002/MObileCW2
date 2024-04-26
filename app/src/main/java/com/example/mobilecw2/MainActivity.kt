package com.example.mobile_cw_2

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import com.example.mobilecw2.ui.theme.MObileCW2Theme
import com.example.mobilecw2.AddLeguesToDB
import com.example.mobilecw2.SearchForClub
import com.example.mobilecw2.SearchForClubsByLeagues
import com.example.mobilecw2.ui.theme.MObileCW2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MObileCW2Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainScreen()
                }
            }
        }
    }
}

@Composable
fun MainScreen() {
    val context = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Greeting("Android")
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { context.startActivity(Intent(context, AddLeguesToDB::class.java)) }) {
            Text("Add Leagues to DB")
        }
        Spacer(modifier = Modifier.height(8.dp))
        Button(onClick = { context.startActivity(Intent(context, SearchForClubsByLeagues::class.java)) }) {
            Text("Search for Clubs by Leagues")
        }
        Spacer(modifier = Modifier.height(8.dp))
        Button(onClick = { context.startActivity(Intent(context, SearchForClub::class.java)) }) {
            Text("Search for Clubs")
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(
        text = "Hello $name!",
        style = MaterialTheme.typography.titleLarge
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MObileCW2Theme {
        MainScreen()
    }
}

//hiii
