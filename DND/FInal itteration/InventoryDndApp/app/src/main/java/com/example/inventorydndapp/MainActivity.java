package com.example.inventorydndapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    String backpack1,backpack2,backpack3,backpack4,backpack5;

    EditText Inv1;
    EditText Inv2;
    EditText Inv3;
    EditText Inv4;
    EditText Inv5;
    Button SaveInv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Inv1 = (EditText) findViewById(R.id.Inv1);
        Inv2 = (EditText) findViewById(R.id.Inv2);
        Inv3 = (EditText) findViewById(R.id.Inv3);
        Inv4 = (EditText) findViewById(R.id.Inv4);
        Inv5 = (EditText) findViewById(R.id.Inv5);

        SaveInv = (Button) findViewById(R.id.SaveInv);
        SaveInv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backpack1 = Inv1.getText().toString();
                backpack2 = Inv2.getText().toString();
                backpack3 = Inv3.getText().toString();
                backpack4 = Inv4.getText().toString();
                backpack5 = Inv5.getText().toString();



            }
        });

    }
}

