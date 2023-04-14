package com.ds.Java.collections;

import java.util.HashMap;

public class SubArraySumEqualsTo0 {
    public static void main(String[] args) {
        int A[] = {-1, 2, -1};
        int n = A.length;
        long[] PS = new long[n];

        HashMap<Long, Integer> map = new HashMap();
        long sum = 0;

        for (int i = 0; i < n; i++) {
            sum += A[i];
            PS[i] = sum;
        }

        for (long a : PS)
            map.merge(a, 1, Integer::sum);

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (PS[i] == 0) {
                count++;
            }
            if (map.containsKey(PS[i])) {
                int x = map.get(PS[i]);
                count += x * (x - 1) / 2;
                map.remove(PS[i]);
            }
        }
        System.out.println(count);
    }
}
