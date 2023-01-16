package com.mcit.sootheapp

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource

@Composable
fun BottomNavigationComponent() {
    BottomNavigation(backgroundColor = MaterialTheme.colors.background) {
        BottomNavigationItem(icon = {
            Icon(
                imageVector = Icons.Default.AccountBox,
                contentDescription = null
            )
        }, label = {
            Text(
                text = stringResource(id = R.string.bottom_navigation_home)
            )
        }, selected = false, onClick = { /*TODO*/ })

        BottomNavigationItem(icon = {
            Icon(
                imageVector = Icons.Default.Person,
                contentDescription = null
            )
        }, label = {
            Text(
                text = stringResource(id = R.string.bottom_navigation_profile)
            )
        }, selected = true, onClick = { /*TODO*/ })
    }
}