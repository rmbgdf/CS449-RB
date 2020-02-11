package com.example.reedumpirebuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    int strike = 0;
    int ball = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_r = (Button) findViewById(R.id.button_r);
        Button button_b = (Button) findViewById(R.id.button_b);
        button_b.setEnabled(true);
        Button button_s = (Button) findViewById(R.id.button_strike);
        button_s.setEnabled(true);
        Button button_e = (Button) findViewById(R.id.button_e);
        AlertDialog.Builder strike_dia = new AlertDialog.Builder(MainActivity.this);
        AlertDialog.Builder ball_dia = new AlertDialog.Builder(MainActivity.this);

        ball_dia.SetCancelLabel(true);
        strike_dia.SetCancelLabel(true);
        ball_dia.SetTitle("Walk, reset");
        strike_dia.SetTitle("Out, reset");
        ball_dia.SetMessage("4 balls, take your base");
        ball_dia.SetMessage("3 strikes, they're out");

        if (ball == 4){
            ball_dia.show();
            button_b.setEnabled(false);
            button_s.setEnabled(false);

        }
        if (strike == 3){
            strike_dia.show();
            button_b.setEnabled(false);
            button_s.setEnabled(false);
        }


        button_r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView ball_counter = (TextView) findViewById(R.id.ball_counter);
                TextView strike_counter = (TextView) findViewById(R.id.strike_counter);
                ball = 0;
                strike = 0;
                ball_counter.setText(ball);
                strike_counter.setText(strike);
            }
        });
        button_s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView strike_counter = (TextView) findViewById(R.id.strike_counter);

                strike_counter.setText(strike+1);
            }
        });
        button_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView ball_counter = (TextView) findViewById(R.id.ball_counter);

                ball_counter.setText(ball+1);

            }
        });
        button_e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                System.exit(0);
            }
        });
    }
}
