package com.example.green_math;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class BreakActivity extends AppCompatActivity {


    TextView textResult;
    TextView questionAnswered;
    TextView textBreakCountdown;
    Button buttonToNextTaskType;
    LinearLayout backgroundScoreboard2;

    int addPoints = 0;
    int addQuestionAnswered = 0;
    int subPoints = 0;
    int subQuestionAnswered = 0;
    int admixPoints = 0;
    int admixQuestionAnswered = 0;
    int multPoints = 0;
    int multQuestionAnswered = 0;
    int divPoints = 0;
    int divQuestionAnswered = 0;

    boolean addFinished = false;
    boolean subFinished = false;
    boolean admixFinished = false;
    boolean multFinished = false;
    boolean divFinished = false;

    CountDownTimer mCountDownTimer;
    int counter;
    long mMillisUntilFinished = 5000;

    boolean secClassSelected = false;
    boolean thirdClassSelected = false;
    boolean fourthClassSelected = false;
    boolean fifthClassSelected = false;
    boolean sixthClassSelected = false;
    boolean seventhClassSelected = false;
    boolean eighthClassSelected = false;
    boolean ninthClassSelected = false;


    SharedPreferences spFinishedTypes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_break);

        spFinishedTypes = getSharedPreferences("FinishedTypes", Context.MODE_PRIVATE);


        addFinished = spFinishedTypes.getBoolean("AddFinished", false);
        subFinished = spFinishedTypes.getBoolean("SubFinished", false);
        admixFinished = spFinishedTypes.getBoolean("AdmixFinished", false);
        multFinished = spFinishedTypes.getBoolean("MultFinished", false);
        divFinished = spFinishedTypes.getBoolean("DivFinished", false);


        final TextView countTime = findViewById(R.id.textBreakCountdown);
        mCountDownTimer = new CountDownTimer(mMillisUntilFinished,1000) {
            @Override
            public void onTick(long mMillisUntilFinished) {
                countTime.setText("00:"+ mMillisUntilFinished / 1000);
                counter++;
            }
            @Override
            public void onFinish() {

                if (addFinished) {
                    mCountDownTimer.cancel();
                    Intent intent = new Intent(BreakActivity.this, QuestionsSubActivity.class);
                    startActivity(intent);
                    finishAndRemoveTask();
                }
                if (subFinished) {
                    mCountDownTimer.cancel();
                    Intent intent = new Intent(BreakActivity.this, QuestionsAdmixActivity.class);
                    startActivity(intent);
                    finishAndRemoveTask();
                }
                if (admixFinished) {
                    mCountDownTimer.cancel();
                    Intent intent = new Intent(BreakActivity.this, QuestionsMultActivity.class);
                    startActivity(intent);
                    finishAndRemoveTask();
                }
                if (multFinished) {
                    mCountDownTimer.cancel();
                    Intent intent = new Intent(BreakActivity.this, QuestionsDivActivity.class);
                    startActivity(intent);
                    finishAndRemoveTask();
                }
            }
        }.start();


        SharedPreferences spClassSelect = getApplicationContext().getSharedPreferences("ClassSelect", Context.MODE_PRIVATE);
        secClassSelected = spClassSelect.getBoolean("secClassSelected", false);
        thirdClassSelected = spClassSelect.getBoolean("thirdClassSelected", false);
        fourthClassSelected = spClassSelect.getBoolean("fourthClassSelected", false);
        fifthClassSelected = spClassSelect.getBoolean("fifthClassSelected", false);
        sixthClassSelected = spClassSelect.getBoolean("sixthClassSelected", false);
        seventhClassSelected = spClassSelect.getBoolean("seventhClassSelected", false);
        eighthClassSelected = spClassSelect.getBoolean("eighthClassSelected", false);
        ninthClassSelected = spClassSelect.getBoolean("ninthClassSelected", false);

        textBreakCountdown = findViewById(R.id.textBreakCountdown);





        buttonToNextTaskType = (Button) findViewById(R.id.buttonToNextTaskType);
        buttonToNextTaskType.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if (addFinished) {
                    mCountDownTimer.cancel();
                    Intent intent = new Intent(BreakActivity.this, QuestionsSubActivity.class);
                    startActivity(intent);
                    mMillisUntilFinished = 0;
                    finishAndRemoveTask();
                }
                if (subFinished) {
                    mCountDownTimer.cancel();
                    Intent intent = new Intent(BreakActivity.this, QuestionsAdmixActivity.class);
                    startActivity(intent);
                    mMillisUntilFinished = 0;
                    finishAndRemoveTask();
                }
                if (admixFinished) {
                    mCountDownTimer.cancel();
                    Intent intent = new Intent(BreakActivity.this, QuestionsMultActivity.class);
                    startActivity(intent);
                    mMillisUntilFinished = 0;
                    finishAndRemoveTask();
                }
                if (multFinished) {
                    mCountDownTimer.cancel();
                    Intent intent = new Intent(BreakActivity.this, QuestionsDivActivity.class);
                    startActivity(intent);
                    mMillisUntilFinished = 0;
                    finishAndRemoveTask();
                }

            }
        });

    }

    public void onBackPressed() {
        mCountDownTimer.cancel();
        Intent intent = new Intent(BreakActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }

//    @Override
//    public boolean onKeyDown(int keyCode, KeyEvent event) {
//        if (keyCode == KeyEvent.KEYCODE_BACK ) {
//
////            textBreakCountdown.setText("Sikerült teljesíteni");
////            textBreakCountdown.setBackgroundResource(R.drawable.submit);
//
//            secClassSelected = false;
//            thirdClassSelected = false;
//            fourthClassSelected = false;
//            fifthClassSelected = false;
//            sixthClassSelected = false;
//            seventhClassSelected = false;
//            eighthClassSelected = false;
//            ninthClassSelected = false;
//
//            System.exit(0);
//        }
//        return super.onKeyDown(keyCode, event);
//    }

}

