package com.example.intern

import android.os.Bundle
import android.widget.Adapter
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    lateinit var recyclerView : RecyclerView
    lateinit var titles: ArrayList<String>
    lateinit var images:ArrayList<Int>
    lateinit var adapter : adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recycler_view)
        titles = ArrayList<String>()
        images = ArrayList<Int>()
        titles.add("English")
        titles.add("Science")
        titles.add("Commererce")
        titles.add("Arts")
        titles.add("Design")
        titles.add("architecture")
        titles.add("Category 7")
        titles.add("Category 8 ")
        titles.add("Category 9")
        titles.add("Category 10")
        images.add(R.drawable.math)
        images.add(R.drawable.rocket)
        images.add(R.drawable.math)
        images.add(R.drawable.rocket)
        images.add(R.drawable.math)
        images.add(R.drawable.rocket)
        images.add(R.drawable.math)
        images.add(R.drawable.rocket)
        images.add(R.drawable.math)
        images.add(R.drawable.rocket)
        adapter = adapter(this, titles, images)

        val gridLayoutManager =
            GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false)
        recyclerView.layoutManager = gridLayoutManager;
        recyclerView.adapter = adapter;
    }
}
