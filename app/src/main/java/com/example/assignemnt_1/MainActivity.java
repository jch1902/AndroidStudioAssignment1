//CSE41246 - Android Fundamentals
//Winter 2019
//Assignment 1
//Hoong, Jasper

package com.example.assignemnt_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView firstNameTextField = null;
    private TextView lastNameTextField = null;
    private Button submitButton = null;
    private String lastName;
    private String firstName;
    private TextView resultText =  null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize variables
        this.firstNameTextField = findViewById(R.id.firstName);
        this.lastNameTextField = findViewById(R.id.lastName);
        this.resultText = findViewById(R.id.textViewResult);

        this.submitButton = (Button)findViewById(R.id.button);
        this.submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("My Submit Button", "OnClick Pressed");
                setUserInfo();

                Log.d("First Name: ", firstName);
                Log.d("Last Name: ", lastName);
                showResults();
            }
        });
    }

    private void setUserInfo() {
        this.firstName = this.firstNameTextField.getText().toString();
        this.lastName = this.lastNameTextField.getText().toString();
    }
    private void showResults(){
        String resultStr = "Hello! Nice to meet you " + firstName + " " + lastName;

        this.resultText.setText(resultStr);
    }
}
