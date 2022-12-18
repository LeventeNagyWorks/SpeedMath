package com.example.green_math;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SubResultActivity extends AppCompatActivity {

    TextView textResult;
    TextView questionAnswered;
    TextView textClassLevelResult;
    LinearLayout backgroundScoreboard2;
    Button buttonToAdmix;

    int subPoints;
    int subQuestionAnswered;

    boolean secClassSelected = false;
    boolean thirdClassSelected = false;
    boolean fourthClassSelected = false;
    boolean fifthClassSelected = false;
    boolean sixthClassSelected = false;
    boolean seventhClassSelected = false;
    boolean eighthClassSelected = false;
    boolean ninthClassSelected = false;

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

        SharedPreferences spClassSelect = getApplicationContext().getSharedPreferences("ClassSelect", Context.MODE_PRIVATE);
        secClassSelected = spClassSelect.getBoolean("secClassSelected", false);
        thirdClassSelected = spClassSelect.getBoolean("thirdClassSelected", false);
        fourthClassSelected = spClassSelect.getBoolean("fourthClassSelected", false);
        fifthClassSelected = spClassSelect.getBoolean("fifthClassSelected", false);
        sixthClassSelected = spClassSelect.getBoolean("sixthClassSelected", false);
        seventhClassSelected = spClassSelect.getBoolean("seventhClassSelected", false);
        eighthClassSelected = spClassSelect.getBoolean("eighthClassSelected", false);
        ninthClassSelected = spClassSelect.getBoolean("ninthClassSelected", false);

        textClassLevelResult = findViewById(R.id.textClassLevelResult);
        backgroundScoreboard2 = findViewById(R.id.backgroundScoreboard2);

        int classLevelPoints;

        if (secClassSelected) {
            classLevelPoints = 8;
            if (subPoints < classLevelPoints) {
                textClassLevelResult.setText("Nem sikerült teljesíteni");
                textClassLevelResult.setBackgroundResource(R.drawable.wrong_answer_bg);
                backgroundScoreboard2.setBackgroundResource(R.drawable.wrong_answer_bg);
            }
        }
        if (thirdClassSelected) {
            classLevelPoints = 12;
            if (subPoints < classLevelPoints) {
                textClassLevelResult.setText("Nem sikerült teljesíteni");
                textClassLevelResult.setBackgroundResource(R.drawable.wrong_answer_bg);
                backgroundScoreboard2.setBackgroundResource(R.drawable.wrong_answer_bg);
            }
        }
        if (fourthClassSelected) {
            classLevelPoints = 15;
            if (subPoints < classLevelPoints) {
                textClassLevelResult.setText("Nem sikerült teljesíteni");
                textClassLevelResult.setBackgroundResource(R.drawable.wrong_answer_bg);
                backgroundScoreboard2.setBackgroundResource(R.drawable.wrong_answer_bg);
            }
        }
        if (fifthClassSelected) {
            classLevelPoints = 17;
            if (subPoints < classLevelPoints) {
                textClassLevelResult.setText("Nem sikerült teljesíteni");
                textClassLevelResult.setBackgroundResource(R.drawable.wrong_answer_bg);
                backgroundScoreboard2.setBackgroundResource(R.drawable.wrong_answer_bg);
            }
        }
        if (sixthClassSelected) {
            classLevelPoints = 19;
            if (subPoints < classLevelPoints) {
                textClassLevelResult.setText("Nem sikerült teljesíteni");
                textClassLevelResult.setBackgroundResource(R.drawable.wrong_answer_bg);
                backgroundScoreboard2.setBackgroundResource(R.drawable.wrong_answer_bg);
            }
        }
        if (seventhClassSelected) {
            classLevelPoints = 20;
            if (subPoints < classLevelPoints) {
                textClassLevelResult.setText("Nem sikerült teljesíteni");
                textClassLevelResult.setBackgroundResource(R.drawable.wrong_answer_bg);
                backgroundScoreboard2.setBackgroundResource(R.drawable.wrong_answer_bg);
            }
        }
        if (eighthClassSelected) {
            classLevelPoints = 24;
            if (subPoints < classLevelPoints) {
                textClassLevelResult.setText("Nem sikerült teljesíteni");
                textClassLevelResult.setBackgroundResource(R.drawable.wrong_answer_bg);
                backgroundScoreboard2.setBackgroundResource(R.drawable.wrong_answer_bg);
            }
        }
        if (ninthClassSelected) {
            classLevelPoints = 27;
            if (subPoints < classLevelPoints) {
                textClassLevelResult.setText("Nem sikerült teljesíteni");
                textClassLevelResult.setBackgroundResource(R.drawable.wrong_answer_bg);
                backgroundScoreboard2.setBackgroundResource(R.drawable.wrong_answer_bg);
            }
        }



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