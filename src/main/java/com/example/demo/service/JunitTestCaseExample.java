package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
public class JunitTestCaseExample {
    private List<String> students = new ArrayList<>();

    public void remove(String name) {
        students.remove(name);
    }

    public void add(String name) {
        students.add(name);
    }

    public void removeAll(){
        students.clear();
    }

    public int sizeOfStudent() {
        return students.size();
    }

}