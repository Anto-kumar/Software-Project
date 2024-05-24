package com.example.unitconverterandroid;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.unitconverterandroid.Length.LengthConverterFactory;


public class LengthConverter extends AppCompatActivity {

    Button metertocm, cmtoinch, metertofeet, feettometer;

    EditText input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_length_converter);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

           metertocm = findViewById(R.id.metertocm);
           cmtoinch = findViewById(R.id.cmtoinch);
           metertofeet = findViewById(R.id.metertofeet);
           feettometer = findViewById(R.id.feettometer);
           input = findViewById(R.id.input);

              metertocm.setOnClickListener(v -> {
                if(input.getText().toString().isEmpty())
                {
                     input.setError("Fill input value");
                }
                else
                {
                     Intent intent = new Intent(LengthConverter.this, LengthConverterShow.class);
                     intent.putExtra("length", "metertocm");
                     intent.putExtra("input", input.getText().toString());
                     startActivity(intent);
                }
              });

                cmtoinch.setOnClickListener(v -> {
                    if(input.getText().toString().isEmpty())
                    {
                         input.setError("Fill input value");
                    }
                    else
                    {
                         Intent intent = new Intent(LengthConverter.this, LengthConverterShow.class);
                         intent.putExtra("length", "cmtometer");
                         intent.putExtra("input", input.getText().toString());
                         startActivity(intent);
                    }
                });

                    metertofeet.setOnClickListener(v -> {
                        if(input.getText().toString().isEmpty())
                        {
                             input.setError("Fill input value");
                        }
                        else
                        {
                             Intent intent = new Intent(LengthConverter.this, LengthConverterShow.class);
                             intent.putExtra("length", "metertofeet");
                             intent.putExtra("input", input.getText().toString());
                             startActivity(intent);
                        }
                    });

                    feettometer.setOnClickListener(v -> {
                        if(input.getText().toString().isEmpty())
                        {
                             input.setError("Fill input value");
                        }
                        else
                        {
                             Intent intent = new Intent(LengthConverter.this, LengthConverterShow.class);
                             intent.putExtra("length", "feettometer");
                             intent.putExtra("input", input.getText().toString());
                             startActivity(intent);
                        }
                    });

    }
}