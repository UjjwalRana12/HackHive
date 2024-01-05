package com.android.recyclerview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.recyclerview.Adapters.Fifth_Adapter
import com.android.recyclerview.Data_Class.DataBase

class MainActivity4 : AppCompatActivity() {

    lateinit var FvRecycler:RecyclerView
    lateinit var Fv1Recycler:RecyclerView
    lateinit var Fv2Recycler:RecyclerView
//    lateinit var Fv3Recycler:RecyclerView
//    lateinit var Fv4Recycler:RecyclerView
//    lateinit var Fv5Recycler:RecyclerView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        FvRecycler = findViewById(R.id.fifth_recyclerView)
        Fv1Recycler = findViewById(R.id.fifth1_recyclerView)
        Fv2Recycler = findViewById(R.id.fifth2_recyclerView)
//        Fv3Recycler = findViewById(R.id.fifth_recyclerView)
//        Fv4Recycler = findViewById(R.id.fifth_recyclerView)
//        Fv5Recycler = findViewById(R.id.fifth_recyclerView)








        var dataBase = listOf(
            DataBase(listOf(R.drawable.photodo), "burgir", "kulhad pizza"),
            DataBase(listOf(R.drawable.photodo), "burgir", "kulhad pizza"),
            DataBase(listOf(R.drawable.photodo), "burgir", "kulhad pizza"),
            DataBase(listOf(R.drawable.photodo), "burgir", "kulhad pizza"),
            DataBase(listOf(R.drawable.photodo), "burgir", "kulhad pizza"),
            DataBase(listOf(R.drawable.photodo), "burgir", "kulhad pizza"),
        )

        var dataBase1 = listOf(
            DataBase(listOf(R.drawable.photodo), "burgir", "kulhad pizza"),
            DataBase(listOf(R.drawable.photodo), "burgir", "kulhad pizza"),
            DataBase(listOf(R.drawable.photodo), "burgir", "kulhad pizza"),
            DataBase(listOf(R.drawable.photodo), "burgir", "kulhad pizza"),
            DataBase(listOf(R.drawable.photodo), "burgir", "kulhad pizza"),
            DataBase(listOf(R.drawable.photodo), "burgir", "kulhad pizza"),
        )

        var dataBase2= listOf(
            DataBase(listOf(R.drawable.photodo), "burgir", "kulhad pizza"),
            DataBase(listOf(R.drawable.photodo), "burgir", "kulhad pizza"),
            DataBase(listOf(R.drawable.photodo), "burgir", "kulhad pizza"),
            DataBase(listOf(R.drawable.photodo), "burgir", "kulhad pizza"),
            DataBase(listOf(R.drawable.photodo), "burgir", "kulhad pizza"),
            DataBase(listOf(R.drawable.photodo), "burgir", "kulhad pizza"),
        )

        val adapter=Fifth_Adapter(dataBase)
        FvRecycler.layoutManager = LinearLayoutManager(this , LinearLayoutManager.HORIZONTAL,false)
        FvRecycler.adapter=adapter

        val adapter1=Fifth_Adapter(dataBase1)
        Fv1Recycler.layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        Fv1Recycler.adapter=adapter1

        val adapter2=Fifth_Adapter(dataBase2)
        Fv2Recycler.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        Fv2Recycler.adapter=adapter2

        adapter.setClick(object :Fifth_Adapter.ClickKrnepe{

            override fun onClick(position: Int) {
                Toast.makeText(this@MainActivity4,"the position is $position",Toast.LENGTH_SHORT).show()
            }
        })

    adapter1.setClick(object :Fifth_Adapter.ClickKrnepe{
        override fun onClick(position: Int) {
            Toast.makeText(this@MainActivity4,"the position is $position",Toast.LENGTH_SHORT).show()

        }
    })

    adapter2.setClick(object :Fifth_Adapter.ClickKrnepe{
        override fun onClick(position: Int) {
            Toast.makeText(this@MainActivity4,"the position is $position",Toast.LENGTH_SHORT).show()

        }
    })

    }



}