package com.example.demo.geeks;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

public class SubArraySumTest {

    @Test
    public void test1() {
        Assert.assertEquals(Arrays.asList(2, 4), SubArraySum.subarraySum(new int[]{1, 2, 3, 7, 5}, 5, 12));
    }
}
