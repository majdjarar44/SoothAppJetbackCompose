package com.mcit.sootheapp

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
@ExperimentalFoundationApi
private fun FixedLazyGrid(
    nRows: Int,
    modifier: Modifier = Modifier,
    state: LazyListState = rememberLazyListState(),
    contentPadding: PaddingValues = PaddingValues(0.dp),
    scope: LazyGridScopeImpl
) {
    val columns = (scope.totalSize + nRows - 1) / nRows
    LazyRow(
        modifier = modifier,
        state = state,
        contentPadding = contentPadding,
    ) {
        items(columns) { columnIndex ->
            Column {
                for (rowIndex in 0 until nRows) {
                    val itemIndex = columnIndex * nRows + rowIndex
                    if (itemIndex < scope.totalSize) {
                        Box(
                            modifier = Modifier.wrapContentSize(),
                            propagateMinConstraints = true
                        ) {
                            scope.contentFor(itemIndex, this@items).invoke()
                        }
                    } else {
                        Spacer(Modifier.weight(1f, fill = true))
                    }
                }
            }
        }
    }
}