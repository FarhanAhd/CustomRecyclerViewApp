package com.example.customrecyclerviewapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val itemList = listOf(
            Item("Item 1", R.drawable.ic_launcher_foreground, false),
            Item("Item 2", R.drawable.ic_launcher_foreground, true),
            Item("Item 3", R.drawable.ic_launcher_foreground, false)
            // Add more items as needed
        )

        val itemAdapter = ItemAdapter(itemList)
        recyclerView.adapter = itemAdapter
    }
}

