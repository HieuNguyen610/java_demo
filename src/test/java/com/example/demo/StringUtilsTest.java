package com.example.demo;

import com.example.demo.service.StringUtils;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
@Slf4j
public class StringUtilsTest {

    private static final Object[] getString() {
        return new Object[] {
            new Object[] {"USD"}
        };
    }

    private static final Object[] getEmptyString() {
        return new Object[] {
            new Object[] {null}
        };
    }

    private static final Object[] getBlankString() {
        return new Object[] {
            new Object[] {""}
        };
    }

    @Test
    @Parameters(method = "getString")
    public void testReserveString(String testString) {
        Assert.assertEquals("DSU", StringUtils.reverse(testString));
    }

    @Test(expected = IllegalArgumentException.class)
    @Parameters(method = "getEmptyString")
    public void testReserveEmptyString(String emptyString) {
        Assert.assertNull(StringUtils.reverse(emptyString));
    }

    @Test
    @Parameters(method = "getBlankString")
    public void testReserveBlankString(String blankString) {
        Assert.assertEquals("", StringUtils.reverse(blankString));
    }
}
