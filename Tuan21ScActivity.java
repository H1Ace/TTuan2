package com.example.myapplication.Tuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.myapplication.R;
import android.widget.TextView;
public class Tuan21ScActivity extends AppCompatActivity {
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan21_sc);
        tv1 = findViewById(R.id.t211tv1);
        Intent i1=getIntent();
        String chuoi1=i1.getExtras().getString("So1");
        String chuoi2=i1.getExtras().getString("So2");
        float so1=Float.parseFloat(chuoi1);
        float so2=Float.parseFloat(chuoi2);
        float tong=so1+so2;
        tv1.setText(String.valueOf(tong));
    }
}