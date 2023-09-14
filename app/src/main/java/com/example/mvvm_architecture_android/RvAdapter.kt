package com.example.mvvm_architecture_android

import android.content.Context
import android.icu.lang.UCharacter.GraphemeClusterBreak.V
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvm_architecture_android.databinding.RvItemBinding

class RvAdapter(var context: Context, var noteList: List<DataEntity>) :
    RecyclerView.Adapter<RvAdapter.ViewHolder>() {

    class ViewHolder(val binding: RvItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = RvItemBinding.inflate(LayoutInflater.from(context),parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return noteList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.textView.text=noteList.get(position).note
    }


}