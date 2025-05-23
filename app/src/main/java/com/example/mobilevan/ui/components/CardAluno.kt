package com.example.mobilevan.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mobilevan.ui.theme.AzulVann

@Composable
fun CardAluno(
    nome: String,
    escola: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        colors = CardDefaults.cardColors(
            containerColor = AzulVann,
            contentColor = Color.White,
        ),
        shape = RoundedCornerShape(12.dp),
        modifier = modifier
            .size(width = 200.dp, height = 80.dp)
            .clickable(onClick = onClick)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 8.dp, vertical = 12.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = nome,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = escola,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}

@Preview
@Composable
fun CardAlunoPrev() {
    CardAluno(
        nome = "Victor",
        escola = "SPTECH",
        onClick = {}
    )
}