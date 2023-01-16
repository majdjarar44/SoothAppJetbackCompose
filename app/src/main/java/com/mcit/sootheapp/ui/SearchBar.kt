package com.mcit.sootheapp.ui

import android.graphics.drawable.Icon
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mcit.sootheapp.R
import com.mcit.sootheapp.ui.theme.SootheAppTheme

@Composable
fun SearchBar() {
    TextField(
        value = "",
        onValueChange = {},
        leadingIcon = {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = null
            )
        },
        colors = TextFieldDefaults.textFieldColors(backgroundColor = MaterialTheme.colors.surface),
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(56.dp),
        placeholder = {
            Text(stringResource(id = R.string.placeholder_search))
        }
    )
    //use heightIn to a height is compatible with the font for each mobile size
}

@Preview(showBackground = true, backgroundColor = 0xFFF0EAE2)
@Composable
fun SearchBarReview() {
    SootheAppTheme {
        SearchBar()
    }
}