package com.example.myapplication.Tuan2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.myapplication.R

class Tuan22ScActivity : AppCompatActivity() {
    var tv1:TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan22_sc)
        tv1=findViewById(R.id.t22tv1)
        var i1=intent
        val chuoi1=i1.extras!!.getString("so1")
        val chuoi2=i1.extras!!.getString("so2")
        val so1 = chuoi1!!.toFloat()
        val so2 = chuoi2!!.toFloat()
        val tong = so1+so2
        tv1!!.text=tong.toString()
    }
}