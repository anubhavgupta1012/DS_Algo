package com.ds.patterns;

import java.util.Scanner;

public class Pyramid {

    public static void main(String[] args) {
        int n = 6;

        for (int i = 1; i <= n; i++) {
            for (int k = n; k > i; k--)
                System.out.print(" ");
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 1;
        while (t-- > 0) {
            //int a = sc.nextInt();
            int a = 1234;
            boolean first = true;
            int r = 0;
            while (first || a / 10 >=1) {

                if (first) {
                    r = a % 10;
                    first = false;
                }
                a = a / 10;
            }
            System.out.print(a + " " + r);
        }
    }
}
