package com.example.green_math;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AdmixResultActivity extends AppCompatActivity {

    TextView textResult;
    TextView questionAnswered;
    Button buttonToMult;

    int admixPoints;
    int admixQuestionAnswered;

    SharedPreferences sp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admix_result);

        admixPoints = getIntent().getIntExtra("AdmixPont", 0);
        admixQuestionAnswered = getIntent().getIntExtra("AdmixFeladatDb", 0);



        textResult = findViewById(R.id.textResult);
        questionAnswered = findViewById(R.id.textQuestionAnswered);

        textResult.setText("Pont: " + admixPoints);
        questionAnswered.setText("Megoldva: " + admixQuestionAnswered);


        sp = getSharedPreferences("SubResults", Context.MODE_PRIVATE);



        buttonToMult = (Button) findViewById(R.id.buttonToMult);
        buttonToMult.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                SharedPreferences.Editor editor = sp.edit();

                editor.putInt("AdmixPoints", admixPoints);
                editor.putInt("AdmixQuestionAnswered", admixQuestionAnswered);
                editor.commit();

                Intent intent = new Intent(AdmixResultActivity.this, FinishActivity.class);
                startActivity(intent);
            }
        });
    }
}