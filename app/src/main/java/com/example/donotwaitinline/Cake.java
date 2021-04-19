package com.example.donotwaitinline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Cake extends AppCompatActivity {
    TextView textViewCake;
    String result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cake);
        textViewCake=findViewById(R.id.textViewCake);
        Intent intent=getIntent();
        result=intent.getStringExtra("result");

    }
}