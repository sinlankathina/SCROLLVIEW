package com.uts.mobprog210040130;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class About extends AppCompatActivity {

    Button btn1, btn2, btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        btn1 = findViewById(R.id.button31);
        btn2 = findViewById(R.id.button32);
        btn3 = findViewById(R.id.button33);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotoNewAct = new Intent(About.this, MainActivity.class);
                startActivity(gotoNewAct);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotoNewAct = new Intent(About.this, Dashboard.class);
                startActivity(gotoNewAct);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotoNewAct = new Intent(About.this, About.class);
                startActivity(gotoNewAct);
            }
        });
    }
}
