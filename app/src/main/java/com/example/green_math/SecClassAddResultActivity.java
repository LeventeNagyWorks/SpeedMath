package com.example.green_math;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecClassAddResultActivity extends AppCompatActivity {

    TextView textResult;
    TextView textQuestionAnswered;
    int point;
    int questionAnswered;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_result_class2);

        point = getIntent().getIntExtra("Pont", 0);
        questionAnswered = getIntent().getIntExtra("FeladatDb", 0);
        textResult = findViewById(R.id.textResult);
        textQuestionAnswered = findViewById(R.id.textQuestionAnswered);

        textResult.setText("Pont: " + point);
        textQuestionAnswered.setText("Feladat: " + questionAnswered);
    }
}