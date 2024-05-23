package com.example.unitconverterandroid.Currency;

public class takatodollar extends currencymain implements CurrencyConverter {
    private static takatodollar instance;

    private takatodollar(double value) {
        super(value);
    }

    public static synchronized takatodollar getInstance(double value) {
        if (instance == null) {
            instance = new takatodollar(value);
        } else {
            // Optionally update the value if a new value is provided
            instance.value = value;
        }
        return instance;
    }

    @Override
    public double convert() {
        return value * 0.012;
    }
}
