package com.example.userinterface

import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import com.example.userinterface.R
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.userinterface.ui.theme.DarkBlack
import com.example.userinterface.ui.theme.LiteBlack
import com.example.userinterface.ui.theme.Gold
import com.example.userinterface.ui.theme.LightYellow
import com.example.userinterface.ui.theme.Teal
import com.example.userinterface.ui.theme.Silver
//import com.example.userinterface.ui.theme.EmeraldGreen


import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.ui.text.font.FontWeight
import androidx.navigation.NavController
import com.example.userinterface.ui.theme.EmeraldGreen
import com.google.accompanist.systemuicontroller.rememberSystemUiController



@Composable
fun HomeUI(navController: NavController) {
    SetStatusBarColor()
    Scaffold(
        bottomBar = {
            BottomAppBarExample()
        },
        content = { innerPadding ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding)
                    .background(Color.White)
            ) {
                Column(
                    modifier = Modifier.fillMaxSize()
                ) {
                    Row(
                        modifier = Modifier
                            .background(DarkBlack)
                            .fillMaxWidth()
                            .height(56.dp)
                    ) {
                        Buttons(icon = R.drawable.baseline_menu_24, Color.White,)
                        Column(
                            modifier = Modifier.fillMaxHeight(),
                            verticalArrangement = Arrangement.Center
                        ) {
                            Text(
                                text = "Hi ,  Arbab-Store",
                                style = TextStyle(
                                    fontSize = 20.sp,
                                    color = Color.White,
                                    fontWeight = FontWeight.W700
                                )
                            )
                        }
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.End
                        ) {
                            Buttons(icon = R.drawable.baseline_search_24, Color.White)
                        }
                    }

                    LazyVerticalGrid(
                        columns = GridCells.Fixed(2)

                    ) {
                        items(Data.datalist) { item ->
                            ShowSuit(data = item, navController = navController)
                        }
                    }
                }
            }
        }
    )
}


@Composable
fun ShowSuit(
    data:Data.Demo,

    navController: NavController
){
   Card (shape = RoundedCornerShape(5.dp),
       modifier = Modifier
           .width(175.dp)
           .height(320.dp)
           .padding(vertical = 5.dp, horizontal = 5.dp),

       colors = CardDefaults.cardColors(
           containerColor =  LiteBlack// Change to your desired color
       )
       )
   {
       Box (modifier = Modifier.fillMaxWidth(),
           contentAlignment = Alignment.Center){
            Column (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 5.dp, horizontal = 5.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Spacer(modifier = Modifier.height(13.dp))

                Image(painter = painterResource(id = data.img), contentDescription = "",
                    modifier = Modifier
                        .size(115.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop)


                Spacer(modifier = Modifier.height(9.dp))

                Text(text = data.name, style = TextStyle(
                    fontSize = 19.sp,
                    fontWeight = FontWeight.W600,
                 color = Color.White,
                    textAlign =TextAlign.Center
                ))

                Spacer(modifier = Modifier.height(8.dp))

                Text(text = data.Description, style = TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight.W500,
                 color = Color.White,
                    textAlign =TextAlign.Center
                ))

                Spacer(modifier = Modifier.height(9.dp))

                Button(onClick = { navController.navigate("detail/${data.name}/${data.Description}/${data.img}/${data.price}") },

                        modifier = Modifier.width(100.dp),
                    shape = RoundedCornerShape(18.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Gold
                    )

                    ) {

                    Text(text = "Add",
                        style = TextStyle(
                            fontSize = 12.sp,
                            fontWeight = FontWeight.W600,
                            color = Color.Black

                        ), textAlign = TextAlign.Center
                    )
                }
                Spacer(modifier = Modifier.height(23.dp))

   Row(
       modifier = Modifier.fillMaxWidth(),
       horizontalArrangement = Arrangement.End
   ){



       Text(text = data.price, style = TextStyle(
           fontSize = 16.sp,

           color = Gold ,
           textAlign =TextAlign.Center,
           fontWeight = FontWeight.Bold
       ))
   }



            }

       }
   }
}



@Composable
fun Buttons(
    @DrawableRes icon:Int,
    tint:Color=Color.Unspecified,
){

    IconButton(onClick = { /*TODO*/ }) {
        Icon(painter = painterResource(id = icon), contentDescription = "",tint = tint,modifier = Modifier.size(30.dp))
    }
}





@Composable
fun SetStatusBarColor() {
    val systemUiController = rememberSystemUiController()
    val useDarkIcons = true // or false, depending on the status bar icon color you want

    systemUiController.setStatusBarColor(
        color = LiteBlack, // Set your desired color
        darkIcons = useDarkIcons
    )
}

@Composable
fun BottomAppBarExample() {
    BottomAppBar(
        containerColor = DarkBlack, // Set your desired color
        contentColor = Color.White,
        modifier = Modifier.height(48.dp),
        content = {
            // You can add more content here if needed
            IconButton(onClick = { /* TODO: Handle button click */ }) {
                Icon(painter = painterResource(id = R.drawable.baseline_home_24), contentDescription = "Menu", modifier = Modifier.size(34.dp))
            }
      Spacer(modifier = Modifier.width(60.dp))
            IconButton(onClick = { /* TODO: Handle button click */ }) {
                Icon(painter = painterResource(id = R.drawable.baseline_favorite_24), contentDescription = "fav",modifier = Modifier.size(34.dp))
            }

            Spacer(modifier = Modifier.width(60.dp))

            IconButton(onClick = { /* TODO: Handle button click */ }) {
                Icon(painter = painterResource(id = R.drawable.baseline_psychology_24), contentDescription = "",modifier = Modifier.size(34.dp))
            }

            Spacer(modifier = Modifier.width(68.dp))

            IconButton(onClick = { /* TODO: Handle button click */ }) {
                Icon(painter = painterResource(id = R.drawable.baseline_help_center_24), contentDescription = "Help",modifier = Modifier.size(34.dp))
            }
            // Add more icons or actions here if needed
        }
    )
}