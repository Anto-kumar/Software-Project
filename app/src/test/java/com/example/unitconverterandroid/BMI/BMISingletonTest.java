package com.example.unitconverterandroid.BMI;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BMISingletonTest {

    private BMISingleton bmiSingleton;

    @Before
    public void setUp() {
        bmiSingleton = BMISingleton.getInstance();
    }

    @Test
    public void testCalculateBMI() {
        double weight = 70; // in kilograms
        double height = 1.75; // in meters
        double expectedBMI = 22.86; // expected BMI value

        double actualBMI = bmiSingleton.calculateBMI(weight, height);

        // Allowing a small delta for floating-point comparison
        assertEquals(expectedBMI, actualBMI, 0.01);
    }

    @Test
    public void testCalculateBMIWithDifferentValues() {
        double weight = 80; // in kilograms
        double height = 1.80; // in meters
        double expectedBMI = 24.69; // expected BMI value

        double actualBMI = bmiSingleton.calculateBMI(weight, height);

        // Allowing a small delta for floating-point comparison
        assertEquals(expectedBMI, actualBMI, 0.01);
    }

    @Test
    public void testSingletonInstance() {
        BMISingleton firstInstance = BMISingleton.getInstance();
        BMISingleton secondInstance = BMISingleton.getInstance();

        assertEquals(firstInstance, secondInstance);
    }
}
