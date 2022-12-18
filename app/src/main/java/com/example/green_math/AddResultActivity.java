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

public class AddResultActivity extends AppCompatActivity {


    TextView textResult;
    TextView questionAnswered;
    TextView textClassLevelResult;
    Button buttonToSub;
    LinearLayout backgroundScoreboard2;

    int addPoints;
    int addQuestionAnswered;

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
        setContentView(R.layout.activity_add_result);



        addPoints = getIntent().getIntExtra("AddPont", 0);
        addQuestionAnswered = getIntent().getIntExtra("AddFeladatDb", 0);
        textResult = findViewById(R.id.textResult);
        questionAnswered = findViewById(R.id.textQuestionAnswered);

        textResult.setText("Pont: " + addPoints);
        questionAnswered.setText("Megoldva: " + addQuestionAnswered);


        sp = getSharedPreferences("AddResults", Context.MODE_PRIVATE);


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
            if (addPoints < classLevelPoints) {
                textClassLevelResult.setText("Nem sikerült teljesíteni");
                textClassLevelResult.setBackgroundResource(R.drawable.wrong_answer_bg);
                backgroundScoreboard2.setBackgroundResource(R.drawable.wrong_answer_bg);
            }
        }
        if (thirdClassSelected) {
            classLevelPoints = 15;
            if (addPoints < classLevelPoints) {
                textClassLevelResult.setText("Nem sikerült teljesíteni");
                textClassLevelResult.setBackgroundResource(R.drawable.wrong_answer_bg);
                backgroundScoreboard2.setBackgroundResource(R.drawable.wrong_answer_bg);
            }
        }
        if (fourthClassSelected) {
            classLevelPoints = 20;
            if (addPoints < classLevelPoints) {
                textClassLevelResult.setText("Nem sikerült teljesíteni");
                textClassLevelResult.setBackgroundResource(R.drawable.wrong_answer_bg);
                backgroundScoreboard2.setBackgroundResource(R.drawable.wrong_answer_bg);
            }
        }
        if (fifthClassSelected) {
            classLevelPoints = 24;
            if (addPoints < classLevelPoints) {
                textClassLevelResult.setText("Nem sikerült teljesíteni");
                textClassLevelResult.setBackgroundResource(R.drawable.wrong_answer_bg);
                backgroundScoreboard2.setBackgroundResource(R.drawable.wrong_answer_bg);
            }
        }
        if (sixthClassSelected) {
            classLevelPoints = 28;
            if (addPoints < classLevelPoints) {
                textClassLevelResult.setText("Nem sikerült teljesíteni");
                textClassLevelResult.setBackgroundResource(R.drawable.wrong_answer_bg);
                backgroundScoreboard2.setBackgroundResource(R.drawable.wrong_answer_bg);
            }
        }
        if (seventhClassSelected) {
            classLevelPoints = 31;
            if (addPoints < classLevelPoints) {
                textClassLevelResult.setText("Nem sikerült teljesíteni");
                textClassLevelResult.setBackgroundResource(R.drawable.wrong_answer_bg);
                backgroundScoreboard2.setBackgroundResource(R.drawable.wrong_answer_bg);
            }
        }
        if (eighthClassSelected) {
            classLevelPoints = 36;
            if (addPoints < classLevelPoints) {
                textClassLevelResult.setText("Nem sikerült teljesíteni");
                textClassLevelResult.setBackgroundResource(R.drawable.wrong_answer_bg);
                backgroundScoreboard2.setBackgroundResource(R.drawable.wrong_answer_bg);
            }
        }
        if (ninthClassSelected) {
            classLevelPoints = 42;
            if (addPoints < classLevelPoints) {
                textClassLevelResult.setText("Nem sikerült teljesíteni");
                textClassLevelResult.setBackgroundResource(R.drawable.wrong_answer_bg);
                backgroundScoreboard2.setBackgroundResource(R.drawable.wrong_answer_bg);
            }
        }



        buttonToSub = (Button) findViewById(R.id.buttonToSub);
        buttonToSub.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                SharedPreferences.Editor editor = sp.edit();

                editor.putInt("AddPoints", addPoints);
                editor.putInt("AddQuestionAnswered", addQuestionAnswered);
                editor.commit();

                Intent intent = new Intent(AddResultActivity.this, QuestionsSubActivity.class);
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

