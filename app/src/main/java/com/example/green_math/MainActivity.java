package com.example.green_math;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;

import android.view.View.OnClickListener;

import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_exit = (androidx.appcompat.widget.AppCompatButton) findViewById(R.id.button_exit);
        button_exit.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                finishAndRemoveTask();
                System.exit(0);
            }
        });

        Button button_sec = (Button) findViewById(R.id.button_sec);
        button_sec.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecClassActivity.class);
                startActivity(intent);
            }
        });



//        Button button_third = (Button) findViewById(R.id.button_third);
//        button_sec.setOnClickListener(new OnClickListener() {
//
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(MainActivity.this,third_oszt.class);
//                startActivity(intent);
//            }
//        });



    }
}