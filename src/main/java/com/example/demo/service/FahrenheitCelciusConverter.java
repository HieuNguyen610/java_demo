package com.example.demo.service;

public class FahrenheitCelciusConverter {

    public static int toFahrenheit(int celcius) {
        return (int) (celcius * 1.8 + 32);
    }

    public static int toCelcius(int fahrenheit) {
        return (int) ((fahrenheit - 32)/1.8);
    }
}
