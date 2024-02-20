package com.example.demo;

import com.example.demo.service.PasswordValidator;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class PasswordValidatorTest {

    private static final Object[] getPasswords() {
        return new Object[] {
            new Object[] {"Password#123", true},
            new Object[] {"weak123", false},
            new Object[] {"123VND", false},
            new Object[] {"123456", false},
            new Object[] {"passworD#1235", true}
        };
    }

    @Test
    @Parameters(method = "getPasswords")
    public void shouldReturnValidOrInvalidPassword(String password, boolean expectedValidity) {
        Assert.assertEquals(expectedValidity, PasswordValidator.isPasswordValid(password));
    }

}
