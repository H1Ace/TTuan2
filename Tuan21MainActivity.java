package com.example.myapplication.Tuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import com.example.myapplication.R;
import android.widget.EditText;
import android.widget.Button;


public class Tuan21MainActivity extends AppCompatActivity {
    EditText txt1,txt2;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan21_main);
        txt1= findViewById(R.id.t21txt1);
        txt2= findViewById(R.id.t21txt2);
        btn1= findViewById(R.id.t21btn1);
        btn1.setOnClickListener(v->{
            Intent i=new Intent(Tuan21MainActivity.this, Tuan21ScActivity.class);
            i.putExtra("So1",txt1.getText().toString());
            i.putExtra("So2",txt2.getText().toString());
            startActivity(i);
        });
    }
}