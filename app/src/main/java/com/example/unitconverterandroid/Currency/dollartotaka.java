package com.example.unitconverterandroid.Currency;

public class dollartotaka extends currencymain implements CurrencyConverter {
    private static dollartotaka instance;

    private dollartotaka(double value) {
        super(value);
    }

    public static synchronized dollartotaka getInstance(double value) {
        if (instance == null) {
            instance = new dollartotaka(value);
        } else {
            // Optionally update the value if a new value is provided
            instance.value = value;
        }
        return instance;
    }

    @Override
    public double convert() {
        return value * 84.5;
    }

}