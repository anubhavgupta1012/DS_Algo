package com.ds.coreJava.multithreading.communication;

public class PrintABC {

    public static void main(String[] args) {
        Resources r = new Resources();
        new MyPrintableThread("A", r);
        new MyPrintableThread("B", r);
        new MyPrintableThread("C", r);
    }
}

class MyPrintableThread extends Thread {
    Resources r;
    int x = 1;

    public MyPrintableThread(String name, Resources r) {
        super(name);
        this.r = r;
        start();
    }

    public void run() {
        for (int i = 1; i <= 100; i++) {
            r.print(Thread.currentThread().getName());

        }
    }

}

class Resources {

    public synchronized void print(String name) {
        System.out.println(name);

    }

    /*public synchronized void printB() {
        System.out.println(Thread.currentThread().getName());
    }

    public synchronized void printC() {
        System.out.println(Thread.currentThread().getName());
    }*/
}