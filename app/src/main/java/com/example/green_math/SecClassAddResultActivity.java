package com.example.green_math;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecClassAddResultActivity extends AppCompatActivity {


    TextView textResult;
    TextView questionAnswered;
    Button buttonToSub;

    int secClassAddPoints;
    int secClassAddQuestionAnswered;

    SharedPreferences sp;
    String secClassAddPointsStr;
    String secClassAddQuestionAnsweredStr;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec_class_add_result);



        secClassAddPoints = getIntent().getIntExtra("SecClassAddPont", 0);
        secClassAddQuestionAnswered = getIntent().getIntExtra("SecClassAddFeladatDb", 0);
        textResult = findViewById(R.id.textResult);
        questionAnswered = findViewById(R.id.textQuestionAnswered);

        textResult.setText("Pont: " + secClassAddPoints);
        questionAnswered.setText("Megoldva: " + secClassAddQuestionAnswered);


        sp = getSharedPreferences("secClassAddResults", Context.MODE_PRIVATE);


        buttonToSub = (Button) findViewById(R.id.secClassToSub);
        buttonToSub.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                secClassAddPointsStr = String.valueOf(secClassAddPoints);
                secClassAddQuestionAnsweredStr = String.valueOf(secClassAddQuestionAnswered);

                SharedPreferences.Editor editor = sp.edit();

                editor.putInt("secClassAddPoints", secClassAddPoints);
                editor.putInt("secClassAddQuestionAnswered", secClassAddQuestionAnswered);
                editor.commit();

                Intent intent = new Intent(SecClassAddResultActivity.this, SecClassQuestionsSubActivity.class);
                intent.putExtra("SecClassAddFeladatDb", secClassAddQuestionAnswered);
                intent.putExtra("SecClassAddPont", secClassAddPoints);
                startActivity(intent);
            }
        });

    }
}