package com.example.demo.java8;

import com.example.demo.java8.interfaces.AppleFormatter;
import com.example.demo.java8.interfaces.ApplePredicate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FilterJava {
    public static List<String> filterGreen(List<String> inventory) {
        List<String> result = new ArrayList<>();
        for (String apple : inventory) {
            if ("green".equalsIgnoreCase(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

    public static List<String> filterAppleColor(List<String> inventory, String color) {
        List<String> result = new ArrayList<>();

        for (String apple: inventory) {
            if (color.equalsIgnoreCase(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

    public static List<Apple> filterAppleByWeight(List<Apple> inventory, int weight) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple: inventory) {
            if (apple.getWeight() > weight) {
                result.add(apple);
            }
        }
        return result;
    }

//    filter by predicate : behavior parameterized
    public static List<Apple> filterApple(List<Apple> inventory, ApplePredicate predicate) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple: inventory) {
            if (predicate.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

    public static String formatApple(Apple apple, AppleFormatter formatter) {
        return formatter.accept(apple);
    }

    public static List<Apple> filterAppleLambda(List<Apple> apples) {
        return filterApple(apples, (Apple apple) -> "red".equalsIgnoreCase(apple.getColor()));
    }
}
