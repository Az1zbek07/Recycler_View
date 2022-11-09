package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.adapter.RecyclerViewAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var recyclerViewAdapter: RecyclerViewAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recyclerView)

        recyclerViewAdapter = RecyclerViewAdapter(footballClubs())

        recyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = recyclerViewAdapter
        }
    }

    private fun footballClubs(): MutableList<String>{
        return mutableListOf(
            "Real Madrid",
            "Barcelona",
            "Bayern",
            "Liverpool",
            "MCity",
            "MYU",
            "PSG",
            "Chelsea",
            "Tottenham",
            "Real Madrid",
            "Barcelona",
            "Bayern",
            "Liverpool",
            "MCity",
            "MYU",
            "PSG",
            "Chelsea",
            "Tottenham"
        )
    }
}