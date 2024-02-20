package com.example.demo.thread.extend_thread;

public class MultiThreadDemo extends Thread{

    public void run() {
        try {
            System.out.println("Thread " + Thread.currentThread().getId() + " is running");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Thread " + Thread.currentThread().getId() + " is finished");
        }
    }

}

