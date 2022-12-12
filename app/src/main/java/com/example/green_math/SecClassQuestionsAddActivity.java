package com.example.green_math;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class SecClassQuestionsAddActivity extends AppCompatActivity{
    public int counter;


    Button buttonDelete, buttonDot, buttonSubmit;
    Button  button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;

    TextView textQuestion;
    TextView rightAnswered;
    TextView answerInput;

    private static String answerStr;
    private static double answerNum;

    public static int point = 0;
    public static int questionAnswered = 0;
    String realOperation = "";
    double rightAnswer = 0;

    long mMillisUntilFinished = 20000; //1 min = 60000
    boolean addEnds = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec_class_questions);



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
                intent.putExtra("Pont", point);
                intent.putExtra("FeladatDb", questionAnswered);
                startActivity(intent);
                point = 0;
                questionAnswered = 0;
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
        buttonDot = (Button) findViewById(R.id.buttonDot);
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

        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerInput.setText(answerInput.getText() + ".");
            }
        });

        buttonDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerInput.setText("");
            }
        });




        rightAnswered = (TextView) findViewById(R.id.rightAnswered);

        rightAnswered.setText("Pont: " + point);




        if (mMillisUntilFinished > 0){
            getARandomAddQuestion();
        }

    }

    private void getARandomAddQuestion() {

        answerInput.setBackgroundResource(R.drawable.input_answer);

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
                if (answerStr == "") {
                    answerInput.setBackgroundResource(R.drawable.wrong_answer_bg);
                }

                if (rightAnswer==answerNum){
                    answerInput.setBackgroundResource(R.drawable.right_answer_bg);
                    point++;
                    questionAnswered++;
                    rightAnswered.setText("Pont: " + point);
                }else {
                    answerInput.setBackgroundResource(R.drawable.wrong_answer_bg);
                    questionAnswered++;
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


}