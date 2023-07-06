package com.example.dummy

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview("TaskManagersScreen")
@Composable
fun TaskManagersScreen() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        CompleteImage()
        TextFirst()
        TextSecond()
    }

}

/**
 * 完了画像表示
 */
@Composable
fun CompleteImage() {
    Image(
        painter = painterResource(id = R.drawable.ic_task_completed),
        contentDescription = null
    )
}

/**
 * テキスト１
 */
@Composable
fun TextFirst() {
    Text(
        text = stringResource(R.string.text_1),
        textAlign = TextAlign.Center,
        modifier = Modifier
            .padding(top = 24.dp, bottom = 8.dp),
        fontWeight = FontWeight.Bold,
    )
}

/**
 * テキスト２
 */
@Composable
fun TextSecond() {
    Text(
        text = stringResource(R.string.text_2),
        textAlign = TextAlign.Center,
        fontSize = 16.sp
    )
}