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

    public Button start_button2;

    boolean secClassSelected, thirdClassSelected, fourthClassSelected, fifthClassSelected,
            sixthClassSelected, seventhClassSelected, eighthClassSelected, ninethClassSelected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_description);

        TextView textClass = (TextView) findViewById(R.id.textClass);

        SharedPreferences spClassSelect = getApplicationContext().getSharedPreferences("classSelect", Context.MODE_PRIVATE);
        secClassSelected = spClassSelect.getBoolean("secClassSelected", false);
        thirdClassSelected = spClassSelect.getBoolean("thirdClassSelected", false);
        fourthClassSelected = spClassSelect.getBoolean("fourthClassSelected", false);
        fifthClassSelected = spClassSelect.getBoolean("fifthClassSelected", false);
        sixthClassSelected = spClassSelect.getBoolean("sixthClassSelected", false);
        seventhClassSelected = spClassSelect.getBoolean("seventhClassSelected", false);
        eighthClassSelected = spClassSelect.getBoolean("eighthClassSelected", false);
        ninethClassSelected = spClassSelect.getBoolean("ninethClassSelected", false);

        if (secClassSelected) {
            textClass.setText("2️⃣. Osztály");
        }
        if (thirdClassSelected) {
            textClass.setText("3️⃣. Osztály");
        }
        if (fourthClassSelected) {
            textClass.setText("4️⃣. Osztály");
        }
        if (fifthClassSelected) {
            textClass.setText("5️⃣. Osztály");
        }
        if (sixthClassSelected) {
            textClass.setText("6️⃣. Osztály");
        }
        if (seventhClassSelected) {
            textClass.setText("7️⃣. Osztály");
        }
        if (eighthClassSelected) {
            textClass.setText("8️⃣. Osztály");
        }
        if (ninethClassSelected) {
            textClass.setText("9️⃣. Osztály");
        }


        Button buttonSecStart = (Button) findViewById(R.id.start_button2);
        buttonSecStart.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TaskDescriptionActivity.this, QuestionsAddActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK ) {

            secClassSelected = false;
            thirdClassSelected = false;
            fourthClassSelected = false;
            fifthClassSelected = false;
            sixthClassSelected = false;
            seventhClassSelected = false;
            eighthClassSelected = false;
            ninethClassSelected = false;

            System.exit(0);
        }
        return super.onKeyDown(keyCode, event);
    }
}