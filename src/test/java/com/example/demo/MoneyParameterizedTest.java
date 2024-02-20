package com.example.demo;

import static org.junit.Assert.assertEquals;

import com.example.demo.service.Money;
import java.net.MalformedURLException;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.BeforeClass;

@Slf4j
@RunWith(JUnitParamsRunner.class)
public class MoneyParameterizedTest {

    private static Logger LOGGER = null;

    @BeforeClass
    public static void setLogger() throws MalformedURLException
    {
        System.setProperty("log4j.configurationFile","log4j2-testConfig.xml");
        LOGGER = LogManager.getLogger();
    }

    private static final Object[] getMoney() {
        return new Object[] {
            new Object[] {10, "USD"},
            new Object[] {20, "EUR"},
            new Object[] {30, "VND"},
            new Object[] {40, null}
        };
    }

    @Test
    @Parameters(method = "getMoney")
    public void constructorShouldSetAmountAndCurrency(int amount, String currency) {

        log.info("Testing constructor with amount={} and currency={}", amount, currency);
        Money money = new Money(amount, currency);
        assertEquals(amount, money.getAmount());
        assertEquals(currency, money.getCurrency());
    }
}
