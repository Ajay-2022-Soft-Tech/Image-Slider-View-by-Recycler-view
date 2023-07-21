package com.example.image_slider_recycler_view

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter (var iPhoneProducts : ArrayList<Products>, var context : Activity)
    :RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    class MyViewHolder (itemView : View):RecyclerView.ViewHolder(itemView){
        val iphoneImage = itemView.findViewById<ImageView>(R.id.iPhoneImage)!!


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.each_item,parent,false)
        return MyViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: MyAdapter.MyViewHolder, position: Int) {
        val currentItem = iPhoneProducts[position]
        holder.iphoneImage.setImageResource(currentItem.imageArray)


    }

    override fun getItemCount(): Int {
        return iPhoneProducts.size
    }
}


