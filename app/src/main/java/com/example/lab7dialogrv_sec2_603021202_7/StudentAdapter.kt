package com.myweb.lab7dialogrv

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lab7dialogrv_sec2_603021202_7.R
import kotlinx.android.synthetic.main.std_item_layout.view.*

class StudentAdapter(val items : List<Student>, val context: Context) : RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view_item = LayoutInflater.from(parent.context).inflate(R.layout.std_item_layout, parent, false)
        return ViewHolder(view_item)
    }
    override fun getItemCount(): Int {
       return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       holder.tvID?.text = "รหัสนักศึกษา : " + items[position].id
        holder.tvName?.text = "ชื่อ : " + items[position].name
        holder.tvAge?.text = "รหัสนักศึกษา : " + items[position].age.toString()
    }
}

class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
    val tvID = view.tv_id
    val tvName = view.tv_name
    val tvAge = view.tv_age
}