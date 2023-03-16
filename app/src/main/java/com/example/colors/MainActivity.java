package com.example.colors;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private boolean bgcolorBlack = true;
    private boolean isRed = false;

    private Button buttonRed;
    private Button buttonGreen;
    private Button buttonBlue;
    private Button buttonYellow;
    private Button buttonOrange;
    private Button buttonPurple;
    private Button buttonGo;
    private EditText editText;
    private String color;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonRed = findViewById(R.id.buttonRed);
        buttonGreen = findViewById(R.id.buttonGreen);
        buttonBlue = findViewById(R.id.buttonBlue);
        buttonYellow = findViewById(R.id.buttonYellow);
        buttonOrange = findViewById(R.id.buttonOrange);
        buttonPurple = findViewById(R.id.buttonPurple);
        editText= findViewById(R.id.editText);
        buttonGo= findViewById(R.id.buttonGo);




        buttonGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String color = editText.getText().toString();
                View layout = findViewById(R.id.layout);


                switch (color) {
                    case "red":
                        getWindow().getDecorView().setBackgroundColor(Color.RED);
                        break;
                    case "green":
                        getWindow().getDecorView().setBackgroundColor(Color.GREEN);
                        break;
                    case "blue":
                        getWindow().getDecorView().setBackgroundColor(Color.BLUE);
                        break;
                    case "yellow":
                        layout.setBackgroundColor(Color.YELLOW);
                        break;
                    case "orange":
                        getWindow().getDecorView().setBackgroundColor(Color.rgb(255, 140, 0));
                        break;
                    case "purple":
                        getWindow().getDecorView().setBackgroundColor(Color.rgb(128, 0, 128));
                        break;
                    default:
                        editText.setHint("red/green/blue/yellow/orange/purple");
                        break;
                }

                /*if(color=="red"){
                    getWindow().getDecorView().setBackgroundColor(Color.RED);
                }else if (color=="blue") {
                    getWindow().getDecorView().setBackgroundColor(Color.BLUE);
                }else if (color=="green") {
                    getWindow().getDecorView().setBackgroundColor(Color.GREEN);
                }else if (color=="yellow") {
                    getWindow().getDecorView().setBackgroundColor(Color.YELLOW);
                }else if (color=="orange") {
                    getWindow().getDecorView().setBackgroundColor(Color.rgb(255, 140, 0));
                }else if (color=="purple") {
                    getWindow().getDecorView().setBackgroundColor(Color.rgb(128, 0, 128));
                }else {
                    editText.setHint("red/green/blue/yellow/orange/purple");
                }*/


            }
        });

        buttonRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bgcolorBlack){
                    getWindow().getDecorView().setBackgroundColor(Color.RED);
                    buttonRed.setBackgroundColor(Color.WHITE);
                    bgcolorBlack = false;
                }else {
                    getWindow().getDecorView().setBackgroundColor(Color.WHITE);
                    buttonRed.setBackgroundColor(Color.RED);
                    bgcolorBlack = true;
                }

            }
        });
        buttonGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bgcolorBlack){
                    getWindow().getDecorView().setBackgroundColor(Color.GREEN);
                    buttonGreen.setBackgroundColor(Color.WHITE);
                    bgcolorBlack = false;
                }else {
                    getWindow().getDecorView().setBackgroundColor(Color.WHITE);
                    buttonGreen.setBackgroundColor(Color.GREEN);
                    bgcolorBlack = true;
                }

            }
        });
        buttonBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bgcolorBlack){
                    getWindow().getDecorView().setBackgroundColor(Color.BLUE);
                    buttonBlue.setBackgroundColor(Color.WHITE);
                    bgcolorBlack = false;
                }else {
                    getWindow().getDecorView().setBackgroundColor(Color.WHITE);
                    buttonBlue.setBackgroundColor(Color.BLUE);
                    bgcolorBlack = true;
                }

            }
        });
        buttonYellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bgcolorBlack){
                    getWindow().getDecorView().setBackgroundColor(Color.YELLOW);
                    buttonYellow.setBackgroundColor(Color.WHITE);
                    bgcolorBlack = false;
                }else {
                    getWindow().getDecorView().setBackgroundColor(Color.WHITE);
                    buttonYellow.setBackgroundColor(Color.YELLOW);
                    bgcolorBlack = true;
                }

            }
        });
        buttonOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bgcolorBlack){
                    getWindow().getDecorView().setBackgroundColor(Color.rgb(255, 140, 0));
                    buttonOrange.setBackgroundColor(Color.WHITE);
                    bgcolorBlack = false;
                }else {
                    getWindow().getDecorView().setBackgroundColor(Color.WHITE);
                    buttonOrange.setBackgroundColor(Color.rgb(255, 140, 0));
                    bgcolorBlack = true;
                }

            }
        });
        buttonPurple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bgcolorBlack){
                    getWindow().getDecorView().setBackgroundColor(Color.rgb(128, 0, 128));
                    buttonPurple.setBackgroundColor(Color.WHITE);
                    bgcolorBlack = false;
                }else {
                    getWindow().getDecorView().setBackgroundColor(Color.WHITE);
                    buttonPurple.setBackgroundColor(Color.rgb(128, 0, 128));
                    bgcolorBlack = true;
                }

            }
        });
    }
}