package com.jephter.weatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.ListView

class HomeActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val listView = findViewById<ListView>(R.id.listView)
        val searchbutton = findViewById<ImageView>(R.id.searchbutton)


        searchbutton.setOnClickListener{
            val searchView = findViewById<EditText>(R.id.searchView)
            searchView.visibility=  View.GONE
        }



    }
}