package com.example.image_slider_recycler_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var myRecyclerView: RecyclerView
    lateinit var myArrayList : ArrayList<Products>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myRecyclerView = findViewById(R.id.recyclerView)

        val myProducts = arrayOf(
            R.drawable.img2,
            R.drawable.img3,
            R.drawable.img4,
            R.drawable.img5,
            R.drawable.img6,
            R.drawable.img7,
            R.drawable.img8,
            R.drawable.img9,
            R.drawable.img1,
        )

        myRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)
        myArrayList = arrayListOf<Products>()

        for (index in myProducts.indices){
            val product = Products(myProducts[index])
            myArrayList.add(product)
        }

        var adapter = MyAdapter (myArrayList, this)
        myRecyclerView.adapter =MyAdapter(myArrayList,this)


    }
}