package com.example.green_math;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class QuestionsAddActivity extends AppCompatActivity{


    SharedPreferences spAdd;
    SharedPreferences spFinished;

    Button buttonDelete, buttonSubmit;
    Button  button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;

    TextView textQuestion;
    TextView rightAnswered;
    TextView answerInput;

    int previousSecondNumber = 0;

    private static String answerStr;
    private static double answerNum;

    int addPoints = 0;
    int addQuestionAnswered = 0;
    String realOperation = "";
    double rightAnswer = 0;

    boolean addFinished = false;
    boolean subFinished = false;
    boolean admixFinished = false;
    boolean multFinished = false;
    boolean divFinished = false;

    CountDownTimer mCountDownTimer;
    int counter;
    long mMillisUntilFinished = 60000; //1 min = 60000

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions_add);

        spAdd = getSharedPreferences("AddResults", Context.MODE_PRIVATE);
        spFinished = getSharedPreferences("FinishedTypes", Context.MODE_PRIVATE);


        final TextView countTime = findViewById(R.id.text_view_countdown);
        mCountDownTimer = new CountDownTimer(mMillisUntilFinished,1000) {
            @Override
            public void onTick(long mMillisUntilFinished) {
                countTime.setText("00:"+ mMillisUntilFinished / 1000);
                counter++;
            }
            @Override
            public void onFinish() {
                countTime.setText("Vége");

                addFinished = true;

                SharedPreferences.Editor editor1 = spAdd.edit();
                editor1.putInt("AddPoints", addPoints);
                editor1.putInt("AddQuestionAnswered", addQuestionAnswered);
                editor1.commit();

                SharedPreferences.Editor editor2 = spFinished.edit();
                editor2.putBoolean("AddFinished", addFinished);
                editor2.putBoolean("SubFinished", subFinished);
                editor2.putBoolean("AdmixFinished", admixFinished);
                editor2.putBoolean("MultFinished", multFinished);
                editor2.putBoolean("DivFinished", divFinished);
                editor2.commit();

                Intent intent = new Intent(QuestionsAddActivity.this, BreakActivity.class);
                startActivity(intent);
                addPoints = 0;
                addQuestionAnswered = 0;
                finish();
            }
        }.start();



        answerInput = (TextView) findViewById(R.id.inputAnswer);
        buttonSubmit = (Button) findViewById(R.id.buttonSubmit);
        buttonDelete = (Button) findViewById(R.id.buttonDelete);
        button0 = (Button) findViewById(R.id.buttonNum0);
        button1 = (Button) findViewById(R.id.buttonNum1);
        button2 = (Button) findViewById(R.id.buttonNum2);
        button3 = (Button) findViewById(R.id.buttonNum3);
        button4 = (Button) findViewById(R.id.buttonNum4);
        button5 = (Button) findViewById(R.id.buttonNum5);
        button6 = (Button) findViewById(R.id.buttonNum6);
        button7 = (Button) findViewById(R.id.buttonNum7);
        button8 = (Button) findViewById(R.id.buttonNum8);
        button9 = (Button) findViewById(R.id.buttonNum9);
        textQuestion = (TextView) findViewById(R.id.textQuestion);




        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerInput.setText(answerInput.getText() + "0");
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerInput.setText(answerInput.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerInput.setText(answerInput.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerInput.setText(answerInput.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerInput.setText(answerInput.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerInput.setText(answerInput.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerInput.setText(answerInput.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerInput.setText(answerInput.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerInput.setText(answerInput.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerInput.setText(answerInput.getText() + "9");
            }
        });

        buttonDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerInput.setText("");
            }
        });


//        rightAnswered = (TextView) findViewById(R.id.rightAnswered);
//        rightAnswered.setText("Pont: " + addPoints);




        answerInput.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if(s.toString().trim().length()==0 || s.toString().contains(".-") || s.toString().contains("-.") || s.toString().equals("-") || s.toString().equals(".")){
                    buttonSubmit.setEnabled(false);
                } else {
                    buttonSubmit.setEnabled(true);
                }
            }


            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
                // TODO Auto-generated method stub

            }

            @Override
            public void afterTextChanged(Editable s) {
                // TODO Auto-generated method stub

            }
        });


        if (mMillisUntilFinished > 0){
            getARandomAddQuestion();
        }

    }

    private void getARandomAddQuestion() {

        answerInput.setBackgroundResource(R.drawable.input_answer);

        int maxRandFirstNum = 9;
        int maxRandSecNum = 9;
        int minRandFirstNum = 2;
        int minRandSecNum = 2;

        int firstNumber = new Random().nextInt(maxRandFirstNum - minRandFirstNum + 1) + minRandFirstNum;
        int secondNumber = new Random().nextInt(maxRandSecNum - minRandSecNum + 1) + minRandSecNum;


        realOperation = "+";
        rightAnswer = firstNumber + secondNumber;

        while (secondNumber == previousSecondNumber || rightAnswer == 0 || rightAnswer == 1) {
            secondNumber = new Random().nextInt(maxRandSecNum - minRandSecNum + 1) + minRandSecNum;
            firstNumber = new Random().nextInt(maxRandFirstNum - minRandFirstNum + 1) + minRandFirstNum;
            rightAnswer = firstNumber + secondNumber;
        }

        previousSecondNumber = secondNumber;
        textQuestion.setText(firstNumber + "  " + realOperation + "  " + secondNumber + "  =  🔳");



        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                answerStr = answerInput.getText().toString();
                answerNum = Double.parseDouble(answerStr);

                if(answerInput.getText() == null || answerInput.getText().equals("")) {
                    answerInput.setBackgroundResource(R.drawable.wrong_answer_bg);
                    addQuestionAnswered++;
                }



                if (rightAnswer==answerNum){
//                    answerInput.setBackgroundResource(R.drawable.right_answer_bg);
                    addPoints++;
                    addQuestionAnswered++;
//                    rightAnswered.setText("Pont: " + addPoints);
                }else {
//                    answerInput.setBackgroundResource(R.drawable.wrong_answer_bg);
                    addQuestionAnswered++;
                }


                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        if (mMillisUntilFinished > 0) {
                            getARandomAddQuestion();
                        }

                    }
                }, 0001); // 0750 = 0.75 sec
            }
        });
        answerInput.setText("");
    }

    public void onBackPressed() {
        mCountDownTimer.cancel();
        addPoints = 0;
        addQuestionAnswered = 0;
        Intent intent = new Intent(QuestionsAddActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }


//    @Override
//    public boolean onKeyDown(int keyCode, KeyEvent event) {
//        if (keyCode == KeyEvent.KEYCODE_BACK ) {
//            addPoints = 0;
//            addQuestionAnswered = 0;
//            mMillisUntilFinished = 0;
//            System.exit(0);
//        }
//        return super.onKeyDown(keyCode, event);
//    }


}