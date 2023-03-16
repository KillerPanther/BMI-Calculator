package com.example.bmi_calculator;

import static java.lang.System.in;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView result;
        EditText edtWeight,edtHeightH,edtHeightI;
        Button calculateBmi;

        edtWeight =findViewById(R.id.edtWeight);
        edtHeightH=findViewById(R.id.edtHieghtF);
        edtHeightI=findViewById(R.id.edtHeightIn);
        result=findViewById(R.id.result);
        calculateBmi=findViewById(R.id.CalculateBmi);


        calculateBmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                for getting values from edit text
               int wt= Integer.parseInt(edtWeight.getText().toString()) ;
               int ft=Integer.parseInt(edtHeightH.getText().toString());
               int in=Integer.parseInt(edtHeightI.getText().toString());


                int totalIn = ft*12 + in;
                double totalCm=totalIn*2.53;
                double totalM=totalCm/100;
                double Bmi=wt/(totalM*totalM);
                if (Bmi>25){
                    result.setText("You are OverWeight");
                }else if (Bmi<18){
                    result.setText("You're UnderWeight");
                }else{
                    result.setText("You're Healthy Person");
                }

            }

        });



    }
}