package com.mycompany.testproject;

public class TestProject {
    public static void main(String[] args) {

        int x = 1;

        RunnableThreads runnable1 = new RunnableThreads("Thread 1");
        RunnableThreads runnable2 = new RunnableThreads("Thread 2");

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread exiting.");
    }

}

class RunnableThreads implements Runnable {
    private final String message;

    public RunnableThreads(String message) {
        this.message = message;
    }

    @Override
    synchronized public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(message + " " + i);
        }
    }

}

// 183015128 Rakibul Islam