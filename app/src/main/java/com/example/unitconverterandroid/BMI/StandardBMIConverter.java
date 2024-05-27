package com.example.unitconverterandroid.BMI;

public class StandardBMIConverter implements BMIConverterInterface {
    @Override
    public double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }
}
