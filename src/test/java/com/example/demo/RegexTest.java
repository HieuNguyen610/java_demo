package com.example.demo;

import com.example.demo.service.RegexUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class RegexTest {

    public static final Object[] getString() {
        return new Object[] {
            new Object[] {"abc 12", new ArrayList<>()},  // Empty list for no numbers
            new Object[] {"cdefg 345 12bb23", new ArrayList<>(Arrays.asList(345))},  // List with one number
            new Object[] {"cdefg 345 12bbb33 678tt",  new ArrayList<>(Arrays.asList(345, 678))} ,// List with multiple numbers
            new Object[] {"abc 1234a12345", new ArrayList<>(Arrays.asList(1234, 12345))},
            new Object[] {"abc 000", new ArrayList<>(Arrays.asList(000))}
        };
    }

    @Test
    @Parameters(method = "getString")
    public void regexTest(String stringValue, List<Integer> expectedOutput) {
        Assert.assertEquals(RegexUtils.validateRegex(stringValue), expectedOutput);
    }
}
