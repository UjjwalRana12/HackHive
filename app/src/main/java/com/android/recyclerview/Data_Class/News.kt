package com.android.recyclerview.Data_Class

data class News(
    val imageResourceIds: List<Int>,
    val title:String,
    val heading:String
)

data class Music(
    val image:List<Int>,
    val title:String
)
