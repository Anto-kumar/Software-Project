package com.example.unitconverterandroid.Length;

public class CmToInch extends LengthMain implements LengthConverter {
    private static CmToInch instance;

    private CmToInch(double value) {
        super(value);
    }

    public static synchronized CmToInch getInstance(double value) {
        if (instance == null) {
            instance = new CmToInch(value);
        } else {
            // Optionally update the value if a new value is provided
            instance.value = value;
        }
        return instance;
    }

    @Override
    public double convert() {
        return value / 2.54;
    }
}
