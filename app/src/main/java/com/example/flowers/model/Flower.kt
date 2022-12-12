package com.example.flowers.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Flower(@StringRes val name:Int, @StringRes val farmingCountry : Int, @DrawableRes val img :Int,@StringRes val description : Int)
