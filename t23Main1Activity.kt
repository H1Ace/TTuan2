package com.example.myapplication.Tuan2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.myapplication.R

class t23Main1Activity : AppCompatActivity() {
    var lv: ListView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_t23_main1)
        lv = findViewById(R.id.t23lv1)
        val arr = arrayOf("A40239","Item1","item2","Item3","Item4","Item5","kju")
        val ad = ArrayAdapter(this,
            android.R.layout.simple_list_item_1,arr)
        lv!!.adapter=ad
    }
}