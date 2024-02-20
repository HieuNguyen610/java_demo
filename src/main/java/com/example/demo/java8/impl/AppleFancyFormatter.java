package com.example.demo.java8.impl;

import com.example.demo.java8.Apple;
import com.example.demo.java8.interfaces.AppleFormatter;

public class AppleFancyFormatter implements AppleFormatter {

    @Override
    public String accept(Apple apple) {
        String character = apple.getWeight() > 150 ? "heavy" : "light";
        return "A " + character + " " + apple.getColor() + " apple." ;
    }
}
