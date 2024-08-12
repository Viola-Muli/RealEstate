package com.example.realestate.ui.theme.screens.detail

import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Canvas
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.realestate.R
import com.example.realestate.navigation.ROUT_DETAIL
import com.example.realestate.navigation.ROUT_INTENT
import com.example.realestate.navigation.ROUT_PROPERTY
import com.example.realestate.ui.theme.Dark
import com.example.realestate.ui.theme.Darkcyan
import com.example.realestate.ui.theme.Darkergreen
import kotlin.reflect.KProperty

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailsScreen(navController: NavController){

    Column (modifier = Modifier.fillMaxSize()){

        TopAppBar(
            title = { Text(text ="MagicBricks", fontFamily = FontFamily.Cursive, fontSize = 20.sp)},
            colors = TopAppBarDefaults.mediumTopAppBarColors(Dark),
            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Menu, contentDescription = "", tint = Color.LightGray)
                    
                }
            },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Notifications,
                        contentDescription = "",
                        tint = Color.LightGray
                    )
                }
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(imageVector = Icons.Default.Call, contentDescription = "", tint = Color.LightGray)


                }

            }

        )

        Box (modifier = Modifier
            .fillMaxWidth()
            .height(280.dp),
            contentAlignment = Alignment.Center){
            Image(painter = painterResource(id = R.drawable.img), contentDescription = "home",
                modifier = Modifier.fillMaxSize()
            )

            Text(
                text = "Choose your best property",
                fontSize = 20.sp,
                color = Color.DarkGray ,
                fontWeight = FontWeight.ExtraBold,
                textAlign = TextAlign.Center
            )
        }


        //Search-bar
        var search by remember { mutableStateOf("")  }
            OutlinedTextField(
                value = search,
                onValueChange ={search = it},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 20.dp),
                leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = "search")},
                placeholder = { Text(text = "What is your location?")}

            )
        //End of search bar

        Spacer(modifier = Modifier.height(20.dp))

        Row(modifier = Modifier
            .padding(start = 20.dp)
            .horizontalScroll(rememberScrollState())) {
            //card1
            Card(modifier = Modifier
                .height(180.dp)
                .width(200.dp)) {
                Box (modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
                    Image(painter = painterResource(id = R.drawable.img_1), contentDescription = "home",
                        modifier = Modifier.fillMaxSize(), contentScale = ContentScale.Crop)

                }
            }
            Spacer(modifier = Modifier.width(20.dp))


            //card2
            Card(modifier = Modifier
                .height(180.dp)
                .width(200.dp)) {
                Box (modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
                    Image(painter = painterResource(id = R.drawable.img_5), contentDescription = "home",
                        modifier = Modifier.fillMaxSize(), contentScale = ContentScale.Crop)

                }
            }
            Spacer(modifier = Modifier.width(20.dp))

            //card3
            Card(modifier = Modifier
                .height(180.dp)
                .width(200.dp)) {
                Box (modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
                    Image(painter = painterResource(id = R.drawable.img_2), contentDescription = "home",
                        modifier = Modifier.fillMaxSize(), contentScale = ContentScale.Crop)

                }
            }
            Spacer(modifier = Modifier.width(20.dp))

            //card4
            Card(modifier = Modifier
                .height(180.dp)
                .width(200.dp)) {
                Box (modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
                    Image(painter = painterResource(id = R.drawable.img_3), contentDescription = "home",
                        modifier = Modifier.fillMaxSize(), contentScale = ContentScale.Crop)

                }
            }
            Spacer(modifier = Modifier.width(20.dp))

            //card5
            Card(modifier = Modifier
                .height(180.dp)
                .width(200.dp)) {
                Box (modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
                    Image(painter = painterResource(id = R.drawable.img_4), contentDescription = "home",
                        modifier = Modifier.fillMaxSize(), contentScale = ContentScale.Crop)

                }
            }


        }
        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = { navController.navigate(ROUT_PROPERTY) },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 70.dp, end = 70.dp)
                .height(40.dp),
            colors = ButtonDefaults.buttonColors(Color.Black),
            shape = RoundedCornerShape(100.dp)
        ) {
            Text(
                text = "CONTINUE"
            )

        }




























    }
}

private operator fun Any.getValue(nothing: Nothing?, property: KProperty<*>): Any {
    TODO("Not yet implemented")
}

@Composable
@Preview(showBackground = true)
fun DetailsScreenpreview(){
    DetailsScreen(rememberNavController() )

}