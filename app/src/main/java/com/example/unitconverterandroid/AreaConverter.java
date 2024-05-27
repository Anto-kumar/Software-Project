package com.example.unitconverterandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.unitconverterandroid.Area.AreaSingleton;

public class AreaConverter extends AppCompatActivity {
    private EditText inputEditText;
    private Button mSquareToCMSquareButton;
    private Button kmSquareToMSquareButton;
    private Button cmSquareToMSquareButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_converter);

        inputEditText = findViewById(R.id.input_value);
        mSquareToCMSquareButton = findViewById(R.id.m_square_to_cm_square);
        kmSquareToMSquareButton = findViewById(R.id.km_square_to_m_square);
        cmSquareToMSquareButton = findViewById(R.id.cm_square_to_m_square);
        resultTextView = findViewById(R.id.result);

        mSquareToCMSquareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performConversion("MSquareToCMSquare");
            }
        });

        kmSquareToMSquareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performConversion("KMSquareToMSquare");
            }
        });

        cmSquareToMSquareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performConversion("CMSquareToMSquare");
            }
        });
    }

    private void performConversion(String conversionType) {
        String inputValue = inputEditText.getText().toString();
        if (!inputValue.isEmpty()) {
            double value = Double.parseDouble(inputValue);
            double result = AreaSingleton.getInstance().convert(conversionType, value);
            resultTextView.setText(String.valueOf(result));
        } else {
            Toast.makeText(this, "Please enter a value", Toast.LENGTH_SHORT).show();
        }
    }
}


