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

    TextView textClass;
    LinearLayout backgroundScoreboard2;

    TextView textResultAdd;
    TextView questionAnsweredAdd;
    TextView textClassLevelAdd;

    TextView textResultSub;
    TextView questionAnsweredSub;
    TextView textClassLevelSub;

    TextView textResultAdmix;
    TextView questionAnsweredAdmix;
    TextView textClassLevelAdmix;

    TextView textResultMult;
    TextView questionAnsweredMult;
    TextView textClassLevelMult;

    TextView textResultDiv;
    TextView questionAnsweredDiv;
    TextView textClassLevelDiv;



    String textSecClassAnnounce = "2. osztályos szinten vagy!";
    String textThirdClassAnnounce = "3. osztályos szinten vagy!";
    String textFourthClassAnnounce = "4. osztályos szinten vagy!";
    String textFifthClassAnnounce = "5. osztályos szinten vagy!";
    String textSixthClassAnnounce = "6. osztályos szinten vagy!";
    String textSeventhClassAnnounce = "7. osztályos szinten vagy!";
    String textEighthClassAnnounce = "8. osztályos szinten vagy!";
    String textNinthClassAnnounce = "9. osztályos szinten vagy!";

    int allPoints = 0;
    int allQuestionAnswered = 0;
    int allClassLevelPoints = 0;

    int addQuestionAnswered = 0;
    int addPoints = 0;

    int subQuestionAnswered = 0;
    int subPoints = 0;

    int admixQuestionAnswered = 0;
    int admixPoints = 0;

    int multQuestionAnswered = 0;
    int multPoints = 0;

    int divQuestionAnswered = 0;
    int divPoints = 0;

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


        textResultAdd = findViewById(R.id.textResultAdd);
        questionAnsweredAdd = findViewById(R.id.textQuestionAnsweredAdd);
        textClassLevelAdd = findViewById(R.id.textClassLevelAdd);

        textResultSub = findViewById(R.id.textResultSub);
        questionAnsweredSub = findViewById(R.id.textQuestionAnsweredSub);
        textClassLevelSub = findViewById(R.id.textClassLevelSub);

        textResultAdmix = findViewById(R.id.textResultAdmix);
        questionAnsweredAdmix = findViewById(R.id.textQuestionAnsweredAdmix);
        textClassLevelAdmix = findViewById(R.id.textClassLevelAdmix);

        textResultMult = findViewById(R.id.textResultMult);
        questionAnsweredMult = findViewById(R.id.textQuestionAnsweredMult);
        textClassLevelMult = findViewById(R.id.textClassLevelMult);

        textResultDiv = findViewById(R.id.textResultDiv);
        questionAnsweredDiv = findViewById(R.id.textQuestionAnsweredDiv);
        textClassLevelDiv = findViewById(R.id.textClassLevelDiv);


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
        backgroundScoreboard2 = findViewById(R.id.backgroundScoreboard2Add);
