package com.example.demo;


import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HashMapTest {

    Map<String, String> hashMap;

    @Before
    public void setUp() {
        hashMap = new HashMap<>();
    }

    @Test
    public void objectStoreWithPut() {
        hashMap.put("harry", "nguyen");
        Assert.assertEquals(1, hashMap.size());
    }

    @Test
    public void objectStoreWithPutCanBeRetrievePut() {
        hashMap.put("fish", "sakana");
        Assert.assertEquals("sakana", hashMap.get("fish"));
    }

    @Test
    public void addSecondObjectWithSameKeyResultOldValueReplaced() {
        hashMap.put("fish", "sakana");
        hashMap.put("fish", "tuna");
        Assert.assertEquals("tuna", hashMap.get("fish"));
    }

    /**
     * test clear method
     */
    @Test
    public void clearMethodRemoveAllContent() {
        hashMap.put("fish", "tuna");
        hashMap.put("cat", "tiger");
        hashMap.clear();
        Assert.assertEquals(0, hashMap.size());
    }

    @Test
    public void nullValueAsKey() {
        hashMap.put(null, "null");
        Assert.assertEquals("null", hashMap.get(null));
    }
}
