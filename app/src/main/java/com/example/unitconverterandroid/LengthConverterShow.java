package com.example.unitconverterandroid;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.unitconverterandroid.Length.LengthConverterFactory;
import com.example.unitconverterandroid.Length.LengthConverter;



public class LengthConverterShow extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_length_converter_show);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        tv=findViewById(R.id.tv);

        Intent intent = getIntent();
        String length = intent.getStringExtra("length");
        String input = intent.getStringExtra("input");

        double inputValue = Double.parseDouble(input);

        LengthConverter result = LengthConverterFactory.getConverter(length, inputValue);
        double x = result.convert();
        Toast.makeText(this, String.valueOf(x), Toast.LENGTH_SHORT).show();
        tv.setText(String.valueOf(x));


    }
}