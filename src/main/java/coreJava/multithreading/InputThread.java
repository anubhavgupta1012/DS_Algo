package coreJava.multithreading;

import java.util.Scanner;

public class InputThread extends Thread {
    int[] data = new int[10];

    public InputThread(String name) {
        super(name);
        this.start();
        this.setDaemon(true);
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("In Input Thread");
        System.out.println("Enter 5 values");
        for (int i = 0; i < 5; i++)
            data[i] = sc.nextInt();
    }

    public int[] getData() {
        return data;
    }
}

class JoinTest {
    public static void main(String S[]) {
        System.out.println("Main started");
        InputThread ip = new InputThread("Input thread");
        try {
            System.out.println("Main is going to join The thread");
            // ip.join();
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int s = 0;
        int data[] = ip.getData();
        for (int i = 0; i < data.length; i++)
            s += data[i];
        System.out.println("Sum is " + s);
    }
}