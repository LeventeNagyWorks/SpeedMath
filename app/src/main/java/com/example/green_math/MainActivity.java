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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spClassSelect = getSharedPreferences("ClassSelect", Context.MODE_PRIVATE);

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

        Button button_sec = (Button) findViewById(R.id.button_sec);
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

                Intent intent = new Intent(MainActivity.this, TaskDescriptionActivity.class);
                startActivity(intent);
            }
        });


        Button button_third = (Button) findViewById(R.id.button_third);
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

                Intent intent = new Intent(MainActivity.this, TaskDescriptionActivity.class);
                startActivity(intent);
            }
        });


        Button button_fourth = (Button) findViewById(R.id.button_fourth);
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

                Intent intent = new Intent(MainActivity.this, TaskDescriptionActivity.class);
                startActivity(intent);
            }
        });


        Button button_fifth = (Button) findViewById(R.id.button_fifth);
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

                Intent intent = new Intent(MainActivity.this, TaskDescriptionActivity.class);
                startActivity(intent);
            }
        });


        Button button_sixth = (Button) findViewById(R.id.button_sixth);
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

                Intent intent = new Intent(MainActivity.this, TaskDescriptionActivity.class);
                startActivity(intent);
            }
        });


        Button button_seventh = (Button) findViewById(R.id.button_seventh);
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

                Intent intent = new Intent(MainActivity.this, TaskDescriptionActivity.class);
                startActivity(intent);
            }
        });


        Button button_eigth = (Button) findViewById(R.id.button_eigth);
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

                Intent intent = new Intent(MainActivity.this, TaskDescriptionActivity.class);
                startActivity(intent);
            }
        });


        Button button_nineth = (Button) findViewById(R.id.button_ninth);
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

                Intent intent = new Intent(MainActivity.this, TaskDescriptionActivity.class);
                startActivity(intent);
            }
        });

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