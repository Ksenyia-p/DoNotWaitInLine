package com.example.donotwaitinline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks);
        radioButtonC=findViewById(R.id.radioButtonCoffee);
        radioButtonT=findViewById(R.id.radioButtonTea);
        spinnerC=findViewById(R.id.spinnerCoffe);
        spinnerT=findViewById(R.id.spinnerTea);
        textViewDrinkAdd=findViewById(R.id.textViewDrinkAdd);
        textViewHello=findViewById(R.id.textViewWantDrink);
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

    }
}