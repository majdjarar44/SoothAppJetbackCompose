package com.mcit.sootheapp.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mcit.sootheapp.R
import com.mcit.sootheapp.ui.theme.SootheAppTheme

@Composable
fun FavoriteCollectionCards(modifier: Modifier = Modifier,title:Int,image:Int) {
    Surface(shape = MaterialTheme.shapes.small, modifier = modifier.padding(4.dp)) {
        Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.width(192.dp)) {
            Image(
                painter = painterResource(id = image),
                contentDescription = null,
                modifier = Modifier.size(56.dp),
                contentScale = ContentScale.Crop
            )
            Text(text = stringResource(id = title))
        }
    }


}

@Preview(backgroundColor = 0xFFF0EAE2, showBackground = true)
@Composable
fun FavoriteCollectionCardsReview() {
    SootheAppTheme {

    }
}