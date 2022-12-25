package com.example.green_math;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class FinishActivity extends AppCompatActivity {

    TextView textResult;
    TextView questionAnswered;
    TextView textClassLevelResult;
    TextView textClass;
    LinearLayout backgroundScoreboard2;

    int allPoints;
    int allQuestionAnswered;
    int allClassLevelPoints;

    int addQuestionAnswered;
    int addPoints;

    int subQuestionAnswered;
    int subPoints;

    int admixQuestionAnswered;
    int admixPoints;

    int multQuestionAnswered;
    int multPoints;

    int divQuestionAnswered;
    int divPoints;

    boolean secClassSelected = false;
    boolean thirdClassSelected = false;
    boolean fourthClassSelected = false;
    boolean fifthClassSelected = false;
    boolean sixthClassSelected = false;
    boolean seventhClassSelected = false;
    boolean eighthClassSelected = false;
    boolean ninthClassSelected = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);

        textResult = findViewById(R.id.textResult);
        questionAnswered = findViewById(R.id.textQuestionAnswered);


        SharedPreferences sp1 = getApplicationContext().getSharedPreferences("AddResults", Context.MODE_PRIVATE);
        addPoints = sp1.getInt("AddPoints", -1);
        addQuestionAnswered = sp1.getInt("AddQuestionAnswered", -1);

        SharedPreferences sp2 = getApplicationContext().getSharedPreferences("SubResults", Context.MODE_PRIVATE);
        subPoints = sp2.getInt("SubPoints", -1);
        subQuestionAnswered = sp2.getInt("SubQuestionAnswered", -1);

        SharedPreferences sp3 = getApplicationContext().getSharedPreferences("AdmixResults", Context.MODE_PRIVATE);
        admixPoints = sp3.getInt("AdmixPoints", -1);
        admixQuestionAnswered = sp3.getInt("AdmixQuestionAnswered", -1);

        SharedPreferences sp4 = getApplicationContext().getSharedPreferences("MultResults", Context.MODE_PRIVATE);
        multPoints = sp4.getInt("MultPoints", -1);
        multQuestionAnswered = sp4.getInt("MultQuestionAnswered", -1);

        SharedPreferences sp5 = getApplicationContext().getSharedPreferences("DivResults", Context.MODE_PRIVATE);
        divPoints = sp5.getInt("DivPoints", -1);
        divQuestionAnswered = sp5.getInt("DivQuestionAnswered", -1);


        allPoints = addPoints + subPoints + admixPoints + multPoints + divPoints;
        allQuestionAnswered = addQuestionAnswered + subQuestionAnswered + admixQuestionAnswered + multQuestionAnswered + divQuestionAnswered;

        textResult.setText("Pont: " + allPoints);
        questionAnswered.setText("Megoldva: " + allQuestionAnswered);


        SharedPreferences spClassSelect = getApplicationContext().getSharedPreferences("ClassSelect", Context.MODE_PRIVATE);

        secClassSelected = spClassSelect.getBoolean("secClassSelected", secClassSelected);
        thirdClassSelected = spClassSelect.getBoolean("thirdClassSelected", thirdClassSelected);
        fourthClassSelected = spClassSelect.getBoolean("fourthClassSelected", fourthClassSelected);
        fifthClassSelected = spClassSelect.getBoolean("fifthClassSelected", fifthClassSelected);
        sixthClassSelected = spClassSelect.getBoolean("sixthClassSelected", sixthClassSelected);
        seventhClassSelected = spClassSelect.getBoolean("seventhClassSelected", seventhClassSelected);
        eighthClassSelected = spClassSelect.getBoolean("eighthClassSelected", eighthClassSelected);
        ninthClassSelected = spClassSelect.getBoolean("ninthClassSelected", ninthClassSelected);

        textClass = findViewById(R.id.textClass);
        backgroundScoreboard2 = findViewById(R.id.backgroundScoreboard2);
        textClassLevelResult = findViewById(R.id.textClassLevelResult);

        if (secClassSelected) {
            textClass.setText("2️⃣. Osztály");
            allClassLevelPoints = 35;
            if (allPoints < allClassLevelPoints) {
                textClassLevelResult.setText("Nem sikerült teljesíteni");
                textClassLevelResult.setBackgroundResource(R.drawable.wrong_answer_bg);
                backgroundScoreboard2.setBackgroundResource(R.drawable.wrong_answer_bg);
            }
        }
        if (thirdClassSelected) {
            textClass.setText("3️⃣. Osztály");
            allClassLevelPoints = 62;
            if (allPoints < allClassLevelPoints) {
                textClassLevelResult.setText("Nem sikerült teljesíteni");
                textClassLevelResult.setBackgroundResource(R.drawable.wrong_answer_bg);
                backgroundScoreboard2.setBackgroundResource(R.drawable.wrong_answer_bg);
            }
        }
        if (fourthClassSelected) {
            textClass.setText("4️⃣. Osztály");
            allClassLevelPoints = 85;
            if (allPoints < allClassLevelPoints) {
                textClassLevelResult.setText("Nem sikerült teljesíteni");
                textClassLevelResult.setBackgroundResource(R.drawable.wrong_answer_bg);
                backgroundScoreboard2.setBackgroundResource(R.drawable.wrong_answer_bg);
            }
        }
        if (fifthClassSelected) {
            textClass.setText("5️⃣. Osztály");
            allClassLevelPoints = 97;
            if (allPoints < allClassLevelPoints) {
                textClassLevelResult.setText("Nem sikerült teljesíteni");
                textClassLevelResult.setBackgroundResource(R.drawable.wrong_answer_bg);
                backgroundScoreboard2.setBackgroundResource(R.drawable.wrong_answer_bg);
            }
        }
        if (sixthClassSelected) {
            textClass.setText("6️⃣. Osztály");
            allClassLevelPoints = 108;
            if (allPoints < allClassLevelPoints) {
                textClassLevelResult.setText("Nem sikerült teljesíteni");
                textClassLevelResult.setBackgroundResource(R.drawable.wrong_answer_bg);
                backgroundScoreboard2.setBackgroundResource(R.drawable.wrong_answer_bg);
            }
        }
        if (seventhClassSelected) {
            textClass.setText("7️⃣. Osztály");
            allClassLevelPoints = 119;
            if (allPoints < allClassLevelPoints) {
                textClassLevelResult.setText("Nem sikerült teljesíteni");
                textClassLevelResult.setBackgroundResource(R.drawable.wrong_answer_bg);
                backgroundScoreboard2.setBackgroundResource(R.drawable.wrong_answer_bg);
            }
        }
        if (eighthClassSelected) {
            textClass.setText("8️⃣ Osztály");
            allClassLevelPoints = 134;
            if (allPoints < allClassLevelPoints) {
                textClassLevelResult.setText("Nem sikerült teljesíteni");
                textClassLevelResult.setBackgroundResource(R.drawable.wrong_answer_bg);
                backgroundScoreboard2.setBackgroundResource(R.drawable.wrong_answer_bg);
            }
        }
        if (ninthClassSelected) {
            textClass.setText("9️⃣. Osztály");
            allClassLevelPoints = 160;
            if (allPoints < allClassLevelPoints) {
                textClassLevelResult.setText("Nem sikerült teljesíteni");
                textClassLevelResult.setBackgroundResource(R.drawable.wrong_answer_bg);
                backgroundScoreboard2.setBackgroundResource(R.drawable.wrong_answer_bg);
            }
        }


        Button buttonBackMain = (Button) findViewById(R.id.buttonBackMain);
        buttonBackMain.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //TODO: reset class
                Intent intent = new Intent(FinishActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });


        Button button_exit = (androidx.appcompat.widget.AppCompatButton) findViewById(R.id.button_exit);
        button_exit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                finishAndRemoveTask();
                System.exit(0);
            }
        });
    }
}