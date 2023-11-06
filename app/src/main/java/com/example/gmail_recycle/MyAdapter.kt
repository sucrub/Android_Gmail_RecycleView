package com.example.gmail_recycle

import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val sender: List<String>, val content: List<String>, val time: List<String>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    class MyViewHolder(val row: View) : RecyclerView.ViewHolder(row) {
        val sender = row.findViewById<TextView>(R.id.sender)
        val content = row.findViewById<TextView>(R.id.content)
        val time = row.findViewById<TextView>(R.id.time)
        val senderLetter = row.findViewById<TextView>(R.id.senderLetter)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.item_view,
            parent, false)
        return MyViewHolder(layout)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.senderLetter.text = sender.get(position)[0].toString()
        holder.sender.text = sender.get(position)
        holder.content.text = content.get(position)
        holder.content.maxLines = 1
        holder.content.ellipsize = TextUtils.TruncateAt.END
        holder.time.text = time.get(position)
    }

    override fun getItemCount(): Int = sender.size
}