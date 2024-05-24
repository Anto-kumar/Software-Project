package com.example.unitconverterandroid;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.unitconverterandroid.BMI.FeetToMeterAdapter;

public class BMIConverter extends AppCompatActivity {

    private EditText weightInput, heightInput;
    private Button calculateBMIButton;
    private TextView bmiResultText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bmiconverter);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        weightInput = findViewById(R.id.weight);
        heightInput = findViewById(R.id.height);
        calculateBMIButton = findViewById(R.id.bmibutton);
        bmiResultText = findViewById(R.id.bmiresult);

        calculateBMIButton.setOnClickListener(v -> {
            try {
                double weight = Double.parseDouble(weightInput.getText().toString().trim());
                double heightInFeet = Double.parseDouble(heightInput.getText().toString().trim());
                if(weight <= 0 || heightInFeet <= 0){
                    Toast.makeText(BMIConverter.this, "Please enter valid numbers.", Toast.LENGTH_SHORT).show();
                }
                // Use adapter to convert height and calculate BMI
                else{
                    double bmi = FeetToMeterAdapter.convertAndCalculateBMI(weight, heightInFeet);
                    bmiResultText.setText(String.format("BMI: %.2f", bmi));
                }


            } catch (NumberFormatException e) {
                Toast.makeText(BMIConverter.this, "Please enter valid numbers.", Toast.LENGTH_SHORT).show();
            }
        });
    }


}