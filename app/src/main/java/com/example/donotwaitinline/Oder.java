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






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oder);
        textView=findViewById(R.id.textView2);
        Intent  intent=getIntent();
        oder=intent.getStringExtra("oder");


       if (oder==null){
           textView.setText("no oder");
       }else {
           textView.setText(oder);
       }
    }

    public void Config(View view) {
        Intent gIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:kseniapetrashko16@gmail.com"));
        gIntent.putExtra(Intent.EXTRA_SUBJECT,"Oder ");
        gIntent.putExtra(Intent.EXTRA_TEXT,oder);
        startActivity(gIntent);
    }
}