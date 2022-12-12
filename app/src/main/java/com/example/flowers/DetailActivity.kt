package com.example.flowers

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val text1 = findViewById<TextView>(R.id.title)
        val id = intent?.extras?.getString("flowerName").toString()
        text1.text=id

        val text2 = findViewById<TextView>(R.id.country)
        val id2 = intent?.extras?.getString("country").toString()
        text2.text=id2

        val text3 = findViewById<TextView>(R.id.detail)
        val id3 = intent?.extras?.getString("Descr").toString()
        text3.text = id3

        val imageView = findViewById<ImageView>(R.id.flowerimg)
        imageView.setImageResource(intent.extras!!.getInt("image"))


        val shareButton = findViewById<ImageButton>(R.id.imageButton)


        shareButton.setOnClickListener {


            val intent = Intent(Intent.ACTION_SEND).apply {

                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT , "$id")
                putExtra(Intent.EXTRA_TEXT , "$id3")
                type = "text/*"



            }
            startActivity(intent)

        }
    }
}