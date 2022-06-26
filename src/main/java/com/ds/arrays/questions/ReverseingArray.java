package com.ds.arrays.questions;

import java.util.Scanner;

public class ReverseingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        String[] str = new String[t];
        for (int i = 0; i < t; i++) {

            int[] A = new int[sc.nextInt()];

            for (int j = 0; j < A.length; j++) {
                A[j] = sc.nextInt();
            }

            for (int k = 0; k < A.length / 2; k++) {
                int temp = A[k];
                A[k] = A[A.length - 1 - k];
                A[A.length - 1 - k] = temp;

            }

            String c = "";
            for (int j = 0; j < A.length; j++)
                c = c + A[j] + " ";

            str[i] = c;
        }

        for (String s : str) {
            System.out.println(s);
        }
    }
}