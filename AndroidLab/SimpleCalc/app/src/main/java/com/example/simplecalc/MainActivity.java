package com.example.simplecalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button plus, minus, multiple, division;
    EditText number1, number2;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        multiple = findViewById(R.id.multiple);
        division = findViewById(R.id.division);
        number1 = findViewById(R.id.number1);
        number2 = findViewById(R.id.number2);
        result = findViewById(R.id.result);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1 = number1.getText().toString();
                String num2 = number2.getText().toString();
                int c = Integer.parseInt(num1) + Integer.parseInt(num2);
                String str = String.valueOf(c);
                //result.setText(c+"");
                result.setText(str);
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1 = number1.getText().toString();
                String num2 = number2.getText().toString();
                int c = Integer.parseInt(num1) - Integer.parseInt(num2);
                String str = String.valueOf(c);
                //result.setText(c+"");
                result.setText(str);
            }
        });

        multiple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1 = number1.getText().toString();
                String num2 = number2.getText().toString();
                int c = Integer.parseInt(num1) * Integer.parseInt(num2);
                String str = String.valueOf(c);
                //result.setText(c+"");
                result.setText(str);
            }
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1 = number1.getText().toString();
                String num2 = number2.getText().toString();
                float c = Integer.parseInt(num1) / Integer.parseInt(num2);
                String str = String.valueOf(c);
                //result.setText(c+"");
                result.setText(str);
            }
        });

    }
}