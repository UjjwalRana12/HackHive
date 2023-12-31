package com.android.recyclerview.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.recyclerview.Data_Class.News
import com.android.recyclerview.R


class MyAdapter(var newsList : List<News>):RecyclerView.Adapter<MyAdapter.MyViewHolder>(){

    inner class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val image:ImageView=itemView.findViewById(R.id.imageView)
        val text1:TextView=itemView.findViewById(R.id.textView)
       // val text2:TextView=itemView.findViewById(R.id.textView2)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.rv_layout,parent,false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
       return newsList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentNews = newsList[position]
        holder.apply{
            text1.text = currentNews.heading
           // text2.text= currentNews.title
            // Assuming that imageResourceIds is a list of image resource IDs
            if (currentNews.imageResourceIds.isNotEmpty()) {
                // Set the first image resource ID
                image.setImageResource(currentNews.imageResourceIds[0])
            }

        }

    }
}