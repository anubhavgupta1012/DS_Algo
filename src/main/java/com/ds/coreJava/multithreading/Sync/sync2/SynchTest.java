package com.ds.coreJava.multithreading.Sync.sync2;

class SynchTest {
    public static void main(String S[]) {
        Resource r = new Resource();
        new MyThread("first", r);
        new MyThread("second", r);
    }
}

class MyThread extends Thread {
    Resource r;

    MyThread(String name, Resource r) {
        super(name);
        this.r = r;
        start();
    }
    public void run() {
        synchronized (r) {
            String nm = getName();
            if (nm.equals("first"))
                r.Update();
            if (nm.equals("second"))
                r.Display();
        }
    }
}

class Resource {
    int data[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    void Update() {
        System.out.println("I m in update");
        for (int i = 0; i <= 9; i++) {
            data[i] += 10;
            System.out.println("Updated value:" + data[i]);
        }
    }

    void Display() {
        System.out.println("I am in Display");
        for (int i = 9; i >= 0; i--) {
            System.out.println("Values :" + data[i]);
        }
    }
}