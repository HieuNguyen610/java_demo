package com.example.demo;

import com.example.demo.interfaces.Car;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class FirstMockitoTest {
//    stub creation via mock method
    private Car myFerrari = Mockito.mock(Car.class);



    @Test
    public void testIfCarIsCar() {
        Assert.assertTrue(myFerrari instanceof Car);
    }

    @Test
    public void testDefaultValueTestDouble() {
        Assert.assertFalse("default value of need fuel", myFerrari.needsFuel());
        Assert.assertEquals("default value of engine temperature", 0.0, myFerrari.getEngineTemperature(),  0);
    }
}
