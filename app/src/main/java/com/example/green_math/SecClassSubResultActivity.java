package com.example.green_math;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecClassSubResultActivity extends AppCompatActivity {

    TextView textResult;
    TextView questionAnswered;
    Button buttonToFinish;

    int secClassSubPoints;
    int secClassSubQuestionAnswered;
    int secClassAddPoints;
    int secClassAddQuestionAnswered;

    SharedPreferences sp;
    String secClassSubPointsStr;
    String secClassAddQuestionAnsweredStr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec_class_sub_result);

        secClassSubPoints = getIntent().getIntExtra("SecClassSubPont", 0);
        secClassSubQuestionAnswered = getIntent().getIntExtra("SecClassSubFeladatDb", 0);
        secClassAddPoints = getIntent().getIntExtra("SecClassAddPont", 0);
        secClassAddQuestionAnswered = getIntent().getIntExtra("SecClassAddFeladatDb", 0);


        textResult = findViewById(R.id.textResult);
        questionAnswered = findViewById(R.id.textQuestionAnswered);

        textResult.setText("Pont: " + secClassSubPoints);
        questionAnswered.setText("Megoldva: " + secClassSubQuestionAnswered);


        sp = getSharedPreferences("secClassSubResults", Context.MODE_PRIVATE);



        buttonToFinish = (Button) findViewById(R.id.secClassToFinish);
        buttonToFinish.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                secClassSubPointsStr = String.valueOf(secClassAddPoints);
                secClassAddQuestionAnsweredStr = String.valueOf(secClassAddQuestionAnswered);

                SharedPreferences.Editor editor = sp.edit();

                editor.putInt("secClassSubPoints", secClassSubPoints);
                editor.putInt("secClassSubQuestionAnswered", secClassSubQuestionAnswered);
                editor.commit();

                Intent intent = new Intent(SecClassSubResultActivity.this, SecClassFinishActivity.class);
                intent.putExtra("SecClassSubPont", secClassSubPoints);
                intent.putExtra("SecClassSubFeladatDb", secClassSubQuestionAnswered);
                intent.putExtra("SecClassAddPont", secClassAddPoints);
                intent.putExtra("SecClassAddFeladatDb", secClassAddQuestionAnswered);
                startActivity(intent);
            }
        });
    }
}