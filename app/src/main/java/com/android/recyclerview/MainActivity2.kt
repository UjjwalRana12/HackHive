package com.android.recyclerview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.recyclerview.Adapters.ThirdAdapter
import com.android.recyclerview.Data_Class.Songs

class MainActivity2 : AppCompatActivity() {
    lateinit var songRecyclerView: RecyclerView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        songRecyclerView=findViewById(R.id.Song_recyclerView)
        val SongList = listOf(
            Songs("project 1",listOf(R.drawable.rectangle_52),"view Project","Duis aute irure dolor in velit esse cillum incididunt ut labore Project"),
            Songs("project 2",listOf(R.drawable.rectangle_52),"View Project","Duis aute irure dolor in velit esse cillum incididunt ut labore Project"),
            Songs("project 3",listOf(R.drawable.rectangle_52),"View Project","Duis aute irure dolor in velit esse cillum incididunt ut labore Project"),
            Songs("project 4",listOf(R.drawable.rectangle_52),"View Project","View Duis aute irure dolor in velit esse cillum incididunt ut labore Project"),
            Songs("project 5",listOf(R.drawable.rectangle_52),"View Project","View Duis aute irure dolor in velit esse cillum incididunt ut laboreProject")
        )
        val song_adapter =ThirdAdapter(SongList)
        songRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        songRecyclerView.adapter=song_adapter

        song_adapter.setClick(object :ThirdAdapter.OnClickListener{

            override fun OnItemClick(positon: Int) {
                Toast.makeText(this@MainActivity2,"you clicked on position $positon",Toast.LENGTH_SHORT).show()
            }
        })


    }

}