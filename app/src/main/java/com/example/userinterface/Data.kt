package com.example.userinterface

import androidx.annotation.DrawableRes

object Data {

    class Demo(
        @DrawableRes
        var img:Int,
        var name:String,
        var Description :String,
        var price:String
    )
    var datalist = listOf(
        Demo(
            R.drawable.a_09,
            name ="Black Jacket" ,
          Description = "The Best Jacket In Pakistan Market",
            price = "1000Rs"
        ),
        Demo(
            R.drawable.b_09,
            name ="Pent Coat" ,
            Description = "The Best Coat In Pakistan Market",
            price = "5000Rs"
        ),
        Demo(
            R.drawable.c_09,
            name ="T-Shits" ,
            Description = "The Best T-shirts In Pakistan Market",
            price = "800Rs"
        ),
        Demo(
              R.drawable.d_09,
        name ="Formal Dress" ,
        Description = "The Best Dress In Pakistan Market",
        price = "1000Rs"
    ),  Demo(
            R.drawable.a_09,
            name ="Black Jacket" ,
            Description = "The Best Jacket In Pakistan Market",
            price = "1000Rs"
        ),
        Demo(
            R.drawable.b_09,
            name ="Pent Coat" ,
            Description = "The Best Coat In Pakistan Market",
            price = "5000Rs"
        ),
        Demo(
            R.drawable.c_09,
            name ="T-Shits" ,
            Description = "The Best T-sg=hits In Pakistan Market",
            price = "800Rs"
        ),
        Demo(
            R.drawable.d_09,
            name ="Formal Dress" ,
            Description = "The Best Dress In Pakistan Market",
            price = "1000Rs"
        ),  Demo(
            R.drawable.a_09,
            name ="Black Jacket" ,
            Description = "The Best Jacket In Pakistan Market",
            price = "1000Rs"
        ),
        Demo(
            R.drawable.b_09,
            name ="Pent Coat" ,
            Description = "The Best Coat In Pakistan Market",
            price = "5000Rs"
        ),
        Demo(
            R.drawable.c_09,
            name ="T-Shits" ,
            Description = "The Best T-sg=hits In Pakistan Market",
            price = "800Rs"
        ),
        Demo(
            R.drawable.d_09,
            name ="Formal Dress" ,
            Description = "The Best Dress In Pakistan Market",
            price = "1000Rs"
        )
    )
}