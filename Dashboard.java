package com.uts.mobprog210040130;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Dashboard extends AppCompatActivity {

    Button btn1, btn2, btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        btn1 = findViewById(R.id.button21);
        btn2 = findViewById(R.id.button22);
        btn3 = findViewById(R.id.button23);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotoNewAct = new Intent(Dashboard.this, MainActivity.class);
                startActivity(gotoNewAct);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotoNewAct = new Intent(Dashboard.this, Dashboard.class);
                startActivity(gotoNewAct);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotoNewAct = new Intent(Dashboard.this, About.class);
                startActivity(gotoNewAct);
            }
        });
    }}
