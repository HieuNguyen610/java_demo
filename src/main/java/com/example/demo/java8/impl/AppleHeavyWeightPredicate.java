package com.example.demo.java8.impl;

import com.example.demo.java8.Apple;
import com.example.demo.java8.interfaces.ApplePredicate;

public class AppleHeavyWeightPredicate implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > 150;
    }

    public boolean test2(Apple apple) {
        return apple.getWeight() < 100;
    }
}
