package com.example.green_math;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.lang.reflect.Array;

public class SecClassFinishActivity extends AppCompatActivity {

    TextView textResult;
    TextView questionAnswered;

    int secClassPoints;
    int secClassQuestionAnswered;

    int secClassAddQuestionAnswered;
    int secClassSubQuestionAnswered;
    int secClassAddPoints;
    int secClassSubPoints;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec_class_finish);

        textResult = findViewById(R.id.textResult);
        questionAnswered = findViewById(R.id.textQuestionAnswered);

//        secClassSubPoints = getIntent().getIntExtra("SecClassSubPont", 0);
//        secClassSubQuestionAnswered = getIntent().getIntExtra("SecClassSubFeladatDb", 0);
//        secClassAddPoints = getIntent().getIntExtra("SecClassAddPont", 0);
//        secClassAddQuestionAnswered = getIntent().getIntExtra("SecClassAddFeladatDb", 0);


        SharedPreferences sp1 = getApplicationContext().getSharedPreferences("secClassAddResults", Context.MODE_PRIVATE);
        secClassAddPoints = sp1.getInt("secClassAddPoints", -1);
        secClassAddQuestionAnswered = sp1.getInt("secClassAddQuestionAnswered", -1);

        SharedPreferences sp2 = getApplicationContext().getSharedPreferences("secClassSubResults", Context.MODE_PRIVATE);
        secClassSubPoints = sp2.getInt("secClassSubPoints", -1);
        secClassSubQuestionAnswered = sp2.getInt("secClassSubQuestionAnswered", -1);


        secClassPoints = secClassAddPoints + secClassSubPoints;
        secClassQuestionAnswered = secClassAddQuestionAnswered + secClassSubQuestionAnswered;

        textResult.setText("Pont: " + secClassPoints);
        questionAnswered.setText("Megoldva: " + secClassQuestionAnswered);


        Button buttonBackMain = (Button) findViewById(R.id.buttonBackMain);
        buttonBackMain.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecClassFinishActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });


        Button button_exit = (androidx.appcompat.widget.AppCompatButton) findViewById(R.id.button_exit);
        button_exit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                finishAndRemoveTask();
                System.exit(0);
            }
        });
    }
}