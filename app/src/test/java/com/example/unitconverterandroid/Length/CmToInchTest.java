package com.example.unitconverterandroid.Length;

import static org.junit.Assert.*;

public class CmToInchTest {

    @org.junit.Test
    public void convert() {
        CmToInch test = CmToInch.getInstance(10);
        assertEquals(3.937007874015748, test.convert(), 0.0000001);
    }

}