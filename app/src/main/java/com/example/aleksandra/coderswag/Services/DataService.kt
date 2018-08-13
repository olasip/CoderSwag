package com.example.aleksandra.coderswag.Services

import com.example.aleksandra.coderswag.Model.Category
import com.example.aleksandra.coderswag.Model.Product

object DataService {
    val categories = listOf(
            Category("SHIRTS","shirtimage"),
            Category("HOODIES","hoodiesimage"),
            Category("HATS","hatimage"),
            Category("DIGITAL","digitalgoodsimage")
    )

    val hats = listOf(
            Product("Devslopes Graphic Beanie", price = "$18",image = "hat01"),
            Product("Devslopes Hat Black", price = "$20",image = "hat02"),
            Product("Devslopes Hat White", price = "$18",image = "hat03"),
            Product("Devslopes Hat Snapback", price = "$22",image = "hat04")
    )

    val hoodies = listOf(

            Product("Devslopes Hoodie Gray", "$28", "hoodie01"),
            Product("Devslopes Hoodie Red", "$32", "hoodie02"),
            Product("Devslopes Gray Hoodie", "$28", "hoodie03"),
            Product("Devslopes Black Hoodie", "$32", "hoodie04")
            )

    val shirts = listOf(
            Product("Devslopes Shirt Black", "$18", "shirt01"),
            Product("Devslopes Badge Light Gray", "$20", "shirt02"),
            Product("Devslopes Logo Shirt Red", "$22", "shirt03"),
            Product("Devslopes Hustle", "$32", "shirt04"),
            Product("Kickflip Studios","$18","shirt05")


    )


}