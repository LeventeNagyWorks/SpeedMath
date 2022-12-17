package com.example.green_math;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SubResultActivity extends AppCompatActivity {

    TextView textResult;
    TextView questionAnswered;
    Button buttonToAdmix;

    int subPoints;
    int subQuestionAnswered;

    SharedPreferences sp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_result);

        subPoints = getIntent().getIntExtra("SubPont", 0);
        subQuestionAnswered = getIntent().getIntExtra("SubFeladatDb", 0);



        textResult = findViewById(R.id.textResult);
        questionAnswered = findViewById(R.id.textQuestionAnswered);

        textResult.setText("Pont: " + subPoints);
        questionAnswered.setText("Megoldva: " + subQuestionAnswered);


        sp = getSharedPreferences("SubResults", Context.MODE_PRIVATE);



        buttonToAdmix = (Button) findViewById(R.id.buttonToAdmix);
        buttonToAdmix.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                SharedPreferences.Editor editor = sp.edit();

                editor.putInt("SubPoints", subPoints);
                editor.putInt("SubQuestionAnswered", subQuestionAnswered);
                editor.commit();

                Intent intent = new Intent(SubResultActivity.this, QuestionsAdmixActivity.class);
                startActivity(intent);
            }
        });
    }
}