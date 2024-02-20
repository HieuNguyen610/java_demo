package com.example.demo.java8.impl;

import com.example.demo.java8.Apple;
import com.example.demo.java8.interfaces.ApplePredicate;

public class AppleGreenColorPredicate implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
        return "green".equalsIgnoreCase(apple.getColor());
    }
}
