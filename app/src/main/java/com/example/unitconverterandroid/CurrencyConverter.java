package com.example.unitconverterandroid;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CurrencyConverter extends AppCompatActivity {

    Button a,b;
    EditText input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_currency_converter);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        a = findViewById(R.id.takatorupi);
        b = findViewById(R.id.takatodollar);
        input = findViewById(R.id.takeinput);



        a.setOnClickListener(v -> {
            if(input.getText().toString().isEmpty())
            {
                Toast.makeText(this, "Fill input value", Toast.LENGTH_SHORT).show();
            }
            else
            {
                // Convert Takas to Dollars
                Intent intent = new Intent(CurrencyConverter.this, CurrencyConverterShow.class);
                intent.putExtra("currency", "takatodollar");
                intent.putExtra("input", input.getText().toString());
                startActivity(intent);
            }

        });

        b.setOnClickListener(v -> {
            if(input.getText().toString().isEmpty())
            {
                Toast.makeText(this, "Fill input value", Toast.LENGTH_SHORT).show();
            }
            else {
                // Convert Takas to Dollars
                Intent intent = new Intent(CurrencyConverter.this, CurrencyConverterShow.class);
                intent.putExtra("currency", "takatorupee");
                intent.putExtra("input", input.getText().toString());
                startActivity(intent);

            }
        });
    }
}