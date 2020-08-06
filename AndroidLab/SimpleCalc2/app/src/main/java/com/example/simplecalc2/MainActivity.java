package com.example.simplecalc2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn[] = new Button[4];
    Integer id[] = {R.id.button00, R.id.button01, };
    Button plus, minus, multiple, division, clear, result;
    TextView view1;
    EditText input;

    String result2 = "";

    public void  onButtonClick(View V) {
        switch (view1.getId())
        {
            case R.id.button00:
                result2 += "0";
                break;
            case R.id.button01:
                result2 += "1";
                break;
            case R.id.button02:
                result2 += "2";
                break;
            case R.id.button03:
                result2 += "3";
                break;
            case R.id.button04:
                result2 += "4";
                break;
            case R.id.button05:
                result2 += "5";
                break;
            case R.id.button06:
                result2 += "6";
                break;
            case R.id.button07:
                result2 += "7";
                break;
            case R.id.button08:
                result2 += "8";
                break;
            case R.id.button09:
                result2 += "9";
                break;
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        multiple = findViewById(R.id.multiple);
        division = findViewById(R.id.division);
        clear = findViewById(R.id.clear);
        result = findViewById(R.id.result);
        view1 = findViewById(R.id.view1);
        input = findViewById(R.id.input);

        btn[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });



    }
}