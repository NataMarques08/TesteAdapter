package com.example.testeadapter.adapter

import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.example.testeadapter.databinding.ListaActivity2Binding
import com.example.testeadapter.databinding.ListaActivityBinding

sealed class RecyclerViewHolder(
    private val _binding : ViewBinding
    ) : RecyclerView.ViewHolder(_binding.root){

        class PizzaViewHolder(
            private val _binding: ListaActivityBinding
            ) : RecyclerViewHolder(_binding){
                fun bind(p : RecyclerViewItem.Pizza1){
                    _binding.tvPizza.text = p.nome
                    _binding.imgPizza.setImageResource(p.imagem)
                }
            }

        class PizzaViewHolder2(
            private val _binding: ListaActivity2Binding
        ) : RecyclerViewHolder(_binding){
            fun bind(p: RecyclerViewItem.Pizza2){
                _binding.tvPizza.text = p.nome
                _binding.imgPizza.setImageResource(p.imagem)
            }
        }

}
