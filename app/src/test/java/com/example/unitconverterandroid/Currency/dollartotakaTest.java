package com.example.unitconverterandroid.Currency;

import static org.junit.Assert.*;

public class dollartotakaTest {

    @org.junit.Test
    public void convert() {
        CurrencyConverter dollartotaka = CurrencyConverterFactory.getConverter("dollartotaka", 1);
        assertEquals(84.5, dollartotaka.convert(), 0.0);

        CurrencyConverter dollartotaka2 = CurrencyConverterFactory.getConverter("dollartotaka", 2);
        assertEquals(169.0, dollartotaka2.convert(), 0.0);
    }

}