package com.example.testeadapter.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.testeadapter.databinding.ListaActivity2Binding
import com.example.testeadapter.databinding.ListaActivityBinding

class RecyclerViewAdapter : RecyclerView.Adapter<RecyclerViewHolder>() {

    private var lista = mutableListOf<RecyclerViewItem>()

    fun setList(lista : List<RecyclerViewItem>){
        this.lista = lista.toMutableList()
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder = when(viewType){
           PIZZA1 -> RecyclerViewHolder.PizzaViewHolder(ListaActivityBinding.inflate(LayoutInflater.from(
               parent.context
           ),parent,false))
           PIZZA2 -> RecyclerViewHolder.PizzaViewHolder2(
               ListaActivity2Binding.inflate(LayoutInflater.from(
               parent.context
           ),parent,false))
           else -> throw IllegalArgumentException("Error")
       }


    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        when(holder){
            is RecyclerViewHolder.PizzaViewHolder -> holder.bind(lista[position] as RecyclerViewItem.Pizza1)
            is RecyclerViewHolder.PizzaViewHolder2 -> holder.bind(lista[position] as RecyclerViewItem.Pizza2)
        }
    }

    override fun getItemViewType(position: Int): Int = when(lista[position]){
            is RecyclerViewItem.Pizza1 -> PIZZA1
            is RecyclerViewItem.Pizza2 -> PIZZA2

    }

    override fun getItemCount(): Int = lista.size

    companion object{
        const val PIZZA1 = 1
        const val PIZZA2 = 2
    }

}