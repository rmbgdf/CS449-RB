package com.example.characterpagedndapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    String Stat1, Stat2, Stat3, Stat4, Stat5, Stat6, Char, Char_class, Char_level;

    Button SavePage;

    EditText STR_input;
    EditText DEX_input;
    EditText CON_input;
    EditText INT_input;
    EditText WIS_input;
    EditText CHA_input;
    EditText Name;
    EditText Class;
    EditText Level;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Name = (EditText) findViewById(R.id.Name);
        Class = (EditText) findViewById(R.id.Class);
        Level = (EditText) findViewById(R.id.Level);
        STR_input = (EditText) findViewById(R.id.STR_input);
        DEX_input = (EditText) findViewById(R.id.DEX_input);
        CON_input = (EditText) findViewById(R.id.CON_Input);
        INT_input = (EditText) findViewById(R.id.INT_input);
        WIS_input = (EditText) findViewById(R.id.WIS_input);
        CHA_input = (EditText) findViewById(R.id.CHA_input);

        SavePage = (Button) findViewById(R.id.SavePage);
        SavePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Char = Name.getText().toString();
                Char_class = Class.getText().toString();
                Char_level = Level.getText().toString();
                Stat1 = STR_input.getText().toString();
                Stat2 = DEX_input.getText().toString();
                Stat3 = CON_input.getText().toString();
                Stat4 = INT_input.getText().toString();
                Stat5 = WIS_input.getText().toString();
                Stat6 = CHA_input.getText().toString();
            }
        });
    }
}
