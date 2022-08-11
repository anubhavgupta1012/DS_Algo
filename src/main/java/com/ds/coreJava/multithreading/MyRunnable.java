package com.ds.coreJava.multithreading;

class MyRunnable implements Runnable {
    public void run() {
        Thread th = Thread.currentThread();
        String Str = th.getName();
        System.out.println(Str + " thread Started");

        for (int i = 0; i < 11; i++) {
            System.out.println(th.getName());
        }
        System.out.println("MyRunnable is about to finish");

    }
}

class ThreadTest2 {
    public static void main(String[] s) {
        System.out.println("Main started");
        MyRunnable r = new MyRunnable();
        Thread t = new Thread(r);
        t.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Main");
        }
        System.out.println("Main is about to finish");
    }
}