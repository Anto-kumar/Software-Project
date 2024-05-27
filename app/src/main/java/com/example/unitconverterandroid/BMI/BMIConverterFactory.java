package com.example.unitconverterandroid.BMI;

public class BMIConverterFactory {
    public static BMIConverterInterface getBMIConverter() {
        return new StandardBMIConverter();
    }
}

