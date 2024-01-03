package com.android.recyclerview.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.recyclerview.Data_Class.Songs
import com.android.recyclerview.R

class ThirdAdapter(val Songlist:List<Songs>):RecyclerView.Adapter<ThirdAdapter.ThirdViewHolder>() {

    inner class ThirdViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        val sl_image:ImageView=itemView.findViewById(R.id.sl_ImageView)
        val sl_text:TextView=itemView.findViewById(R.id.sl_textView)
        val sl_button:Button=itemView.findViewById(R.id.sl_Button)
        val sl_heading:TextView=itemView.findViewById(R.id.sl_heading)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ThirdViewHolder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.song_layout,parent,false)
        return ThirdViewHolder(view)
    }

    override fun getItemCount(): Int {
        return Songlist.size
    }

    override fun onBindViewHolder(holder: ThirdViewHolder, position: Int) {
        val currentSong=Songlist[position]
        holder.apply{
            sl_text.text=currentSong.Artist
            sl_button.text=currentSong.Song
            sl_heading.text=currentSong.heading
            sl_image.setImageResource(currentSong.project_image[0])

        }
    }
}