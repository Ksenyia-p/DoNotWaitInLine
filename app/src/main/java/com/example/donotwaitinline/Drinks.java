package com.example.donotwaitinline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class Drinks extends AppCompatActivity {
    RadioButton radioButtonT;
    RadioButton radioButtonC;
    Spinner spinnerT;
    Spinner spinnerC;
    String drink;
    TextView textViewHello;
    String typeOfDrink;
    TextView textViewDrinkAdd;
    String fullText;
    String name;
    CheckBox checkBoxLemon;
    CheckBox checkBoxMilk;
    CheckBox checkBoxSugar;
    StringBuilder additions=new StringBuilder();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks);
        radioButtonC=findViewById(R.id.radioButtonCoffee);
        radioButtonT=findViewById(R.id.radioButtonTea);
        spinnerC=findViewById(R.id.spinnerCoffee);
        spinnerT=findViewById(R.id.spinnerTea);
        textViewDrinkAdd=findViewById(R.id.textViewDrinkAdd);
        textViewHello=findViewById(R.id.textViewWantDrink);
        checkBoxLemon=findViewById(R.id.checkBoxLemon);
        checkBoxMilk=findViewById(R.id.checkBoxMilk);
        checkBoxSugar=findViewById(R.id.checkBoxSugar);
        Intent intent=getIntent();
        name=intent.getStringExtra("name");
        fullText=String.format("Hello %s. What kind of drink do you want?",name);
        textViewHello.setText(fullText);

    }
    public void Drink(View view){
        if (radioButtonT.isChecked()){
            drink="tea";
            typeOfDrink=String.format("What do you want to add to %s?", drink);
            textViewDrinkAdd.setText(typeOfDrink);
            spinnerT.setVisibility(View.VISIBLE);
            spinnerC.setVisibility(View.INVISIBLE);
        }else {
            drink="coffee";
            typeOfDrink=String.format("What do you want to add to %s?", drink);
            textViewDrinkAdd.setText(typeOfDrink);
            spinnerT.setVisibility(View.INVISIBLE);
            spinnerC.setVisibility(View.VISIBLE);
        }
    }

    public void Onward(View view) {
        if (drink.equals("Tea")){
            typeOfDrink=spinnerT.getSelectedItem().toString();
        }else {
            typeOfDrink=spinnerC.getSelectedItem().toString();
        }
        if (checkBoxSugar.isChecked()){
            additions.append("sugar").append("  ");
        }
        if (checkBoxMilk.isChecked()){
            additions.append("milk").append("  ");
        }
        if (checkBoxLemon.isChecked()){
            additions.append("lemon").append("  ");
        }
        String result=String.format("Client %s make the oder %s, with %s and type is %s.",
                name,drink,additions.toString(),typeOfDrink);
        Log.d("result",result);
        Intent intent=new Intent(this,Cake.class);
        intent.putExtra("result",result);
        intent.putExtra("name",name);

        startActivity(intent);

    }
}