package com.ds.Java.collections;

import java.util.HashMap;

public class SubArraySumEqualsToK {
    public static void main(String[] args) {
        int[] A = {-2, 2, 0, 2, 2};
        int k = 4;
        System.out.println(solve(A, k));
    }


    public static int solve(int[] A, int k) {

        int n = A.length;
        int[] PS = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += A[i];
            PS[i] = sum;
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        int count = 0;

        for (int a : PS) {
            int x = a - k;

            if (a == k) {
                count++;
            }
            if (map.containsKey(x)) {
                count += map.get(x);
            }
            map.merge(a, 1, Integer::sum);
        }
        return count;
    }
}
