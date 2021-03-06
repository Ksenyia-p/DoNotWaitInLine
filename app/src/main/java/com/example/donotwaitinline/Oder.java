package com.example.donotwaitinline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Oder extends AppCompatActivity {
    TextView textView;
    String  oder;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oder);
        textView=findViewById(R.id.textView2);
        Intent  intent=getIntent();
        oder=intent.getStringExtra("oder");
        name=intent.getStringExtra("cakeName");


       if (oder==null){
           textView.setText("no oder");
       }else {
           textView.setText(oder);
       }
    }

    public void Config(View view) {
        Intent gIntent=new Intent(Intent.ACTION_SEND);
        gIntent.putExtra(Intent.EXTRA_EMAIL,"kseniapetrashko16@gmail.com");
        gIntent.putExtra(Intent.EXTRA_SUBJECT,"Order "+ name);
        gIntent.putExtra(Intent.EXTRA_TEXT,oder);
        gIntent.setType("message/rfc822");
        startActivity(Intent.createChooser(gIntent,"title"));
    }
}