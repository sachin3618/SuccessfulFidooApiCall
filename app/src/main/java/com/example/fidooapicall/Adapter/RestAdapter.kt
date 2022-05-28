package com.example.fidooapicall.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.fidooapicall.R
import com.example.fidooapicall.databinding.ResListBinding
import com.example.fidooapicall.model.Curation

class RestAdapter(val ResList: List<Curation>) : RecyclerView.Adapter<RestAdapter.MyViewHolder>() {

   inner class MyViewHolder(val binding: ResListBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = ResListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        /*holder.binding.tvCruise.text = ResList[position]*/
        with(holder){
            with(ResList[position]){
                binding.tvCruise.text = cusine_name
                Glide.with(holder.itemView.context)
                    .load(image)
                    .into(binding.ivCruisine)
            }
        }
    }

    override fun getItemCount(): Int {
        return ResList.size
    }
}