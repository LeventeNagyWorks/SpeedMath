package com.example.green_math;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FinishActivity extends AppCompatActivity {

    TextView textResult;
    TextView questionAnswered;

    int allPoints;
    int allQuestionAnswered;

    int addQuestionAnswered;
    int addPoints;

    int subQuestionAnswered;
    int subPoints;

    int admixQuestionAnswered;
    int admixPoints;

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
        admixPoints = sp2.getInt("AdmixPoints", -1);
        admixQuestionAnswered = sp2.getInt("AdmixQuestionAnswered", -1);


        allPoints = addPoints + subPoints + admixPoints;
        allQuestionAnswered = addQuestionAnswered + subQuestionAnswered + admixQuestionAnswered;

        textResult.setText("Pont: " + allPoints);
        questionAnswered.setText("Megoldva: " + allQuestionAnswered);


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