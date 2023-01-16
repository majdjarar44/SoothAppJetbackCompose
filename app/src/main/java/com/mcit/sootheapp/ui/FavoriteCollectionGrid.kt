package com.mcit.sootheapp.ui

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.mcit.sootheapp.LazyGridScopeImpl
import com.mcit.sootheapp.LazyHorizontalGrid
import com.mcit.sootheapp.R
import com.mcit.sootheapp.items
import com.mcit.sootheapp.ui.model.HorizontalData

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun FavoriteCollectionGrid() {

    LazyHorizontalGrid(cells = GridCells.Fixed(2), contentPadding = PaddingValues( 16.dp)) {
        items(itemsGridLayout) {item->
           FavoriteCollectionCards(Modifier,item.title,item.image)
        }
    }
}

val itemsGridLayout = listOf(
    R.drawable.fc1_short_mantras to R.string.fc1_short_mantras,
    R.drawable.fc2_nature_meditations to R.string.fc2_nature_meditations,
    R.drawable.fc3_stress_and_anxiety to R.string.fc3_stress_and_anxiety,
    R.drawable.fc4_self_massage to R.string.fc4_self_massage,
    R.drawable.fc5_overwhelmed to R.string.fc5_overwhelmed,
    R.drawable.fc6_nightly_wind_down to R.string.fc6_nightly_wind_down,

    ).map { HorizontalData(it.first, it.second) }

