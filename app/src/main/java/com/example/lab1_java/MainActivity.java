package com.example.lab1_java;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int counter = 0;
    private TextView textViewCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textViewHello = findViewById(R.id.textViewHello);
        TextView textViewName = findViewById(R.id.textViewName);
        textViewCounter = findViewById(R.id.textViewCounter);
        Button buttonIncrement = findViewById(R.id.buttonIncrement);
        Button buttonDecrement = findViewById(R.id.buttonDecrement);

        textViewCounter.setText(String.valueOf(counter));

        buttonIncrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                textViewCounter.setText(String.valueOf(counter));
            }
        });

        buttonDecrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (counter > 0) {
                    counter--;
                    textViewCounter.setText(String.valueOf(counter));
                }
            }
        });
    }
}