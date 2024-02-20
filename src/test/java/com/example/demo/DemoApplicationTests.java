package com.example.demo;

import com.example.demo.service.MainService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    MainService mainService;

    @Test
    void contextLoads() {
    }

    @Test
    void checkDoubleMethod() {
        Assert.assertEquals(2, mainService.doubleMethod(1));
        Assert.assertEquals(0, mainService.doubleMethod(0));
    }



}
