package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCard()
        }
    }
}

@Composable
fun BusinessCard() {
    Surface(
        color = Color(0xFFE0F7FA),
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            // Logo
            Image(
                painter = painterResource(R.drawable.android_logo),
                contentDescription = "Android Logo",
                modifier = Modifier
                    .size(64.dp)
                    .padding(bottom = 8.dp)
            )
            
            // Nom
            Text(
                text = "Gnamien Abigaïl",
                fontSize = 24.sp,
                color = Color(0xFF00796B),
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(bottom = 4.dp)
            )
            // Fonction
            Text(
                text = "Directrice Générale",
                fontSize = 16.sp,
                color = Color(0xFF004D40),
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(bottom = 16.dp)
            )

            Spacer(modifier = Modifier.height(24.dp))

            // Coordonnées
            ContactInfo()
        }
    }
}

@Composable
fun ContactInfo() {
    Column {
        // Numéro de téléphone
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                imageVector = Icons.Default.Phone,
                contentDescription = "Numéro de téléphone",
                tint = Color(0xFF00796B),
                modifier = Modifier
                    .padding(end = 8.dp)
                    .width(24.dp)
            )
            Text(text = "+225 05 00 57 51 66")
        }
        Spacer(modifier = Modifier.height(4.dp))

        // Email
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                imageVector = Icons.Default.Email,
                contentDescription = "Email",
                tint = Color(0xFF00796B),
                modifier = Modifier
                    .padding(end = 8.dp)
                    .width(24.dp) //
            )
            Text(text = "abigailvictoiregnamien@gmail.com")
        }
        Spacer(modifier = Modifier.height(4.dp))

        // Localisation
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                imageVector = Icons.Default.LocationOn,
                contentDescription = "Localisation",
                tint = Color(0xFF00796B),
                modifier = Modifier
                    .padding(end = 8.dp)
                    .width(24.dp) //
            )
            Text(text = "Abidjan, Côte d'Ivoire")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewBusinessCard() {
    BusinessCard()
}