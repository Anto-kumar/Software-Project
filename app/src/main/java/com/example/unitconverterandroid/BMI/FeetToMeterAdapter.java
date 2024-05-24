package com.example.unitconverterandroid.BMI;

import com.example.unitconverterandroid.Length.LengthConverterFactory;
import com.example.unitconverterandroid.Length.LengthConverter;

public class FeetToMeterAdapter {
    public static double convertAndCalculateBMI(double weight, double heightInFeet) {
        // Convert height from feet to meters using the appropriate LengthConverter
        LengthConverter converter = LengthConverterFactory.getConverter("feettometer", heightInFeet);
        double heightInMeters = converter.convert();

        // Calculate BMI using the converted height
        BMIConverterInterface bmiConverter = BMIConverterFactory.getBMIConverter();
        return bmiConverter.calculateBMI(weight, heightInMeters);
    }
}
