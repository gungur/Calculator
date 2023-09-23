package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addClickFunction(View view) {

        EditText firstIntegerInput = (EditText) findViewById(R.id.firstIntegerInput);
        EditText secondIntegerInput = (EditText) findViewById(R.id.secondIntegerInput);
        Integer firstInteger = Integer.valueOf(firstIntegerInput.getText().toString());
        Integer secondInteger = Integer.valueOf(secondIntegerInput.getText().toString());
        String result = String.valueOf((double)firstInteger + (double)secondInteger);
        goToActivity(result);
    }

    public void subtractClickFunction(View view) {

        EditText firstIntegerInput = (EditText) findViewById(R.id.firstIntegerInput);
        EditText secondIntegerInput = (EditText) findViewById(R.id.secondIntegerInput);
        Integer firstInteger = Integer.valueOf(firstIntegerInput.getText().toString());
        Integer secondInteger = Integer.valueOf(secondIntegerInput.getText().toString());
        String result = String.valueOf((double)firstInteger - (double)secondInteger);
        goToActivity(result);
    }

    public void multiplyClickFunction(View view) {

        EditText firstIntegerInput = (EditText) findViewById(R.id.firstIntegerInput);
        EditText secondIntegerInput = (EditText) findViewById(R.id.secondIntegerInput);
        Integer firstInteger = Integer.valueOf(firstIntegerInput.getText().toString());
        Integer secondInteger = Integer.valueOf(secondIntegerInput.getText().toString());
        String result = String.valueOf((double)firstInteger * (double)secondInteger);
        goToActivity(result);
    }

    public void divideClickFunction(View view) {

        String result;
        EditText firstIntegerInput = (EditText) findViewById(R.id.firstIntegerInput);
        EditText secondIntegerInput = (EditText) findViewById(R.id.secondIntegerInput);
        Integer firstInteger = Integer.valueOf(firstIntegerInput.getText().toString());
        Integer secondInteger = Integer.valueOf(secondIntegerInput.getText().toString());
        if (secondInteger.equals(0)) {
            result = "Sorry! Dividing by zero is undefined.";
        } else {
            result = String.valueOf((double)firstInteger / (double)secondInteger);
        }
        goToActivity(result);
    }

    public void goToActivity(String s) {
        Intent intent = new Intent(this, CalculatorActivity.class);
        intent.putExtra("message", s);
        startActivity(intent);
    }
}