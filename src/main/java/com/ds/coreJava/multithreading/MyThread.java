package com.ds.coreJava.multithreading;

class MyThread extends Thread {
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " Thread Started");
        for (int i = 0; i < 11; i++)
            System.out.println(name + " :" + i);
        System.out.println(name + "Thread is about to finish");
    }
}

class ThreadTest3 {
    public static void main(String[] s) {
        System.out.println("Main started");

        MyThread t = new MyThread();
        t.start();

        String name = Thread.currentThread().getName();
        for (int i = 0; i < 10; i++)
            System.out.println(name);
        System.out.println("Main is about to finish");
    }
}