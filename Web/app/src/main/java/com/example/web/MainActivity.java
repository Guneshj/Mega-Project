package com.example.web;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
public Button btn1,btn2,btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.b3);
        btn2 = (Button) findViewById(R.id.b2);
        btn3 = (Button) findViewById(R.id.b1);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {
        Intent i;

        switch (view.getId()){
            case R.id.b3 :
                i = new Intent(this,snacks.class);
                startActivity(i);
                break;

            case R.id.b2 :
                i = new Intent(this,beverges.class);
                startActivity(i);
                break;

            case R.id.b1 :
                i = new Intent(this,meal.class);
                startActivity(i);
                break;

        }

    }
}