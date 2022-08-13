package com.ds.coreJava.multithreading.communication.notifyAll;

class NotifyAllTest {
    public static void main(String S[]) {
        Resource r = new Resource();
        new MyThread(r, "user1");
        new MyThread(r, "user2");
        new MyThread(r, "user3");
        new MyThread(r, "user4");
        new MyThread(r, "admin");
    }
}

class MyThread extends Thread {
    Resource r;

    MyThread(Resource r, String nm) {
        super(nm);
        this.r = r;
        start();
    }

    public void run() {
        String name = getName();
        if (name.equals("admin")) {
            r.keyGen();
        } else {
            r.logIn();
        }
    }
}

class Resource {
    boolean b;
    int key;

    void logIn() {
        String nm = Thread.currentThread().getName();
        System.out.println(nm + " Thread is started login");
        synchronized (this) {
            try {
                if (!b) {
                    System.out.println(nm + " is going into waiting section...");
                    wait();
                }
                System.out.println(nm + " gets logged in with  " + key + " key");
            } catch (Exception e) {
            }
        }
    }

    synchronized void keyGen() {
        System.out.println("admin logged in");
        key = (int) (Math.random() * 100);
        System.out.println(key + " key Generated");
        b = true;
        notifyAll();
    }
}