package com.example.demo.thread.runnable;

public class MultiThreadDemo implements Runnable{

    @Override
    public void run() {
        try {
            System.out.println("Thread " + Thread.currentThread().getId() + " is running");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
