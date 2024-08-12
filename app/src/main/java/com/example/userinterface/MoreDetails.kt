import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.userinterface.BottomAppBarExample
import com.example.userinterface.Buttons
import com.example.userinterface.R
import com.example.userinterface.ui.theme.DarkBlack
import com.example.userinterface.ui.theme.Gold
import com.example.userinterface.ui.theme.Silver

@Composable
fun DetailScreen(name: String, description: String, imageResId: Int, price: String) {
        Scaffold(
                bottomBar = {
                        BottomAppBarExample2()
                },
                content = { innerPadding ->    Box(
                modifier = Modifier
                        .background(DarkBlack)
                        .padding(innerPadding)
        ) {
                Column(
                        modifier = Modifier
                                .fillMaxSize()
                                .padding(16.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                ) {
                        Card(
                                shape = CircleShape,
                                modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(16.dp)
                        ) {
                                Image(
                                        painter = painterResource(id = imageResId),
                                        contentDescription = null,
                                        contentScale = ContentScale.Crop,
                                        modifier = Modifier
                                                .fillMaxWidth()
                                                .padding(16.dp)
                                )
                        }

                        Text(
                                text = name,
                                style = TextStyle(
                                        fontSize = 24.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = Silver
                                )
                        )

                        Text(
                                text = description,
                                style = TextStyle(
                                        fontSize = 16.sp,
                                        fontWeight = FontWeight.Normal
                                        , color = Color.White
                                ),
                                modifier = Modifier.padding(top = 8.dp)
                        )

                        Text(
                                text = "Price: $price",
                                style = TextStyle(
                                        fontSize = 18.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = Gold

                                        ),
                                modifier = Modifier.padding(top = 16.dp)
                        )


                        Spacer(modifier = Modifier.height(16.dp))

                        // "Buy" Button
                        Button(
                                onClick = { /* TODO: Implement buy functionality */ },
                                modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(horizontal = 16.dp),
                                colors = ButtonDefaults.buttonColors(
                                        containerColor = Gold// Gold color or any other color you prefer
                                )
                        ) {
                                Text(
                                        text = "Buy",
                                        style = TextStyle(
                                                fontSize = 18.sp,
                                                fontWeight = FontWeight.Bold,
                                                color = Color.Black
                                        )
                                )
                        }
                }
        }}
        )}


@Composable
fun BottomAppBarExample2() {
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