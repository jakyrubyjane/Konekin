package com.example.konekin

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.konekin.databinding.SuperheroBinding
import com.example.konekin.model.Users
import com.squareup.picasso.Picasso

class SuperheroAdapter (var heros:List<Users>): RecyclerView.Adapter<SuperheroAdapter.HeroViewHolder>()
{
    inner class HeroViewHolder(val binding: SuperheroBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroViewHolder {
        val binding = SuperheroBinding.inflate(LayoutInflater.from(parent.context))
        return HeroViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return heros.size
    }

    override fun onBindViewHolder(holder: HeroViewHolder, position: Int) {
        holder.itemView.apply {
            with(holder.binding){
                hero.text=heros[position].title
                Picasso.get().load(heros[position].image).into(poster)
            }
        }
    }


}