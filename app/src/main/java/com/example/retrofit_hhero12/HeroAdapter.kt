package com.example.retrofit_hhero12

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.retrofit_hhero12.databinding.ItemHeroBinding
import com.example.retrofit_hhero12.model.DataHero
import com.squareup.picasso.Picasso

class HeroAdapter(private var listHero: List<DataHero>) :
    RecyclerView.Adapter<HeroAdapter.ItemHeroViewHolder>() {

    inner class ItemHeroViewHolder(private val binding: ItemHeroBinding) :
        RecyclerView.ViewHolder(binding.root) {


        fun bind(data: DataHero) {
            with(binding) {
                txtTitle.text = data.title
                idGambar.text = data.id.toString()

                Picasso.get()
                    .load(data.image)
                    .error(R.drawable.yayaw)
                    .into(imageHero)
            }
        }
    }

    fun setDataHero(newData: List<DataHero>) {
        listHero = newData
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHeroViewHolder {
        val binding = ItemHeroBinding.inflate(
            LayoutInflater.from(parent.context),
            parent, false
        )
        return ItemHeroViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemHeroViewHolder, position: Int) {
        holder.bind(listHero[position])
    }

    override fun getItemCount(): Int = listHero.size
}