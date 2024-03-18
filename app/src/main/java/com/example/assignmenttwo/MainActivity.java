package com.example.assignmenttwo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editTextNumber1;
    private EditText editTextNumber2;
    private Button buttonCalculate;
    private TextView textViewResult;
    private Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        editTextNumber1 = findViewById(R.id.editTextone);
        editTextNumber2 = findViewById(R.id.editTexttwo);
        buttonCalculate = findViewById(R.id.CalculateButton);
        textViewResult = findViewById(R.id.ResultTextView);
        btnBack = findViewById(R.id.btnback);

        // Set click listener for the "Calculate" button
        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the numbers from the EditText fields
                String num1Str = editTextNumber1.getText().toString();
                String num2Str = editTextNumber2.getText().toString();

                // Check if the input is not empty
                if (!num1Str.isEmpty() && !num2Str.isEmpty()) {
                    // Parse the input to integers
                    int num1 = Integer.parseInt(num1Str);
                    int num2 = Integer.parseInt(num2Str);

                    // Add the numbers
                    int sum = num1 + num2;

                    // Display the result in the TextView
                    textViewResult.setText("Result: " + sum);

                    // Make the result TextView visible
                    textViewResult.setVisibility(View.VISIBLE);

                    // Make the "Back" button visible
                    btnBack.setVisibility(View.VISIBLE);
                } else {
                    // Display an error message if the input is empty
                    textViewResult.setText("Please enter two numbers");
                }
            }
        });

        // Set click listener for the "Back" button
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Reset the input fields and result TextView
                editTextNumber1.setText("");
                editTextNumber2.setText("");
                textViewResult.setText("Show The Results");

                // Make the result TextView and "Back" button invisible
                textViewResult.setVisibility(View.INVISIBLE);
                btnBack.setVisibility(View.GONE);
            }
        });
    }
}
