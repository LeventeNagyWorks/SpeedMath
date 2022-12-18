package com.example.green_math;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MultResultActivity extends AppCompatActivity {


    TextView textResult;
    TextView questionAnswered;
    TextView textClassLevelResult;
    Button buttonToDiv;
    LinearLayout backgroundScoreboard2;

    int multPoints;
    int multQuestionAnswered;

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
        setContentView(R.layout.activity_mult_result);



        multPoints = getIntent().getIntExtra("MultPont", 0);
        multQuestionAnswered = getIntent().getIntExtra("MultFeladatDb", 0);
        textResult = findViewById(R.id.textResult);
        questionAnswered = findViewById(R.id.textQuestionAnswered);

        textResult.setText("Pont: " + multPoints);
        questionAnswered.setText("Megoldva: " + multQuestionAnswered);


        sp = getSharedPreferences("MultResults", Context.MODE_PRIVATE);


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
            classLevelPoints = 6;
            if (multPoints < classLevelPoints) {
                textClassLevelResult.setText("Nem sikerült teljesíteni");
                textClassLevelResult.setBackgroundResource(R.drawable.wrong_answer_bg);
                backgroundScoreboard2.setBackgroundResource(R.drawable.wrong_answer_bg);
            }
        }
        if (thirdClassSelected) {
            classLevelPoints = 12;
            if (multPoints < classLevelPoints) {
                textClassLevelResult.setText("Nem sikerült teljesíteni");
                textClassLevelResult.setBackgroundResource(R.drawable.wrong_answer_bg);
                backgroundScoreboard2.setBackgroundResource(R.drawable.wrong_answer_bg);
            }
        }
        if (fourthClassSelected) {
            classLevelPoints = 20;
            if (multPoints < classLevelPoints) {
                textClassLevelResult.setText("Nem sikerült teljesíteni");
                textClassLevelResult.setBackgroundResource(R.drawable.wrong_answer_bg);
                backgroundScoreboard2.setBackgroundResource(R.drawable.wrong_answer_bg);
            }
        }
        if (fifthClassSelected) {
            classLevelPoints = 22;
            if (multPoints < classLevelPoints) {
                textClassLevelResult.setText("Nem sikerült teljesíteni");
                textClassLevelResult.setBackgroundResource(R.drawable.wrong_answer_bg);
                backgroundScoreboard2.setBackgroundResource(R.drawable.wrong_answer_bg);
            }
        }
        if (sixthClassSelected) {
            classLevelPoints = 24;
            if (multPoints < classLevelPoints) {
                textClassLevelResult.setText("Nem sikerült teljesíteni");
                textClassLevelResult.setBackgroundResource(R.drawable.wrong_answer_bg);
                backgroundScoreboard2.setBackgroundResource(R.drawable.wrong_answer_bg);
            }
        }
        if (seventhClassSelected) {
            classLevelPoints = 27;
            if (multPoints < classLevelPoints) {
                textClassLevelResult.setText("Nem sikerült teljesíteni");
                textClassLevelResult.setBackgroundResource(R.drawable.wrong_answer_bg);
                backgroundScoreboard2.setBackgroundResource(R.drawable.wrong_answer_bg);
            }
        }
        if (eighthClassSelected) {
            classLevelPoints = 29;
            if (multPoints < classLevelPoints) {
                textClassLevelResult.setText("Nem sikerült teljesíteni");
                textClassLevelResult.setBackgroundResource(R.drawable.wrong_answer_bg);
                backgroundScoreboard2.setBackgroundResource(R.drawable.wrong_answer_bg);
            }
        }
        if (ninthClassSelected) {
            classLevelPoints = 35;
            if (multPoints < classLevelPoints) {
                textClassLevelResult.setText("Nem sikerült teljesíteni");
                textClassLevelResult.setBackgroundResource(R.drawable.wrong_answer_bg);
                backgroundScoreboard2.setBackgroundResource(R.drawable.wrong_answer_bg);
            }
        }



        buttonToDiv = (Button) findViewById(R.id.buttonToDiv);
        buttonToDiv.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                SharedPreferences.Editor editor = sp.edit();

                editor.putInt("MultPoints", multPoints);
                editor.putInt("MultQuestionAnswered", multQuestionAnswered);
                editor.commit();

                Intent intent = new Intent(MultResultActivity.this, QuestionsDivActivity.class);
                startActivity(intent);
            }
        });

    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK ) {

            textClassLevelResult.setText("Sikerült teljesíteni");
            textClassLevelResult.setBackgroundResource(R.drawable.submit);

            secClassSelected = false;
            thirdClassSelected = false;
            fourthClassSelected = false;
            fifthClassSelected = false;
            sixthClassSelected = false;
            seventhClassSelected = false;
            eighthClassSelected = false;
            ninthClassSelected = false;

            System.exit(0);
        }
        return super.onKeyDown(keyCode, event);
    }
}

