package com.example.unitconverterandroid.Currency;

public class takatorupee extends currencymain implements CurrencyConverter {
    private static takatorupee instance;

    private takatorupee(double value) {
        super(value);
    }

    public static synchronized takatorupee getInstance(double value) {
        if (instance == null) {
            instance = new takatorupee(value);
        } else {
            // Optionally update the value if a new value is provided
            instance.value = value;
        }
        return instance;
    }

    @Override
    public double convert() {
        return value * 0.8;
    }
}
