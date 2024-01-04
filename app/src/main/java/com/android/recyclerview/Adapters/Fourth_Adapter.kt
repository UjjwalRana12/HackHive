package com.android.recyclerview.Adapters

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.recyclerview.Data_Class.Songs
import com.android.recyclerview.R
import org.w3c.dom.Text

class Fourth_Adapter(var Flist:List<Songs>):RecyclerView.Adapter<Fourth_Adapter.fourth_adapterView>() {
    inner class fourth_adapterView(fourthView: View):RecyclerView.ViewHolder(fourthView){
        val FrvText: TextView =itemView.findViewById(R.id.frv_text)
        val FrvImage: ImageView = itemView.findViewById(R.id.frv_image)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): fourth_adapterView {
        val Fview= LayoutInflater.from(parent.context).inflate(R.layout.fourth_layout,parent,false)
        return fourth_adapterView(Fview)
    }

    override fun getItemCount(): Int {
        return Flist.size
    }

    override fun onBindViewHolder(holder: fourth_adapterView, position: Int) {
       val Flist=Flist[position]
        holder.apply {
            FrvText.text=Flist.Artist
            FrvImage.setImageResource(Flist.project_image[0])
        }
    }
}