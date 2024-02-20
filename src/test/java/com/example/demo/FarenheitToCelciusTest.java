package com.example.demo;

import static org.junit.Assert.assertEquals;

import com.example.demo.service.FahrenheitCelciusConverter;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class FarenheitToCelciusTest {

    private static final Object[] getCelcius() {
        return new Object[] {
            new Object[] {0},
            new Object[] {37},
            new Object[] {100}
        };
    }

    @Test
    @Parameters(method = "getCelcius")
    public void shouldConvertCelciusToFah(int value) {
        int fah = (int) (( value * 1.8 ) + 32);
        assertEquals(fah, FahrenheitCelciusConverter.toFahrenheit(value));
    }

    @Test
    public void shouldConvertCelciusToFahrenheit() {
        assertEquals(32, FahrenheitCelciusConverter.toFahrenheit(0));
        assertEquals(98, FahrenheitCelciusConverter.toFahrenheit(37));
        assertEquals(212, FahrenheitCelciusConverter.toFahrenheit(100));
    }
    @Test
    public void shouldConvertFahrenheitToCelcius() {
        assertEquals(0, FahrenheitCelciusConverter.toCelcius(32));
        assertEquals(37, FahrenheitCelciusConverter.toCelcius(100));
        assertEquals(100, FahrenheitCelciusConverter.toCelcius(212));
    }

}
