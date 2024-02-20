package com.example.demo.java8;

import com.example.demo.java8.impl.AppleFancyFormatter;
import com.example.demo.java8.impl.AppleGreenColorPredicate;
import com.example.demo.java8.impl.AppleHeavyWeightPredicate;
import com.example.demo.java8.impl.AppleRedAndHeavyPredicate;
import com.example.demo.java8.interfaces.AppleFormatter;
import com.example.demo.java8.interfaces.ApplePredicate;
import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FilterJavaTest {

    List<Apple> apples;
    Apple apple;

    @Before
    public void setup() {
        apples = Arrays.asList(new Apple("green", 100), new Apple("red", 200));
        apple = new Apple("green", 100);
    }

    @Test
    public void numberOfGreenShouldBeZero() {
        Assert.assertEquals(0, FilterJava.filterGreen(Arrays.asList("red")).size());
    }

    @Test
    public void numberOfGreenShouldBeOne() {
        Assert.assertEquals(1, FilterJava.filterGreen(Arrays.asList("green")).size());
    }

    @Test
    public void testUpperCaseGreen() {
        Assert.assertEquals(1, FilterJava.filterGreen(Arrays.asList("GREEN")).size());
    }

    @Test
    public void testCamelCase() {
        Assert.assertEquals(1, FilterJava.filterGreen(Arrays.asList("Green")).size());
    }

    @Test
    public void numberOfGreenShouldBeTwo() {
        Assert.assertEquals(2, FilterJava.filterGreen(Arrays.asList("green", "GREEN", "Red")).size());
    }

    @Test
    public void numberOfRedShouldBeOne() {
        Assert.assertEquals(1, FilterJava.filterAppleColor(Arrays.asList("red", "green"), "red").size());
    }

    @Test
    public void numberOfREDShouldBeOne() {
        Assert.assertEquals(1, FilterJava.filterAppleColor(Arrays.asList("ReD", "green"), "RED").size());
    }

    @Test
    public void filterByPredicate() {
        Assert.assertEquals(1, FilterJava.filterApple(apples, new AppleHeavyWeightPredicate()).size());
    }

    @Test
    public void testFilterByColorPredicate() {
        Assert.assertEquals(1, FilterJava.filterApple(apples, new AppleGreenColorPredicate()).size());
    }

    @Test
    public void testFilterByColorAndWeightPredicate() {
        Assert.assertEquals(1, FilterJava.filterApple(apples, new AppleRedAndHeavyPredicate()).size());
    }

    @Test
    public void testAppleFormatter() {
        Assert.assertEquals("A light green apple.", FilterJava.formatApple(apple, new AppleFancyFormatter()));
    }

    @Test
    public void filterRedAppleByPredicate() {
        Assert.assertEquals(1, FilterJava.filterApple(apples, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return "red".equalsIgnoreCase(apple.getColor());
            }
        }).size());
    }


}
