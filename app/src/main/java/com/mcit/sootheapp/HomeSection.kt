package com.mcit.sootheapp

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

@Composable
fun HomeSection(modifier: Modifier = Modifier, title: Int, content: @Composable () -> Unit) {
    Column(modifier = modifier) {
        Text(text = stringResource(id = title).uppercase(),
            style = MaterialTheme.typography.h6,
            modifier = Modifier
                .padding(start = 16.dp, top = 16.dp, bottom = 0.dp)
        )
        content()
    }
}