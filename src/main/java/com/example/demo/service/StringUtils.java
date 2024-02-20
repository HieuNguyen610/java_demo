package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

public class StringUtils {
    public static String reverse(String s) {
        if (s == null) {
            throw new IllegalArgumentException();
        }

        List<String> tempArray = new ArrayList<>(s.length());
        for (int i = 0; i < s.length(); i++) {
            tempArray.add(s.substring(i, i+1));
        }
        StringBuilder reversedString = new StringBuilder(s.length());
        for (int i = tempArray.size() -1; i >= 0; i--) {
            reversedString.append(tempArray.get(i));
        }
        return reversedString.toString();
    }
}
