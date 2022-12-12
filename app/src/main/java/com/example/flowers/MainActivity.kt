package com.example.flowers

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.flowers.adapter.FlowerAdapter
import com.example.flowers.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val datset = Datasource().loadData()


        val recyclerView = findViewById<RecyclerView>(R.id.rv)

        val adapter = FlowerAdapter(this, datset)

        recyclerView.adapter = adapter

        recyclerView.setHasFixedSize(true)

       // val layoutManager=GridLayoutManager(this,2)
       // recyclerView.layoutManager=layoutManager




    }
}