//        textClassLevelResult = findViewById(R.id.textClassLevelResultAdd);
        String textRetry = "Próbálkozz újra!";

        if (secClassSelected) {
            textClass.setText("2. Osztály");
            allClassLevelPoints = 35;

        }
        if (thirdClassSelected) {
            textClass.setText("3. Osztály");
            allClassLevelPoints = 62;

        }
        if (fourthClassSelected) {
            textClass.setText("4. Osztály");
            allClassLevelPoints = 85;

        }
        if (fifthClassSelected) {
            textClass.setText("5. Osztály");
            allClassLevelPoints = 97;

        }
        if (sixthClassSelected) {
            textClass.setText("6. Osztály");
            allClassLevelPoints = 108;

        }
        if (seventhClassSelected) {
            textClass.setText("7. Osztály");
            allClassLevelPoints = 119;

        }
        if (eighthClassSelected) {
            textClass.setText("8. Osztály");
            allClassLevelPoints = 134;

        }
        if (ninthClassSelected) {
            textClass.setText("9. Osztály");
            allClassLevelPoints = 160;

        }


        addAnno();
        subAnno();
        admixAnno();
        multAnno();
        divAnno();



        allPoints = addPoints + subPoints + admixPoints + multPoints + divPoints;
        allQuestionAnswered = addQuestionAnswered + subQuestionAnswered + admixQuestionAnswered + multQuestionAnswered + divQuestionAnswered;


        textResultAdd.setText("Elért pontszám: " + addPoints);
        questionAnsweredAdd.setText("Megoldva: " + addQuestionAnswered);

        textResultSub.setText("Elért pontszám: " + subPoints);
        questionAnsweredSub.setText("Megoldva: " + subQuestionAnswered);

        textResultAdmix.setText("Elért pontszám: " + admixPoints);
        questionAnsweredAdmix.setText("Megoldva: " + admixQuestionAnswered);

        textResultMult.setText("Elért pontszám: " + multPoints);
        questionAnsweredMult.setText("Megoldva: " + multQuestionAnswered);

        textResultDiv.setText("Elért pontszám: " + divPoints);
        questionAnsweredDiv.setText("Megoldva: " + divQuestionAnswered);


        addPoints = 0;
        addQuestionAnswered = 0;

        subPoints = 0;
        subQuestionAnswered = 0;

        admixPoints = 0;
        admixQuestionAnswered = 0;

        multPoints = 0;
        multQuestionAnswered = 0;

        divPoints = 0;
        divQuestionAnswered = 0;


        Button buttonBackMain = (Button) findViewById(R.id.buttonBackMain);
        buttonBackMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FinishActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private void addAnno() {

        if (addPoints >= 8) {
            textClassLevelAdd.setText(textSecClassAnnounce);
        }
        if (addPoints >= 15 && addPoints < 20) {
            textClassLevelAdd.setText(textThirdClassAnnounce);
        }
        if (addPoints >= 20 && addPoints < 24) {
            textClassLevelAdd.setText(textFourthClassAnnounce);
        }
        if (addPoints >= 24 && addPoints < 28) {
            textClassLevelAdd.setText(textFifthClassAnnounce);
        }
        if (addPoints >= 28 && addPoints < 31) {
            textClassLevelAdd.setText(textSixthClassAnnounce);
        }
        if (addPoints >= 31 && addPoints < 36) {
            textClassLevelAdd.setText(textSeventhClassAnnounce);
        }
        if (addPoints >= 36 && addPoints < 42) {
            textClassLevelAdd.setText(textEighthClassAnnounce);
        }
        if (addPoints >= 42) {
            textClassLevelAdd.setText(textNinthClassAnnounce);
        }

    }

    private void subAnno() {

        if (subPoints >= 8) {
            textClassLevelSub.setText(textSecClassAnnounce);
        }
        if (subPoints >= 12 && subPoints < 15) {
            textClassLevelSub.setText(textThirdClassAnnounce);
        }
        if (subPoints >= 15 && subPoints < 17) {
            textClassLevelSub.setText(textFourthClassAnnounce);
        }
        if (subPoints >= 17 && subPoints < 19) {
            textClassLevelSub.setText(textFifthClassAnnounce);
        }
        if (subPoints >= 19 && subPoints < 20) {
            textClassLevelSub.setText(textSixthClassAnnounce);
        }
        if (subPoints >= 20 && subPoints < 24) {
            textClassLevelSub.setText(textSeventhClassAnnounce);
        }
        if (subPoints >= 24 && subPoints < 27) {
            textClassLevelSub.setText(textEighthClassAnnounce);
        }
        if (subPoints >= 27) {
            textClassLevelSub.setText(textNinthClassAnnounce);
        }


    }

    private void admixAnno() {

        if (admixPoints >= 7) {
            textClassLevelAdmix.setText(textSecClassAnnounce);
        }
        if (admixPoints >= 12 && admixPoints < 16) {
            textClassLevelAdmix.setText(textThirdClassAnnounce);
        }
        if (admixPoints >= 16 && admixPoints < 18) {
            textClassLevelAdmix.setText(textFourthClassAnnounce);
        }
        if (admixPoints >= 18 && admixPoints < 19) {
            textClassLevelAdmix.setText(textFifthClassAnnounce);
        }
        if (admixPoints >= 19 && admixPoints < 21) {
            textClassLevelAdmix.setText(textSixthClassAnnounce);
        }
        if (admixPoints >= 21 && admixPoints < 24) {
            textClassLevelAdmix.setText(textSeventhClassAnnounce);
        }
        if (admixPoints >= 24 && admixPoints < 27) {
            textClassLevelAdmix.setText(textEighthClassAnnounce);
        }
        if (admixPoints >= 27) {
            textClassLevelAdmix.setText(textNinthClassAnnounce);
        }

    }

    private void multAnno() {

        if (multPoints >= 6) {
            textClassLevelMult.setText(textSecClassAnnounce);
        }
        if (multPoints >= 12 && multPoints < 20) {
            textClassLevelMult.setText(textThirdClassAnnounce);
        }
        if (multPoints >= 20 && multPoints < 22) {
            textClassLevelMult.setText(textFourthClassAnnounce);
        }
        if (multPoints >= 22 && multPoints < 24) {
            textClassLevelMult.setText(textFifthClassAnnounce);
        }
        if (multPoints >= 24 && multPoints < 27) {
            textClassLevelMult.setText(textSixthClassAnnounce);
        }
        if (multPoints >= 27 && multPoints < 29) {
            textClassLevelMult.setText(textSeventhClassAnnounce);
        }
        if (multPoints >= 29 && multPoints < 35) {
            textClassLevelMult.setText(textEighthClassAnnounce);
        }
        if (multPoints >= 35) {
            textClassLevelMult.setText(textNinthClassAnnounce);
        }

    }

    private void divAnno() {

        if (divPoints >= 6) {
            textClassLevelDiv.setText(textSecClassAnnounce);
        }
        if (divPoints >= 11 && divPoints < 14) {
            textClassLevelDiv.setText(textThirdClassAnnounce);
        }
        if (divPoints >= 14 && divPoints < 16) {
            textClassLevelDiv.setText(textFourthClassAnnounce);
        }
        if (divPoints >= 16 && divPoints < 18) {
            textClassLevelDiv.setText(textFifthClassAnnounce);
        }
        if (divPoints >= 18 && divPoints < 20) {
            textClassLevelDiv.setText(textSixthClassAnnounce);
        }
        if (divPoints >= 20 && divPoints < 21) {
            textClassLevelDiv.setText(textSeventhClassAnnounce);
        }
        if (divPoints >= 21 && divPoints < 29) {
            textClassLevelDiv.setText(textEighthClassAnnounce);
        }
        if (divPoints >= 29) {
            textClassLevelDiv.setText(textNinthClassAnnounce);
        }

    }



    public void onBackPressed() {
        Intent intent = new Intent(FinishActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }

}