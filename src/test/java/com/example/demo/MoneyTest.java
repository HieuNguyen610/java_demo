package com.example.demo;

import static org.junit.Assert.assertEquals;

import com.example.demo.service.Money;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

    @RunWith(JUnitParamsRunner.class)
    public class MoneyTest {
        private final static int VALID_AMOUNT = 5;
        private final static String VALID_CURRENCY = "USD";
        private static final Object[] getInvalidAmount() {
            return new Integer[][]{{-12387}, {-5}, {-1}};
        }
        private static final Object[] getInvalidCurrency() {
            return new String[][]{{null}, {""}};
        }

        @Test(expected = IllegalArgumentException.class)
        @Parameters(method = "getInvalidAmount")
        public void constructorShouldThrowIAEForInvalidAmount(int invalidAmount) {
            new Money(invalidAmount, VALID_CURRENCY);
        }

    @Test(expected = IllegalArgumentException.class)
    @Parameters(method = "getInvalidCurrency")
    public void constructorShouldThrowIAEForInvalidCurrency(String invalidCurrency) {
        new Money(VALID_AMOUNT, invalidCurrency);
    }

    @Test
    public void constructorShouldSetAmountAndCurrency() {
        Money money = new Money(10, "USD");
        assertEquals(10, money.getAmount());
        assertEquals("USD", money.getCurrency());
    }
}
