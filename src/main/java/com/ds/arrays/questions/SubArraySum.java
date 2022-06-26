package com.ds.arrays.questions;

import java.util.ArrayList;
import java.util.List;

public class SubArraySum {
    public static void main(String[] args) {
        int A[] = {1, 2, 3, 7, 5};
        int x = 12;
        List<Integer> integers = new ArrayList<Integer>();
        int sum = 0;
        int j = 0;
        boolean once = false;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
            while (sum >= x) {
                if (sum == x) {
                    integers.add(j + 1);
                    integers.add(i + 1);
                    once = true;
                    break;
                }
                if (sum > x) {
                    sum = sum - A[j++];
                }
            }
            if (once)
                break;
        }
        if (integers.isEmpty())
            integers.add(-1);

        System.out.println(integers);
    }
}