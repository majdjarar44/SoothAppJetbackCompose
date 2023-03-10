package com.mcit.sootheapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mcit.sootheapp.ui.AlignHorizontalItems
import com.mcit.sootheapp.ui.AlignYourBodyElement
import com.mcit.sootheapp.ui.FavoriteCollectionGrid
import com.mcit.sootheapp.ui.SearchBar
import com.mcit.sootheapp.ui.theme.SootheAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SootheAppTheme {
                Scaffold(
                    bottomBar = { BottomNavigationComponent() }
                ) {
                    HomeScreenAllComponent()

                }
            }
        }
    }
}

