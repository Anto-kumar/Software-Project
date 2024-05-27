package com.example.unitconverterandroid.Length;

import static org.junit.Assert.*;

public class MeterToCmTest {

    @org.junit.Test
    public void convert() {
        MeterToCm test = MeterToCm.getInstance(10);
        assertEquals(1000, test.convert(), 0.0000001);
    }

}