package com.example.demo.thread.extend_thread;

public class MultiThread {

    public static void main(String[] args) {
        int n = 8;
        for (int i = 0; i < n; i++) {
            MultiThreadDemo obj = new MultiThreadDemo();
            obj.start();
        }
    }
}
