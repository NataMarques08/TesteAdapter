package com.example.testeadapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.testeadapter.adapter.RecyclerViewAdapter
import com.example.testeadapter.adapter.RecyclerViewItem
import com.example.testeadapter.databinding.ActivityMainBinding

    private lateinit var binding : ActivityMainBinding
    private val mainAdapter = RecyclerViewAdapter()

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setPizzaList()
    }

    private fun setPizzaList(){
        binding.recyclerView.apply { 
           adapter = mainAdapter
           layoutManager = LinearLayoutManager(this@MainActivity,LinearLayoutManager.VERTICAL,false)
           setHasFixedSize(true)
        }
        mainAdapter.setList(getList())
        
        
        
    }

    private fun getList(): MutableList<RecyclerViewItem> {
        val lista = mutableListOf<RecyclerViewItem>()
        lista.add(RecyclerViewItem.Pizza1("Pizza Calabresa",R.drawable.pizza))
        lista.add(RecyclerViewItem.Pizza2("Pizza Calabresa2",R.drawable.pizza))
        lista.add(RecyclerViewItem.Pizza1("Pizza Calabresa",R.drawable.pizza))
        lista.add(RecyclerViewItem.Pizza2("Pizza Calabresa2",R.drawable.pizza))
        lista.add(RecyclerViewItem.Pizza1("Pizza Calabresa",R.drawable.pizza))
        lista.add(RecyclerViewItem.Pizza2("Pizza Calabresa2",R.drawable.pizza))
        lista.add(RecyclerViewItem.Pizza1("Pizza Calabresa",R.drawable.pizza))
        lista.add(RecyclerViewItem.Pizza2("Pizza Calabresa2",R.drawable.pizza))
        lista.add(RecyclerViewItem.Pizza1("Pizza Calabresa",R.drawable.pizza))
        lista.add(RecyclerViewItem.Pizza2("Pizza Calabresa2",R.drawable.pizza))
        lista.add(RecyclerViewItem.Pizza1("Pizza Calabresa",R.drawable.pizza))
        lista.add(RecyclerViewItem.Pizza2("Pizza Calabresa2",R.drawable.pizza))
        lista.add(RecyclerViewItem.Pizza1("Pizza Calabresa",R.drawable.pizza))
        lista.add(RecyclerViewItem.Pizza2("Pizza Calabresa2",R.drawable.pizza))
        lista.add(RecyclerViewItem.Pizza1("Pizza Calabresa",R.drawable.pizza))
        lista.add(RecyclerViewItem.Pizza2("Pizza Calabresa2",R.drawable.pizza))


        return lista
    }

}