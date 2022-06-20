package com.example.testeadapter.adapter

sealed class RecyclerViewItem{

    class Pizza1(
        val nome : String,
        val imagem : Int
    ) : RecyclerViewItem()
    class Pizza2(
        val nome : String,
        val imagem : Int
    ) : RecyclerViewItem()

}
