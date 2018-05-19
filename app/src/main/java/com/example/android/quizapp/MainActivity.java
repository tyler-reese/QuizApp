package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkAnswers(View view) {
        int correct = 0;
        int incorrect = 0;

        // Question 1
        EditText answer1EditText = findViewById(R.id.question_1_answer);
        String answer1 = answer1EditText.getText().toString().toLowerCase();
        if (answer1.equals("square")) {
            correct++;
        } else {
            incorrect++;
        }

        // Question 2
        RadioButton parallelogramRadioButton = findViewById(R.id.radioParallelogram);
        if (parallelogramRadioButton.isChecked()) {
            correct++;
        } else {
            incorrect++;
        }

        // Question 3
        CheckBox quadrilateralCheckBox = findViewById(R.id.checkboxQuadrilateral);
        CheckBox parallelogramCheckBox = findViewById(R.id.checkboxParallelogram);
        CheckBox rectangleCheckBox = findViewById(R.id.checkboxRectangle);
        CheckBox squareCheckBox = findViewById(R.id.checkboxSquare);
        if (quadrilateralCheckBox.isChecked() &&
            parallelogramCheckBox.isChecked() &&
            rectangleCheckBox.isChecked() &&
            !squareCheckBox.isChecked()) {
            correct++;
        } else {
            incorrect++;
        }

        // Question 4
        EditText answer4EditText = findViewById(R.id.question_4_answer);
        String answer4 = answer4EditText.getText().toString();
        if (answer4.length() > 0 && Integer.parseInt(answer4) == 4) {
            correct++;
        } else {
            incorrect++;
        }

        Toast.makeText(this, "You got " + correct + " right and " + incorrect + " wrong", Toast.LENGTH_LONG).show();
    }
}
