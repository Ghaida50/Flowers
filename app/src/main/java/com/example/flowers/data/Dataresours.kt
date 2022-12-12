package com.example.flowers.data

import com.example.flowers.R
import com.example.flowers.model.Flower

class Datasource {
    //return list of data
    fun loadData( ):List<Flower>{
        return listOf(
            Flower(R.string.tulip,R.string.tulip_c,R.drawable.tulip,R.string.tulip_d) ,
            Flower(R.string.sunflower,R.string.sunflower_c,R.drawable.sunflower,R.string.sunflower_d),
            Flower(R.string.lavender,R.string.lavender_c,R.drawable.lavender,R.string.lavender_d),
            Flower(R.string.cherry,R.string.cherry_c,R.drawable.cherry,R.string.cherry_d),
            Flower(R.string.rose,R.string.rose_c,R.drawable.rose,R.string.rose_d)
        )
    }
}