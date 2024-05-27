package com.example.unitconverterandroid.Length;

import static org.junit.Assert.*;

public class MeterToFeetTest {

    @org.junit.Test
    public void convert() {
        MeterToFeet test = MeterToFeet.getInstance(1);
        assertEquals(3.28084, test.convert(), 0.0000001);

        MeterToFeet test2 = MeterToFeet.getInstance(5);
        assertEquals(16.4042, test2.convert(), 0.0000001);
    }

}