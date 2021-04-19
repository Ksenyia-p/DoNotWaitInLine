package com.example.donotwaitinline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class Cake extends AppCompatActivity {
    TextView textViewCake;
    String result;
    CheckBox checkBoxTira;
    CheckBox checkBoxChees;
    CheckBox checkBoxPanna;
    CheckBox checkBoxNapol;
    StringBuilder add=new StringBuilder();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cake);
        textViewCake=findViewById(R.id.textViewCake);
        checkBoxChees=findViewById(R.id.checkBoxChees);
        checkBoxNapol=findViewById(R.id.checkBoxNapoleon);
        checkBoxPanna=findViewById(R.id.checkBoxPanna);
        checkBoxTira=findViewById(R.id.checkBoxTira);
        Intent intent=getIntent();
        result=intent.getStringExtra("result");

    }

    public void OderToMail(View view) {
        if (checkBoxTira.isChecked()){
            add.append("tiramisu").append("  ");
        }
        if (checkBoxPanna.isChecked()){
            add.append("Panna cotta").append("  ");
        }
        if (checkBoxNapol.isChecked()){
            add.append("Napoleon cake").append("  ");
        }
        if (checkBoxChees.isChecked()){
            add.append("cheesecake").append("  ");
        }
        Intent intent=getIntent();
        result=intent.getStringExtra("result");
        String oder;
        if (add.equals("null")){
         oder=String.format("%s ",result);
        }else {
             oder=String.format("%s As well as %s",result,add.toString());
        }

    }
}