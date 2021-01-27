package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button inc, dec;
    TextView txt;
    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inc = findViewById(R.id.increment);
        dec = findViewById(R.id.decrement);
        txt = findViewById(R.id.number);

        inc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                count++;
                txt.setText(count);
            }
        });

        dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count--;
                txt.setText(count);
            }

        });
    }
}