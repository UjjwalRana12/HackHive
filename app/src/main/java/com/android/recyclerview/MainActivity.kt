package com.android.recyclerview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.recyclerview.Adapters.MyAdapter
import com.android.recyclerview.Data_Class.News

class MainActivity : AppCompatActivity() {
    // Declare the recyclerView properties without initialization
    lateinit var recyclerView1: RecyclerView
    lateinit var recyclerView2: RecyclerView
    lateinit var recyclerView3: RecyclerView
    lateinit var recyclerView4: RecyclerView
    lateinit var recyclerView5: RecyclerView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize the recyclerView properties here
        recyclerView1 = findViewById(R.id.rv_first)
        recyclerView2 = findViewById(R.id.rv_second)
        recyclerView3 = findViewById(R.id.rv_third)
        recyclerView4 = findViewById(R.id.rv_fourth)
        recyclerView5 = findViewById(R.id.rv_fifth)

        val newsList1 = listOf(
            News(listOf(R.drawable.photocheh), "Title 1", "Heading 1"),
            News(listOf(R.drawable.photocheh), "Title 2", "Heading 2"),
            News(listOf(R.drawable.photocheh), "Title 3", "Heading 3"),
            News(listOf(R.drawable.photocheh), "Title 3", "Heading 3"),
            News(listOf(R.drawable.photocheh), "Title 3", "Heading 3"),
            // Add more items as needed
        )

        val newsList2 = listOf(
            News(listOf(R.drawable.photodo), "Title 4", "Heading 4"),
            News(listOf(R.drawable.photodo), "Title 5", "Heading 5"),
            News(listOf(R.drawable.photodo), "Title 6", "Heading 6"),
            News(listOf(R.drawable.photodo), "Title 6", "Heading 6"),
            News(listOf(R.drawable.photodo), "Title 6", "Heading 6"),
            News(listOf(R.drawable.photodo), "Title 6", "Heading 6"),
            // Add more items as needed
        )

        val newsList3 = listOf(
            News(listOf(R.drawable.photodo), "Title 7", "Heading 7"),
            News(listOf(R.drawable.photodo), "Title 8", "Heading 8"),
            News(listOf(R.drawable.photodo), "Title 9", "Heading 9"),
            News(listOf(R.drawable.photodo), "Title 9", "Heading 9"),
            News(listOf(R.drawable.photodo), "Title 9", "Heading 9"),
            News(listOf(R.drawable.photodo), "Title 9", "Heading 9"),
            // Add more items as needed
        )

        val newsList4 = listOf(
            News(listOf(R.drawable.photodo), "Title 10", "Heading 10"),
            News(listOf(R.drawable.photodo), "Title 11", "Heading 11"),
            News(listOf(R.drawable.photodo), "Title 11", "Heading 11"),
            News(listOf(R.drawable.photodo), "Title 11", "Heading 11"),
            News(listOf(R.drawable.photodo), "Title 11", "Heading 11"),
            News(listOf(R.drawable.photodo), "Title 12", "Heading 12"),
            // Add more items as needed
        )

        val newsList5 = listOf(
            News(listOf(R.drawable.photodo), "Title 13", "Heading 13"),
            News(listOf(R.drawable.photodo), "Title 13", "Heading 13"),
            News(listOf(R.drawable.photodo), "Title 13", "Heading 13"),
            News(listOf(R.drawable.photodo), "Title 13", "Heading 13"),
            News(listOf(R.drawable.photodo), "Title 14", "Heading 14"),
            News(listOf(R.drawable.photodo), "Title 15", "Heading 15"),
            // Add more items as needed
        )

        val adapter1 = MyAdapter(newsList1)
        recyclerView1.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView1.adapter = adapter1

        val adapter2 = MyAdapter(newsList2)
        recyclerView2.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView2.adapter = adapter2

        val adapter3 = MyAdapter(newsList3)
        recyclerView3.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView3.adapter = adapter3

        val adapter4 = MyAdapter(newsList4)
        recyclerView4.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView4.adapter = adapter4

        val adapter5 = MyAdapter(newsList5)
        recyclerView5.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView5.adapter = adapter5
    }
}
