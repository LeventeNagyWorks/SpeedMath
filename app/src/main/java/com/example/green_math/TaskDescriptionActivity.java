package com.example.green_math;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.KeyEvent;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TaskDescriptionActivity extends AppCompatActivity {

    boolean secClassSelected, thirdClassSelected, fourthClassSelected, fifthClassSelected,
            sixthClassSelected, seventhClassSelected, eighthClassSelected, ninthClassSelected;

    int randColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_description);

        TextView textClass = (TextView) findViewById(R.id.textClass);

        SharedPreferences spClassSelect = getApplicationContext().getSharedPreferences("ClassSelect", Context.MODE_PRIVATE);
        secClassSelected = spClassSelect.getBoolean("secClassSelected", false);
        thirdClassSelected = spClassSelect.getBoolean("thirdClassSelected", false);
        fourthClassSelected = spClassSelect.getBoolean("fourthClassSelected", false);
        fifthClassSelected = spClassSelect.getBoolean("fifthClassSelected", false);
        sixthClassSelected = spClassSelect.getBoolean("sixthClassSelected", false);
        seventhClassSelected = spClassSelect.getBoolean("seventhClassSelected", false);
        eighthClassSelected = spClassSelect.getBoolean("eighthClassSelected", false);
        ninthClassSelected = spClassSelect.getBoolean("ninthClassSelected", false);

        if (secClassSelected) {
            textClass.setText("2. Osztály");
        }
        if (thirdClassSelected) {
            textClass.setText("3. Osztály");
        }
        if (fourthClassSelected) {
            textClass.setText("4. Osztály");
        }
        if (fifthClassSelected) {
            textClass.setText("5. Osztály");
        }
        if (sixthClassSelected) {
            textClass.setText("6. Osztály");
        }
        if (seventhClassSelected) {
            textClass.setText("7. Osztály");
        }
        if (eighthClassSelected) {
            textClass.setText("8. Osztály");
        }
        if (ninthClassSelected) {
            textClass.setText("9. Osztály");
        }

        SharedPreferences spRandColor = getApplicationContext().getSharedPreferences("RandomColor", Context.MODE_PRIVATE);
        randColor = spRandColor.getInt("randomColor", -1);

        if (randColor == 1) {
            textClass.setBackgroundResource(R.drawable.button_add);
        }
        if (randColor == 2) {
            textClass.setBackgroundResource(R.drawable.button_sub);
        }
        if (randColor == 3) {
            textClass.setBackgroundResource(R.drawable.button_mult);
        }
        if (randColor == 4) {
            textClass.setBackgroundResource(R.drawable.button_div);
        }


        Button buttonSecStart = (Button) findViewById(R.id.start_button2);
        buttonSecStart.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TaskDescriptionActivity.this, QuestionsAddActivity.class);
                startActivity(intent);
            }
        });

        Button buttonBackMain = (Button) findViewById(R.id.buttonBackMain);
        buttonBackMain.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //TODO: reset class
                Intent intent = new Intent(TaskDescriptionActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(TaskDescriptionActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }

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