package com.ds.arrays.questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class FindingDuplicate {
    public static void main(String[] args) {
        int A[] = {13, 9, 25, 1, 1, 0, 22, 13, 22, 20, 3, 8, 11, 25, 10, 3, 15, 11, 19, 20, 2, 4, 25, 14, 23, 14};
        System.out.println(findDuplicate(A, A.length));
    }

    private static List<Integer> findDuplicate(int[] A, int length) {
        ArrayList<Integer> integers = new ArrayList<>();
        Map<Integer, Integer> map = new TreeMap<>();

        for (int i = 0; i < A.length; i++) {
            map.merge(A[i], 1, Integer::sum);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet())
            if (entry.getValue() > 1)
                integers.add(entry.getKey());

        if (integers.size() == 0)
            integers.add(-1);

        return integers;
    }
}
