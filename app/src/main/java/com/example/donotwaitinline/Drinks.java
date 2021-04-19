package com.example.donotwaitinline;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Spinner;

public class Drinks extends AppCompatActivity {
    RadioButton radioButtonT;
    RadioButton radioButtonC;
    boolean aBooleanT=true;
    Spinner spinnerT;
    Spinner spinnerC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks);
        radioButtonC=findViewById(R.id.radioButtonCoffee);
        radioButtonT=findViewById(R.id.radioButtonTea);
        spinnerC=findViewById(R.id.spinnerCoffe);
        spinnerT=findViewById(R.id.spinnerTea);
        boolean checkedT = (radioButtonT).isChecked();
        boolean checkedC = (radioButtonC).isChecked();
        if (checkedT==aBooleanT){
            spinnerT.setVisibility(View.VISIBLE);
            spinnerC.setVisibility(View.INVISIBLE);
        }else if (checkedC==aBooleanT){
            spinnerT.setVisibility(View.INVISIBLE);
            spinnerC.setVisibility(View.VISIBLE);
        }
    }
   }