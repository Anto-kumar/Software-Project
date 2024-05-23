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

import com.example.unitconverterandroid.Currency.CurrencyConverter;
import com.example.unitconverterandroid.Currency.CurrencyConverterFactory;

import org.w3c.dom.Text;

public class CurrencyConverterShow extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_currency_converter_show);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        tv=findViewById(R.id.tv);

        Intent intent = getIntent();
        String currencyType = intent.getStringExtra("currency");
        String inputValueString = intent.getStringExtra("input");
        Double inputValue = Double.parseDouble(inputValueString);



        CurrencyConverter result = CurrencyConverterFactory.getConverter(currencyType, inputValue);

        double x = result.convert();
        Toast.makeText(this, String.valueOf(x), Toast.LENGTH_SHORT).show();
        tv.setText(String.valueOf(x));






    }
}


//new line added
//ami miraz
//ami anto