package com.example.green_math;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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

public class SecClassQuestionsAddActivity extends AppCompatActivity{
    public int counter;


    Button buttonDelete, buttonDot, buttonMinus, buttonSubmit;
    Button  button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;

    TextView textQuestion;
    TextView rightAnswered;
    TextView answerInput;

    private static String answerStr;
    private static double answerNum;

    public static int secClassAddPoints = 0;
    public static int secClassAddQuestionAnswered = 0;
    String realOperation = "";
    double rightAnswer = 0;

    long mMillisUntilFinished = 60000; //1 min = 60000

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec_class_questions_add);



        final TextView countTime = findViewById(R.id.text_view_countdown);
        new CountDownTimer(mMillisUntilFinished,1000) {
            @Override
            public void onTick(long mMillisUntilFinished) {
                countTime.setText("00:"+ mMillisUntilFinished / 1000);
                counter++;
            }
            @Override
            public void onFinish() {
                countTime.setText("Vége");

                Intent intent = new Intent(SecClassQuestionsAddActivity.this, SecClassAddResultActivity.class);
                intent.putExtra("SecClassAddPont", secClassAddPoints);
                intent.putExtra("SecClassAddFeladatDb", secClassAddQuestionAnswered);
                startActivity(intent);
                secClassAddPoints = 0;
                secClassAddQuestionAnswered = 0;
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
        buttonMinus = (Button) findViewById(R.id.buttonMinus);
        buttonDot = (Button) findViewById(R.id.buttonDot);
        textQuestion = (TextView) findViewById(R.id.textQuestion);




        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerInput.setText(answerInput.getText() + "0");
                buttonMinus.setEnabled(false);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerInput.setText(answerInput.getText() + "1");
                buttonMinus.setEnabled(false);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerInput.setText(answerInput.getText() + "2");
                buttonMinus.setEnabled(false);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerInput.setText(answerInput.getText() + "3");
                buttonMinus.setEnabled(false);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerInput.setText(answerInput.getText() + "4");
                buttonMinus.setEnabled(false);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerInput.setText(answerInput.getText() + "5");
                buttonMinus.setEnabled(false);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerInput.setText(answerInput.getText() + "6");
                buttonMinus.setEnabled(false);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerInput.setText(answerInput.getText() + "7");
                buttonMinus.setEnabled(false);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerInput.setText(answerInput.getText() + "8");
                buttonMinus.setEnabled(false);
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerInput.setText(answerInput.getText() + "9");
                buttonMinus.setEnabled(false);
            }
        });

        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerInput.setText(answerInput.getText() + ".");
                buttonDot.setEnabled(false);
            }
        });

        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerInput.setText(answerInput.getText() + "-");
                buttonMinus.setEnabled(false);
            }
        });

        buttonDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerInput.setText("");
                buttonMinus.setEnabled(true);
                buttonDot.setEnabled(true);
            }
        });




        rightAnswered = (TextView) findViewById(R.id.rightAnswered);

        rightAnswered.setText("Pont: " + secClassAddPoints);




        answerInput.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if(s.toString().trim().length()==0 || s.toString().contains(".-") || s.toString().contains("-.")){
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

        buttonMinus.setEnabled(true);
        buttonDot.setEnabled(true);

        int randFirstNum = 10;
        int randSecNum = 10;
        int firstNumber = new Random().nextInt(randFirstNum);
        int secondNumber = new Random().nextInt(randSecNum);

        realOperation = "+";
        rightAnswer = firstNumber + secondNumber;
        textQuestion.setText(firstNumber + " " + realOperation + " " + secondNumber + " = ?");


        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                answerStr = answerInput.getText().toString();
                answerNum = Double.parseDouble(answerStr);

                if(answerInput.getText() == null || answerInput.getText().equals("")) {
                    answerInput.setBackgroundResource(R.drawable.wrong_answer_bg);
                    secClassAddQuestionAnswered++;
                }



                if (rightAnswer==answerNum){
                    answerInput.setBackgroundResource(R.drawable.right_answer_bg);
                    secClassAddPoints++;
                    secClassAddQuestionAnswered++;
                    rightAnswered.setText("Pont: " + secClassAddPoints);
                }else {
                    answerInput.setBackgroundResource(R.drawable.wrong_answer_bg);
                    secClassAddQuestionAnswered++;
                }


                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        if (mMillisUntilFinished > 0) {
                            getARandomAddQuestion();
                        }

                    }
                }, 0750); // 0.75 sec
            }
        });
        answerInput.setText("");
    }


    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK ) {
            secClassAddPoints = 0;
            secClassAddQuestionAnswered = 0;
            mMillisUntilFinished = 0;
            System.exit(0);
        }
        return super.onKeyDown(keyCode, event);
    }


}