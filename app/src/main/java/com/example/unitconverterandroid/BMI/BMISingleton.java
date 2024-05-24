package com.example.unitconverterandroid.BMI;

public class BMISingleton {
    private static BMISingleton instance;

    private BMISingleton() {}

    public static synchronized BMISingleton getInstance() {
        if (instance == null) {
            instance = new BMISingleton();
        }
        return instance;
    }

    public double calculateBMI(double weight, double height) {
        BMIConverterInterface converter = BMIConverterFactory.getBMIConverter();
        return converter.calculateBMI(weight, height);
    }
}
