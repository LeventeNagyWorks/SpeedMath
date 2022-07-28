package com.example.green_math;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.View.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class second_oszt extends AppCompatActivity {

    Button start_button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_oszt);


        Button button_back = (Button) findViewById(R.id.button_back);
        button_back.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent back_intent = new Intent(second_oszt.this,MainActivity.class);
                startActivity(back_intent);
            }
        });

    }
}