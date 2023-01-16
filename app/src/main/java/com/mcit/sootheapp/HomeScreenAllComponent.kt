package com.mcit.sootheapp

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.mcit.sootheapp.ui.AlignHorizontalItems
import com.mcit.sootheapp.ui.FavoriteCollectionGrid
import com.mcit.sootheapp.ui.SearchBar

@Composable
fun HomeScreenAllComponent() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background
    ) {
        Column {
            SearchBar()
            HomeSection(Modifier,R.string.align_your_body){
                AlignHorizontalItems()
            }
            HomeSection(Modifier,R.string.favorite_collections){
                FavoriteCollectionGrid()
            }

        }
    }
}