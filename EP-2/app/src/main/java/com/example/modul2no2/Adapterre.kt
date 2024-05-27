package com.example.modul2no2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapterre(private val cobalagi:ArrayList<cobare>)
    : RecyclerView.Adapter<Adapterre.CobaViewHolder>(){

    var onItemClik : ((cobare) -> Unit)?= null
    class CobaViewHolder(itemView:View): RecyclerView.ViewHolder(itemView){

        val textView : TextView = itemView.findViewById(R.id.textView)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CobaViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_item,parent,false ,)
        return CobaViewHolder(view)
    }
    override fun onBindViewHolder(holder: CobaViewHolder, position: Int) {
        val cobamodul =cobalagi[position]

        holder.textView.text = cobamodul.name

        holder.itemView.setOnClickListener{
            onItemClik?.invoke(cobamodul)
        }
    }

    override fun getItemCount(): Int {
        return cobalagi.size
    }


}