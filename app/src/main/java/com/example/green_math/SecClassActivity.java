package com.example.green_math;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecClassActivity extends AppCompatActivity {

    public Button start_button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec_class);


//        Button button_back = (Button) findViewById(R.id.button_back);
//        button_back.setOnClickListener(new OnClickListener() {
//
//            @Override
//            public void onClick(View view) {
//                Intent back_intent = new Intent(sec_class.this,MainActivity.class);
//                startActivity(back_intent);
//            }
//        });

        Button buttonSecStart = (Button) findViewById(R.id.start_button2);
        buttonSecStart.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecClassActivity.this, SecClassQuestionsAddActivity.class);
                startActivity(intent);
            }
        });

    }
}