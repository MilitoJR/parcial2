package com.example.parcial2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.TextView


private lateinit var tv_Mostrar: TextView
private lateinit var lv_Lista : ListView

private val nombre = arrayOf("Perro","Gato","Iguana","Tiburon", "Araña")
private val especie = arrayOf()


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }





}