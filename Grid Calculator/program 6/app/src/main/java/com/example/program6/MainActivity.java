package com.example.program6;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView num1, Result;

    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9;
    Button add, sub, mul, div, equal;

    int number1 = 0, number2 = 0, answer = 0;
    char operator = ' ';

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.textView2);
        Result = findViewById(R.id.textView3);

        b0 = findViewById(R.id.button16);
        b1 = findViewById(R.id.button11);
        b2 = findViewById(R.id.button12);
        b3 = findViewById(R.id.button13);
        b4 = findViewById(R.id.button7);
        b5 = findViewById(R.id.button8);
        b6 = findViewById(R.id.button9);
        b7 = findViewById(R.id.button);
        b8 = findViewById(R.id.button4);
        b9 = findViewById(R.id.button5);

        add = findViewById(R.id.button19);
        sub = findViewById(R.id.button14);
        mul = findViewById(R.id.button10);
        div = findViewById(R.id.button6);
        equal = findViewById(R.id.button17);

        b0.setOnClickListener(v -> Result.append("0"));
        b1.setOnClickListener(v -> Result.append("1"));
        b2.setOnClickListener(v -> Result.append("2"));
        b3.setOnClickListener(v -> Result.append("3"));
        b4.setOnClickListener(v -> Result.append("4"));
        b5.setOnClickListener(v -> Result.append("5"));
        b6.setOnClickListener(v -> Result.append("6"));
        b7.setOnClickListener(v -> Result.append("7"));
        b8.setOnClickListener(v -> Result.append("8"));
        b9.setOnClickListener(v -> Result.append("9"));

        add.setOnClickListener(v -> {
            if (Result.getText().toString().isEmpty()) {
                return;
            }

            number1 = Integer.parseInt(Result.getText().toString());
            operator = '+';
            Result.setText("");
        });

        sub.setOnClickListener(v -> {
            if (Result.getText().toString().isEmpty()) {
                return;
            }

            number1 = Integer.parseInt(Result.getText().toString());
            operator = '-';
            Result.setText("");
        });

        mul.setOnClickListener(v -> {
            if (Result.getText().toString().isEmpty()) {
                return;
            }

            number1 = Integer.parseInt(Result.getText().toString());
            operator = '*';
            Result.setText("");
        });

        div.setOnClickListener(v -> {
            if (Result.getText().toString().isEmpty()) {
                return;
            }

            number1 = Integer.parseInt(Result.getText().toString());
            operator = '/';
            Result.setText("");
        });


        equal.setOnClickListener(v -> {

            if (Result.getText().toString().isEmpty()) {
                return;
            }

            number2 = Integer.parseInt(Result.getText().toString());

            if (operator == '+') {
                answer = number1 + number2;
            }
            else if (operator == '-') {
                answer = number1 - number2;
            }
            else if (operator == '*') {
                answer = number1 * number2;
            }
            else if (operator == '/') {

                if (number2 != 0) {
                    answer = number1 / number2;
                }
                else {
                    Result.setText("Error");
                    return;
                }
            }
            else {
                return;
            }

            num1.setText(String.valueOf(number1));
            Result.setText(String.valueOf(answer));

            operator = ' ';
        });
    }
}