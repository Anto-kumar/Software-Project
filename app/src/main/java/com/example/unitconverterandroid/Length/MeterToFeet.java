package com.example.unitconverterandroid.Length;

public class MeterToFeet extends LengthMain implements LengthConverter{
    private static MeterToFeet instance;

    private MeterToFeet(double value) {
        super(value);
    }

    public static synchronized MeterToFeet getInstance(double value) {
        if (instance == null) {
            instance = new MeterToFeet(value);
        } else {
            // Optionally update the value if a new value is provided
            instance.value = value;
        }
        return instance;
    }

    @Override
    public double convert() {
        return value * 3.28084;
    }
}
