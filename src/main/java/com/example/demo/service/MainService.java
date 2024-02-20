package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class MainService {
    public int doubleMethod(int input) {
        return input * 2;
    }
}
