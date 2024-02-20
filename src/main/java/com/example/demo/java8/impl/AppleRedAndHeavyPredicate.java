package com.example.demo.java8.impl;

import com.example.demo.java8.Apple;
import com.example.demo.java8.interfaces.ApplePredicate;

public class AppleRedAndHeavyPredicate implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
        return (apple.getWeight() > 150 && "red".equalsIgnoreCase(apple.getColor()));
    }
}
