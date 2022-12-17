package com.example.green_math;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AddResultActivity extends AppCompatActivity {


    TextView textResult;
    TextView questionAnswered;
    Button buttonToSub;

    int addPoints;
    int addQuestionAnswered;

    SharedPreferences sp;
//    String addPointsStr;
//    String addQuestionAnsweredStr;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_result);



        addPoints = getIntent().getIntExtra("AddPont", 0);
        addQuestionAnswered = getIntent().getIntExtra("AddFeladatDb", 0);
        textResult = findViewById(R.id.textResult);
        questionAnswered = findViewById(R.id.textQuestionAnswered);

        textResult.setText("Pont: " + addPoints);
        questionAnswered.setText("Megoldva: " + addQuestionAnswered);


        sp = getSharedPreferences("AddResults", Context.MODE_PRIVATE);


        buttonToSub = (Button) findViewById(R.id.buttonToSub);
        buttonToSub.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {


                SharedPreferences.Editor editor = sp.edit();

                editor.putInt("AddPoints", addPoints);
                editor.putInt("AddQuestionAnswered", addQuestionAnswered);
                editor.commit();

                Intent intent = new Intent(AddResultActivity.this, QuestionsSubActivity.class);
                startActivity(intent);
            }
        });

    }
}