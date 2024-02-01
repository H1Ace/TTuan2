package com.example.myapplication.Tuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.myapplication.R;

public class Tuan23MainActivity extends AppCompatActivity {
    ListView lv;
    @SuppressLint("MissingInfaltedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan23_main);
        lv=findViewById((R.id.t23lv));
        String[] arr=new String[]{"tuan1","tuan2","tuan3","tuan3","tuan4","asf","A40239"};
        ArrayAdapter<String>
                adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,arr);
        lv.setAdapter(adapter);
    }
}