package com.example.invisible0806;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CheckBox chkAgree;
    TextView question;
    RadioGroup rGroup;
    Button select;
    ImageView showImg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chkAgree = findViewById(R.id.chkAgree);
        question = findViewById(R.id.question);
        rGroup = findViewById(R.id.rGroup);
        select = findViewById(R.id.select);
        showImg = findViewById(R.id.showImg);

        chkAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                // 시작 체크박스가 체크되면
                if (chkAgree.isChecked() == true)
                {
                    question.setVisibility(View.VISIBLE);
                    rGroup.setVisibility(View.VISIBLE);
                    select.setVisibility(View.VISIBLE);
                    showImg.setVisibility(View.VISIBLE);
                }
                else
                {
                    question.setVisibility(View.INVISIBLE);
                    rGroup.setVisibility(View.INVISIBLE);
                    select.setVisibility(View.INVISIBLE);
                    showImg.setVisibility(View.INVISIBLE);
                }
            }
        });

        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (rGroup.getCheckedRadioButtonId()){
                    case R.id.r_C:
                        showImg.setImageResource(R.drawable.c);
                        break;
                    case R.id.r_java:
                        showImg.setImageResource(R.drawable.java);
                        break;
                    case R.id.r_html:
                        showImg.setImageResource(R.drawable.html);
                        break;
                    case R.id.r_js:
                        showImg.setImageResource(R.drawable.javascript);
                        break;
                }
            }
        });
    }




}