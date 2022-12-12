package com.example.flowers.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.flowers.DetailActivity
import com.example.flowers.R
import com.example.flowers.model.Flower

// TODO [1] Implement Adapter Class
class FlowerAdapter(private val context: Context, private val dataset: List<Flower>) :
    RecyclerView.Adapter<FlowerAdapter.ViewHolder>() {
    // TODO [3] Implement Adapter override methods

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_flower, parent, false)
        return ViewHolder(itemLayout)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = dataset[position]
        holder.name.text = context.resources.getString(item.name)
        holder.fCountry.text = context.resources.getString(item.farmingCountry)
        holder.imageView.setImageResource(item.img)
      //  holder.textdescrption .text = context.resources.getString(item.description)
        holder.card.setOnClickListener {
            Toast.makeText(context,context.resources.getString(item.name), Toast.LENGTH_SHORT).show()

            val context = holder.itemView.context
            val intent = Intent(context,DetailActivity:: class.java)
            intent.putExtra("flowerName",context.resources.getString(item.name))
            intent.putExtra("Descr",context.resources.getString(item.description))
            intent.putExtra("country",context.resources.getString(item.farmingCountry))
            intent.putExtra("image",item.img)
            context.startActivity(intent)
        }
    }

    override fun getItemCount() = dataset.size
    // TODO [2] Implement ViewHolder Class

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val name: TextView = view.findViewById(R.id.txt1)
        val fCountry: TextView = view.findViewById(R.id.txt2)
        val imageView: ImageView = view.findViewById(R.id.img)
        val card: CardView= view.findViewById(R.id.card)
        val textdescrption: TextView =view.findViewById(R.id.details)

    }



}