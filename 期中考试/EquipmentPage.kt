package com.example.middleexam

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController
import com.example.middleexam.UserData

@Composable
fun EquipmentPage(navController: NavHostController,commodity: List<Equipment>){
    Column{
        for (i in commodity.indices) {
            Text(text = commodity[i].name)
            Text(text = "装备信息")
            Image(painter = painterResource(id =R.drawable.ic_launcher_foreground), contentDescription = null)
            Text(text = "Android")
        }
        Button(onClick = {
            navController.navigate("Home")
        }) {
            Text(text = "home")
        }
    }
}