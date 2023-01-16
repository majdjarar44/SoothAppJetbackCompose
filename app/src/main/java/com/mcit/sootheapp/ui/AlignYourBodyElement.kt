package com.mcit.sootheapp.ui

import android.graphics.drawable.PaintDrawable
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.graphics.PaintCompat
import com.mcit.sootheapp.R
import com.mcit.sootheapp.ui.theme.SootheAppTheme

@Composable
fun AlignYourBodyElement(
    modifier: Modifier = Modifier,
    @DrawableRes image: Int,
    @StringRes text: Int
) {
    Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            painter = painterResource(image),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(88.dp)
                .clip(CircleShape)
        )
//        Text(
//            text = stringResource(text),
//            style = MaterialTheme.typography.h1,
//            modifier = Modifier.paddingFromBaseline(top = 8.dp, 4.dp)
//        )
        Text(
            text = stringResource(id = text),
            style = MaterialTheme.typography.h6,
            modifier = Modifier.padding(start = 10.dp)
        )
    }
}

@Preview(backgroundColor = 0xFFF0EAE2, showBackground = true)
@Composable
fun AlignYourBodyElementReview() {
    SootheAppTheme {
//        AlignYourBodyElement(Modifier.padding(8.dp))
    }
}