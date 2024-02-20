package com.example.demo;

import com.example.demo.service.JunitTestCaseExample;
import org.junit.Assert;
import org.junit.Test;

public class JunitExampleTest {

    JunitTestCaseExample obj = new JunitTestCaseExample();

    @Test
    public void testSizeObjectShouldBeRight() {
        obj.add("Emma");
        obj.add("J");
        Assert.assertEquals("Expect student's size to be 2", 2, obj.sizeOfStudent());
    }

    @Test
    public void testRemoveFunction() {
        obj.add("Emma");
        obj.add("J");
        obj.remove("AB");
        Assert.assertEquals("Expected obj's size to be 2", 2, obj.sizeOfStudent());
    }

    @Test
    public void testRemoveAllFunction() {
        obj.add("Emma");
        obj.add("J");
        obj.removeAll();
        Assert.assertEquals("Expected obj's size to be 0", 0, obj.sizeOfStudent());
    }


}
