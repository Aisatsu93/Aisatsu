package com.example.mytoggle0806;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    ToggleButton tv, air;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.tvtoggle);
        air = findViewById(R.id.airtoggle);

        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              if (tv.isChecked() == true)
              {
                  tv.setBackgroundResource(R.drawable.power_on);
                  Toast.makeText(getApplicationContext(), "TV ON", Toast.LENGTH_SHORT).show();
              }
              else
              {
                  tv.setBackgroundResource(R.drawable.power_off);
                  Toast.makeText(getApplicationContext(), "TV OFF", Toast.LENGTH_SHORT).show();
              }
            }
        });

        air.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (air.isChecked() == true)
                {
                    air.setBackgroundResource(R.drawable.power_on);
                    Toast.makeText(getApplicationContext(), "AIR ON", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    air.setBackgroundResource(R.drawable.power_off);
                    Toast.makeText(getApplicationContext(), "AIR OFF", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}