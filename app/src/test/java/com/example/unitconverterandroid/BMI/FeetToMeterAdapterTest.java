package com.example.unitconverterandroid.BMI;

import static org.junit.Assert.*;

import org.junit.Test;

public class FeetToMeterAdapterTest {

    @Test
    public void testConvertAndCalculateBMI() {
        double weightKg = 70; // Example weight in kg
        double heightFeet = 6; // Example height in feet

        double expectedHeightMeters = 1.8288; // 6 feet to meters
        double expectedBMI = weightKg / (expectedHeightMeters * expectedHeightMeters);

        double calculatedBMI = FeetToMeterAdapter.convertAndCalculateBMI(weightKg, heightFeet);

        // Verify the calculated BMI is as expected
        assertEquals("Calculated BMI does not match expected value", expectedBMI, calculatedBMI, 0.01);
    }
}
