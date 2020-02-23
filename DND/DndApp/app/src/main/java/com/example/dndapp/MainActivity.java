package com.example.dndapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Random rng = new Random();
    private TextView roller = findViewById(R.id.roller);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView roller = findViewById(R.id.roller);
        Button d4 = findViewById(R.id.dice4);
        Button d6 = findViewById(R.id.dice6);
        Button d8 = findViewById(R.id.dice8);
        Button d10 = findViewById(R.id.dice10);
        Button d12 = findViewById(R.id.dice12);
        Button d20 = findViewById(R.id.dice20);
        Button d100 = findViewById(R.id.dice100);
        d4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice(4);
            }
        });
        d6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice(6);
            }
        });
        d8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice(8);
            }
        });
        d10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice(10);
            }
        });
        d12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice(12);
            }
        });
        d20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice(20);
            }
        });
        d100.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice(100);
            }
        });
    }

    private void rollDice(int rand) {
        int randomNumber = rng.nextInt(rand);
        String temptext = ("You have rolled a " + randomNumber + "with a d" + rand);
        roller.setText(new StringBuffer(temptext).reverse().toString());

    }
}