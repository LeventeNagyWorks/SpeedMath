package com.example.green_math;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class BreakActivity extends AppCompatActivity {

    ImageView add_tick;
    TextView add_icon;
    ImageView sub_tick;
    TextView sub_icon;
    ImageView admix_tick;
    TextView admix_icon;
    ImageView mult_tick;
    TextView mult_icon;
    ImageView div_tick;
    TextView div_icon;


    TextView textResult;
    TextView questionAnswered;
    TextView textBreakCountdown;
    Button buttonToNextTaskType;
    LinearLayout backgroundScoreboard2;

    boolean addFinished = false;
    boolean subFinished = false;
    boolean admixFinished = false;
    boolean multFinished = false;
    boolean divFinished = false;

    CountDownTimer mCountDownTimer;
    int counter;
    long mMillisUntilFinished = 60000;

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


        add_tick = findViewById(R.id.add_tick);
        add_icon = findViewById(R.id.add_icon);
        sub_tick = findViewById(R.id.sub_tick);
        sub_icon = findViewById(R.id.sub_icon);
        admix_tick = findViewById(R.id.admix_tick);
        admix_icon = findViewById(R.id.admix_icon);
        mult_tick = findViewById(R.id.mult_tick);
        mult_icon = findViewById(R.id.mult_icon);
        div_tick = findViewById(R.id.div_tick);
        div_icon = findViewById(R.id.div_icon);

        AnimatedVectorDrawable addTick = (AnimatedVectorDrawable) add_tick.getDrawable();
        AnimatedVectorDrawable subTick = (AnimatedVectorDrawable) sub_tick.getDrawable();
        AnimatedVectorDrawable admixTick = (AnimatedVectorDrawable) admix_tick.getDrawable();
        AnimatedVectorDrawable multTick = (AnimatedVectorDrawable) mult_tick.getDrawable();
        AnimatedVectorDrawable divTick = (AnimatedVectorDrawable) div_tick.getDrawable();

        if (addFinished) {
            add_icon.setVisibility(View.INVISIBLE);
            addTick.start();
        }
        if (subFinished) {
            add_icon.setVisibility(View.INVISIBLE);
            addTick.start();
            sub_icon.setVisibility(View.INVISIBLE);
            subTick.start();
        }
        if (admixFinished) {
            add_icon.setVisibility(View.INVISIBLE);
            addTick.start();
            sub_icon.setVisibility(View.INVISIBLE);
            subTick.start();
            admix_icon.setVisibility(View.INVISIBLE);
            admixTick.start();
        }
        if (multFinished) {
            add_icon.setVisibility(View.INVISIBLE);
            addTick.start();
            sub_icon.setVisibility(View.INVISIBLE);
            subTick.start();
            admix_icon.setVisibility(View.INVISIBLE);
            admixTick.start();
            mult_icon.setVisibility(View.INVISIBLE);
            multTick.start();
        }


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

