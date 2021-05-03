package com.example.donotwaitinline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class Cake extends AppCompatActivity {
    TextView textViewCake;
    String result;
    CheckBox checkBoxTira;
    CheckBox checkBoxChees;
    CheckBox checkBoxPanna;
    CheckBox checkBoxNapol;
    StringBuilder add=new StringBuilder();
    String clientName;



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
        clientName=intent.getStringExtra("drinkName");


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
       String oder=String.format("%s As well as %s",result,add.toString());
        Intent intent2=new Intent(this,Oder.class);
        intent2.putExtra("oder",oder);
        intent2.putExtra("cakeName",clientName);
        startActivity(intent2);






    }
}