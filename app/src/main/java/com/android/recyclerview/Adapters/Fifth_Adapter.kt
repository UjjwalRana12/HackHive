package com.android.recyclerview.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.recyclerview.Data_Class.DataBase
import com.android.recyclerview.R

class Fifth_Adapter(var dataBase: List<DataBase>):RecyclerView.Adapter<Fifth_Adapter.FifthViewHolder>(){


  private lateinit var Newlistener:ClickKrnepe
    interface ClickKrnepe {
        fun onClick(position: Int)
    }

    fun setClick(listener:ClickKrnepe){
        Newlistener=listener
    }


    inner class FifthViewHolder(itemView:View, listener: ClickKrnepe):RecyclerView.ViewHolder(itemView){

        var Image:ImageView=itemView.findViewById(R.id.fifth_rv_image)
        var text1 : TextView=itemView.findViewById(R.id.fifth_rv_textView)
        var text2:TextView=itemView.findViewById(R.id.fifth_rv_Tv)


        init {
            itemView.setOnClickListener{
                listener.onClick(adapterPosition)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FifthViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.fifth_layout,parent,false)
        return FifthViewHolder(view,Newlistener)
    }

    override fun getItemCount(): Int {
        return dataBase.size
    }

    override fun onBindViewHolder(holder: FifthViewHolder, position: Int) {
        var CurrentStatus=dataBase[position]
        holder.apply {
            text1.text=CurrentStatus.food
            text2.text=CurrentStatus.Restaurant
            Image.setImageResource(CurrentStatus.image[0])
        }
    }
}