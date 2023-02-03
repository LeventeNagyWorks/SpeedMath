package com.example.green_math;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import android.view.KeyEvent;
import android.view.View;

import android.view.View.OnClickListener;

import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    boolean secClassSelected = false;
    boolean thirdClassSelected = false;
    boolean fourthClassSelected = false;
    boolean fifthClassSelected = false;
    boolean sixthClassSelected = false;
    boolean seventhClassSelected = false;
    boolean eighthClassSelected = false;
    boolean ninthClassSelected = false;

    SharedPreferences spClassSelect;
    SharedPreferences spRandomColor;

    Button button_sec, button_third, button_fourth, button_fifth, button_sixth, button_seventh, button_eigth, button_nineth;

    int randButtonColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spClassSelect = getSharedPreferences("ClassSelect", Context.MODE_PRIVATE);
        spRandomColor = getSharedPreferences("RandomColor", Context.MODE_PRIVATE);

//        Button button_exit = (androidx.appcompat.widget.AppCompatButton) findViewById(R.id.button_exit);
//        button_exit.setOnClickListener(new OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                secClassSelected = false;
//                thirdClassSelected = false;
//                fourthClassSelected = false;
//                fifthClassSelected = false;
//                sixthClassSelected = false;
//                seventhClassSelected = false;
//                eighthClassSelected = false;
//                ninthClassSelected = false;
//                finishAndRemoveTask();
//                System.exit(0);
//            }
//        });

        button_sec = findViewById(R.id.button_sec);
        button_sec.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                secClassSelected = true;

                SharedPreferences.Editor editor = spClassSelect.edit();

                editor.putBoolean("secClassSelected", secClassSelected);
                editor.putBoolean("thirdClassSelected", thirdClassSelected);
                editor.putBoolean("fourthClassSelected", fourthClassSelected);
                editor.putBoolean("fifthClassSelected", fifthClassSelected);
                editor.putBoolean("sixthClassSelected", sixthClassSelected);
                editor.putBoolean("seventhClassSelected", seventhClassSelected);
                editor.putBoolean("eighthClassSelected", eighthClassSelected);
                editor.putBoolean("ninthClassSelected", ninthClassSelected);

                editor.commit();


                SharedPreferences.Editor editor1 = spClassSelect.edit();

                editor1.putInt("randomColor", -1);

                editor1.commit();

                Intent intent = new Intent(MainActivity.this, TaskDescriptionActivity.class);
                startActivity(intent);
            }
        });


        button_third = findViewById(R.id.button_third);
        button_third.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                thirdClassSelected = true;

                SharedPreferences.Editor editor = spClassSelect.edit();

                editor.putBoolean("secClassSelected", secClassSelected);
                editor.putBoolean("thirdClassSelected", thirdClassSelected);
                editor.putBoolean("fourthClassSelected", fourthClassSelected);
                editor.putBoolean("fifthClassSelected", fifthClassSelected);
                editor.putBoolean("sixthClassSelected", sixthClassSelected);
                editor.putBoolean("seventhClassSelected", seventhClassSelected);
                editor.putBoolean("eighthClassSelected", eighthClassSelected);
                editor.putBoolean("ninthClassSelected", ninthClassSelected);

                editor.commit();


                SharedPreferences.Editor editor1 = spClassSelect.edit();

                editor1.putInt("randomColor", -1);

                editor1.commit();

                Intent intent = new Intent(MainActivity.this, TaskDescriptionActivity.class);
                startActivity(intent);
            }
        });


        button_fourth = findViewById(R.id.button_fourth);
        button_fourth.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                fourthClassSelected = true;

                SharedPreferences.Editor editor = spClassSelect.edit();

                editor.putBoolean("secClassSelected", secClassSelected);
                editor.putBoolean("thirdClassSelected", thirdClassSelected);
                editor.putBoolean("fourthClassSelected", fourthClassSelected);
                editor.putBoolean("fifthClassSelected", fifthClassSelected);
                editor.putBoolean("sixthClassSelected", sixthClassSelected);
                editor.putBoolean("seventhClassSelected", seventhClassSelected);
                editor.putBoolean("eighthClassSelected", eighthClassSelected);
                editor.putBoolean("ninthClassSelected", ninthClassSelected);

                editor.commit();


                SharedPreferences.Editor editor1 = spClassSelect.edit();

                editor1.putInt("randomColor", -1);

                editor1.commit();

                Intent intent = new Intent(MainActivity.this, TaskDescriptionActivity.class);
                startActivity(intent);
            }
        });


        button_fifth = findViewById(R.id.button_fifth);
        button_fifth.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                fifthClassSelected = true;

                SharedPreferences.Editor editor = spClassSelect.edit();

                editor.putBoolean("secClassSelected", secClassSelected);
                editor.putBoolean("thirdClassSelected", thirdClassSelected);
                editor.putBoolean("fourthClassSelected", fourthClassSelected);
                editor.putBoolean("fifthClassSelected", fifthClassSelected);
                editor.putBoolean("sixthClassSelected", sixthClassSelected);
                editor.putBoolean("seventhClassSelected", seventhClassSelected);
                editor.putBoolean("eighthClassSelected", eighthClassSelected);
                editor.putBoolean("ninthClassSelected", ninthClassSelected);

                editor.commit();


                SharedPreferences.Editor editor1 = spClassSelect.edit();

                editor1.putInt("randomColor", -1);

                editor1.commit();

                Intent intent = new Intent(MainActivity.this, TaskDescriptionActivity.class);
                startActivity(intent);
            }
        });


        button_sixth = findViewById(R.id.button_sixth);
        button_sixth.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                sixthClassSelected = true;

                SharedPreferences.Editor editor = spClassSelect.edit();

                editor.putBoolean("secClassSelected", secClassSelected);
                editor.putBoolean("thirdClassSelected", thirdClassSelected);
                editor.putBoolean("fourthClassSelected", fourthClassSelected);
                editor.putBoolean("fifthClassSelected", fifthClassSelected);
                editor.putBoolean("sixthClassSelected", sixthClassSelected);
                editor.putBoolean("seventhClassSelected", seventhClassSelected);
                editor.putBoolean("eighthClassSelected", eighthClassSelected);
                editor.putBoolean("ninthClassSelected", ninthClassSelected);

                editor.commit();


                SharedPreferences.Editor editor1 = spClassSelect.edit();

                editor1.putInt("randomColor", -1);

                editor1.commit();

                Intent intent = new Intent(MainActivity.this, TaskDescriptionActivity.class);
                startActivity(intent);
            }
        });


        button_seventh = findViewById(R.id.button_seventh);
        button_seventh.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                seventhClassSelected = true;

                SharedPreferences.Editor editor = spClassSelect.edit();

                editor.putBoolean("secClassSelected", secClassSelected);
                editor.putBoolean("thirdClassSelected", thirdClassSelected);
                editor.putBoolean("fourthClassSelected", fourthClassSelected);
                editor.putBoolean("fifthClassSelected", fifthClassSelected);
                editor.putBoolean("sixthClassSelected", sixthClassSelected);
                editor.putBoolean("seventhClassSelected", seventhClassSelected);
                editor.putBoolean("eighthClassSelected", eighthClassSelected);
                editor.putBoolean("ninthClassSelected", ninthClassSelected);

                editor.commit();


                SharedPreferences.Editor editor1 = spClassSelect.edit();

                editor1.putInt("randomColor", -1);

                editor1.commit();

                Intent intent = new Intent(MainActivity.this, TaskDescriptionActivity.class);
                startActivity(intent);
            }
        });


        button_eigth = findViewById(R.id.button_eigth);
        button_eigth.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                eighthClassSelected = true;

                SharedPreferences.Editor editor = spClassSelect.edit();

                editor.putBoolean("secClassSelected", secClassSelected);
                editor.putBoolean("thirdClassSelected", thirdClassSelected);
                editor.putBoolean("fourthClassSelected", fourthClassSelected);
                editor.putBoolean("fifthClassSelected", fifthClassSelected);
                editor.putBoolean("sixthClassSelected", sixthClassSelected);
                editor.putBoolean("seventhClassSelected", seventhClassSelected);
                editor.putBoolean("eighthClassSelected", eighthClassSelected);
                editor.putBoolean("ninthClassSelected", ninthClassSelected);

                editor.commit();


                SharedPreferences.Editor editor1 = spClassSelect.edit();

                editor1.putInt("randomColor", -1);

                editor1.commit();

                Intent intent = new Intent(MainActivity.this, TaskDescriptionActivity.class);
                startActivity(intent);
            }
        });


        button_nineth = findViewById(R.id.button_ninth);
        button_nineth.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                ninthClassSelected = true;

                SharedPreferences.Editor editor = spClassSelect.edit();

                editor.putBoolean("secClassSelected", secClassSelected);
                editor.putBoolean("thirdClassSelected", thirdClassSelected);
                editor.putBoolean("fourthClassSelected", fourthClassSelected);
                editor.putBoolean("fifthClassSelected", fifthClassSelected);
                editor.putBoolean("sixthClassSelected", sixthClassSelected);
                editor.putBoolean("seventhClassSelected", seventhClassSelected);
                editor.putBoolean("eighthClassSelected", eighthClassSelected);
                editor.putBoolean("ninthClassSelected", ninthClassSelected);

                editor.commit();

                SharedPreferences.Editor editor1 = spClassSelect.edit();

                editor1.putInt("randomColor", -1);

                editor1.commit();

                Intent intent = new Intent(MainActivity.this, TaskDescriptionActivity.class);
                startActivity(intent);
            }
        });

        randomButtonColor();

    }

    private void randomButtonColor() {
        int maxRandButtonNum = 4;
        int minRandButtonNum = 1;

        randButtonColor = new Random().nextInt(maxRandButtonNum - minRandButtonNum + 1) + minRandButtonNum;

        System.out.println(randButtonColor);

        if (randButtonColor == 1) {

            button_sec.setBackgroundResource(R.drawable.button_add);
            button_third.setBackgroundResource(R.drawable.button_add);
            button_fourth.setBackgroundResource(R.drawable.button_add);
            button_fifth.setBackgroundResource(R.drawable.button_add);
            button_sixth.setBackgroundResource(R.drawable.button_add);
            button_seventh.setBackgroundResource(R.drawable.button_add);
            button_eigth.setBackgroundResource(R.drawable.button_add);
            button_nineth.setBackgroundResource(R.drawable.button_add);
        }
        if (randButtonColor == 2) {

            button_sec.setBackgroundResource(R.drawable.button_sub);
            button_third.setBackgroundResource(R.drawable.button_sub);
            button_fourth.setBackgroundResource(R.drawable.button_sub);
            button_fifth.setBackgroundResource(R.drawable.button_sub);
            button_sixth.setBackgroundResource(R.drawable.button_sub);
            button_seventh.setBackgroundResource(R.drawable.button_sub);
            button_eigth.setBackgroundResource(R.drawable.button_sub);
            button_nineth.setBackgroundResource(R.drawable.button_sub);
        }
        if (randButtonColor == 3) {

            button_sec.setBackgroundResource(R.drawable.button_mult);
            button_third.setBackgroundResource(R.drawable.button_mult);
            button_fourth.setBackgroundResource(R.drawable.button_mult);
            button_fifth.setBackgroundResource(R.drawable.button_mult);
            button_sixth.setBackgroundResource(R.drawable.button_mult);
            button_seventh.setBackgroundResource(R.drawable.button_mult);
            button_eigth.setBackgroundResource(R.drawable.button_mult);
            button_nineth.setBackgroundResource(R.drawable.button_mult);
        }
        if (randButtonColor == 4) {

            button_sec.setTextColor(getResources().getColor(R.color.black));
            button_third.setTextColor(getResources().getColor(R.color.black));
            button_fourth.setTextColor(getResources().getColor(R.color.black));
            button_fifth.setTextColor(getResources().getColor(R.color.black));
            button_sixth.setTextColor(getResources().getColor(R.color.black));
            button_seventh.setTextColor(getResources().getColor(R.color.black));
            button_eigth.setTextColor(getResources().getColor(R.color.black));
            button_nineth.setTextColor(getResources().getColor(R.color.black));

            button_sec.setBackgroundResource(R.drawable.button_div);
            button_third.setBackgroundResource(R.drawable.button_div);
            button_fourth.setBackgroundResource(R.drawable.button_div);
            button_fifth.setBackgroundResource(R.drawable.button_div);
            button_sixth.setBackgroundResource(R.drawable.button_div);
            button_seventh.setBackgroundResource(R.drawable.button_div);
            button_eigth.setBackgroundResource(R.drawable.button_div);
            button_nineth.setBackgroundResource(R.drawable.button_div);
        }

    }

    public void onBackPressed() { }

//    @Override
//    public boolean onKeyDown(int keyCode, KeyEvent event) {
//        if (keyCode == KeyEvent.KEYCODE_BACK ) {
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