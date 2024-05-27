package com.example.unitconverterandroid.Currency;


public class rupeetotaka extends currencymain implements CurrencyConverter {
    private static rupeetotaka instance;

    private rupeetotaka(double value) {
        super(value);
    }

    public static synchronized rupeetotaka getInstance(double value) {
        if (instance == null) {
            instance = new rupeetotaka(value);
        } else {
            // Optionally update the value if a new value is provided
            instance.value = value;
        }
        return instance;
    }

    @Override
    public double convert() {
        return value * 1.2;
    }
}
