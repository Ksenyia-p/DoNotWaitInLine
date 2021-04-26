package com.example.donotwaitinline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Oder extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oder);
        textView=findViewById(R.id.textView);
        Intent intent=getIntent();
        String oder=intent.getStringExtra("oder");
       if (oder==null){textView.setText("no oder");}else {
           textView.setText(oder);
       }
    }
}