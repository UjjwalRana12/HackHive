package com.android.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.recyclerview.Adapters.Fourth_Adapter
import com.android.recyclerview.Data_Class.Songs

class MainActivity3 : AppCompatActivity() {
    lateinit var FourthRecyclerView:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        FourthRecyclerView=findViewById(R.id.FourthRecycler)

        val Flist= listOf(
            Songs("hello", listOf(R.drawable.photodo),"Song","artist1 jdhvjh"),
            Songs("hello", listOf(R.drawable.photocheh),"Song","artist2 djbcjdbc"),
            Songs("hello", listOf(R.drawable.photochaar),"Song","artist3"),
            Songs("hello", listOf(R.drawable.photopaanch),"Song","artist4"),
            Songs("hello", listOf(R.drawable.photosaath),"Song","artist4"),
            Songs("hello", listOf(R.drawable.photoek),"Song","artist4"),
            Songs("hello", listOf(R.drawable.photodo),"Song","artist4"),
            Songs("hello", listOf(R.drawable.photodo),"Song","artist4"),

        )
       val fourthAdapter= Fourth_Adapter(Flist)
       FourthRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        FourthRecyclerView.adapter=fourthAdapter
    }
}