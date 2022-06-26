package com.ds.arrays.questions;

import java.util.*;

public class InterSectionOf3Arrays {
    public static void main(String[] args) {
        int A[] = {-69, -68, -39, -25, -6, 18, 33, 39, 42, 46, 52, 55, 55, 64, 71};
        int B[] = {-97, -92, -90, -90, -87, -85, -82, -77, -77, -77, -75, -71, -67, -64, -60, -59, -58, -52, -49, -48, -48, -47, -47, -46, -41, -36, -35, -29, -28, -26, -25, -20, -19, -14, -13, -13, -11, -10, -6, -4, 2, 3, 9, 12, 15, 17, 20, 22, 23, 24, 27, 29, 36, 36, 37, 38, 39, 42, 45, 47, 48, 48, 50, 52, 52, 53, 57, 59, 60, 63, 63, 64, 64, 65, 68, 70, 71, 76, 76, 77, 83, 83, 84, 85, 86, 89, 97, 97};
        int C[] = {-95, -95, -86, -83, -70, -67, -57, -53, -52, -35, -33, -32, -30, -20, -16, -15, -15, -11, -10, -10, -4, 0, 4, 15, 18, 34, 36, 37, 39, 41, 43, 43, 48, 49, 50, 51, 58, 63, 64, 67, 69, 77, 79, 84, 84, 94, 95, 97};

        System.out.println(findIntersection(A, B, C, A.length, B.length, C.length));
    }

    private static ArrayList findIntersection(int[] A, int[] B, int[] C, int n1, int n2, int n3) {

        Map<Integer, Integer> map1 = new TreeMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        Map<Integer, Integer> map3 = new HashMap<>();
        int min = Math.min(n1, n2);
        min = Math.min(min, n3);

        Map<Integer, Integer> integers = new TreeMap<>();

        for (int i = 0; i < n1; i++)
            map1.merge(A[i], 1, Integer::sum);
        for (int i = 0; i < n2; i++)
            map2.merge(B[i], 1, Integer::sum);
        for (int i = 0; i < n3; i++)
            map3.merge(C[i], 1, Integer::sum);

        List<Integer> ints = new ArrayList<>();

        if (min == n1) for (int i = 0; i < A.length; i++)
            ints.add(A[i]);

        else if (min == n2) for (int i = 0; i < B.length; i++)
            ints.add(B[i]);

        else for (int i = 0; i < C.length; i++)
                ints.add(C[i]);

        for (int a : ints) {
            if (map1.containsKey(a) && map2.containsKey(a) && map3.containsKey(a)) integers.put(a, 1);
        }
        return new ArrayList(integers.keySet());
    }

}