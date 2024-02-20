package com.example.demo.geeks;

import org.junit.Assert;
import org.junit.Test;

public class GameWithStringTest {

    @Test
    public void testRemoveStringWithSingleLength() {
        Assert.assertEquals(0, GameWithString.minValue("a", 1));
    }

    @Test
    public void testRemoveStringWithLength2() {
        Assert.assertEquals(1, GameWithString.minValue("aa", 1));
    }

    @Test
    public void testStringWithTwoCharacter() {
        Assert.assertEquals(4, GameWithString.minValue("aaa", 1));
    }

    @Test
    public void testStringWithAB() {
        Assert.assertEquals(2, GameWithString.minValue("aba", 1));
    }

    @Test
    public void test6() {
        Assert.assertEquals(6, GameWithString.minValue("abccc", 1));
    }

    @Test
    public void test7() {
        Assert.assertEquals(27, GameWithString.minValue("aabcbcbcabcc", 3));
    }

    @Test
    public void test8() {
        Assert.assertEquals(3, GameWithString.minValue("ccbcbd", 3));
    }
}
