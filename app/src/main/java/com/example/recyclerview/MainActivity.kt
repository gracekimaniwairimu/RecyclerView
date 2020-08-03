package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import layout.AgeRecyclerViewAdapter
import layout.NamesRecyclerViewAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvNames.layoutManager = LinearLayoutManager(baseContext)
        val namesAdapter = NamesRecyclerViewAdapter(
            listOf(
                "Grace",
                "Pau",
                "James",
                "Major",
                "Linda",
                "Brenda",
                "Steph",
                "Cecilia",
                "Promise"
            )
        )
        rvNames.adapter = namesAdapter
        rvAge.layoutManager = LinearLayoutManager(baseContext)
        var ageAdapter = AgeRecyclerViewAdapter(listOf<Int>(20, 15, 19, 27, 70, 36, 12, 39, 60, 20))
        //rvAge.adapter = AgeAdapter

    }

}