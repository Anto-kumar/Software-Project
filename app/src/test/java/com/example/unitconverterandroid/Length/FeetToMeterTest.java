package com.example.unitconverterandroid.Length;

import static org.junit.Assert.*;

public class FeetToMeterTest {

    @org.junit.Test
    public void convert() {
        FeetToMeter test = FeetToMeter.getInstance(10);
        assertEquals(3.048, test.convert(), 0.0000001);
    }

}