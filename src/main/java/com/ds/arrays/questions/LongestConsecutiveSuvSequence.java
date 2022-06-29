package com.ds.arrays.questions;

import java.util.Map;
import java.util.TreeMap;

/*100 % Accuracy */
public class LongestConsecutiveSuvSequence {

    public static void main(String[] args) {
        int A[] = {1, 9, 3, 10, 4, 20, 2};

        System.out.println(findLongestConsecutiveSuvSequence(A));
    }

    private static int findLongestConsecutiveSuvSequence(int[] A) {
        int largest = 0;
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < A.length; i++)
            map.merge(A[i], 1, Integer::sum);

        int a = Integer.MIN_VALUE;
        int b = Integer.MIN_VALUE;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            if (a == Integer.MIN_VALUE || b + 1 != entry.getKey())
                a = entry.getKey();

            b = entry.getKey();

            if (largest < b - a + 1)
                largest = b - a + 1;
        }

        return largest;
    }
}
