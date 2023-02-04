package com.ds.arrays.questions;

import java.util.*;

public class MatrixMultiplication {
    public int[][] solve(int[][] A, int[][] B) {

        int a = A.length;
        int b = A[0].length;
        int c = B[0].length;

        int[][] C = new int[a][c];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < c; j++) {
                int sum = 0;
                for (int k = 0; k < b; k++) {
                    sum += A[i][k] * B[k][j];
                }
                C[i][j] = sum;
            }
        }
        return C;
    }

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("A", 1);
        map.put("B", 2);
        System.out.println(map.get("C"));

    }

    public HashMap<Integer, Integer> getFrequency(int[] A) {
        HashMap<Integer, Integer> hashMap = new HashMap();

        for (int i = 0; i < A.length; i++) {
            hashMap.merge(A[i], 1, Integer::sum);
        }

        Set<Map.Entry<Integer, Integer>> entries = hashMap.entrySet();
        for (Map.Entry e:entries){
            if (e.getValue().equals(1))
                System.out.println(e.getKey());
        }
        return hashMap;
    }
}
