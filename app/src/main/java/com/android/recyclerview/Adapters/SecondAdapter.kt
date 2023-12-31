package com.android.recyclerview.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.recyclerview.Data_Class.Music
import com.android.recyclerview.R

class SecondAdapter(var MusicList:List<Music>):RecyclerView.Adapter<SecondAdapter.SecondViewHolder>() {


    inner class SecondViewHolder(itemview:View):RecyclerView.ViewHolder(itemview){
        val image: ImageView =itemView.findViewById(R.id.imageView)
        val text1: TextView =itemView.findViewById(R.id.textView)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SecondViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.rv_layout,parent,false)
        return SecondViewHolder(view)
    }

    override fun getItemCount(): Int {
        return MusicList.size
    }

    override fun onBindViewHolder(holder: SecondViewHolder, position: Int) {
        val MusicList= MusicList[position]
        holder.apply{
            text1.text = MusicList.title
            image.setImageResource(MusicList.image[0])
        }
    }
}