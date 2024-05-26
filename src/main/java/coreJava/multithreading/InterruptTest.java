package coreJava.multithreading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class InterruptTest {
    static int[] a = new int[10];

    public static void main(String S[]) throws IOException {
        System.out.println("main started");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        SumThread th = new SumThread();
        th.start();
        System.out.println("Enter 10 Values...");

        for (int i = 0; i < 10; i++)
            a[i] = Integer.parseInt(br.readLine());

        th.interrupt();
        System.out.println("main is going to finish");
    }


    static int[] getData() {
        return (a);
    }
}

class SumThread extends Thread {
    public void run() {
        String name = getName();
        System.out.println(name + " thread Started");
        try {
            System.out.println(" Moving in the waiting state");
            sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Calculating sum....");
        int sum = 0;
        int[] a = InterruptTest.getData();
        for (int i = 0; i < a.length; i++)
            sum += a[i];
        System.out.println("Sum is: " + sum);
    }
}