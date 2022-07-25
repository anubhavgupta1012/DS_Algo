package com.ds.arrays.questions;

import java.util.ArrayList;

public class StockBuyAndSell {
    public static void main(String[] args) {
        int A[] = {100, 180, 260, 310, 40, 535, 695};
        System.out.println(findStockBuyAndSell(A));
    }

    private static ArrayList<ArrayList<Integer>> findStockBuyAndSell(int[] A) {
        ArrayList arrayList = new ArrayList();

        int y = 0;
        int x = 0;
        for (int i = 1; i < A.length; i++) {

            if (A[i - 1] < A[i])
                x = i;
            else if (A[i - 1] > A[i] && x != y) {
                ArrayList<Integer> first = new ArrayList<>();
                first.add(y);
                first.add(x);
                arrayList.add(first);
                x = y = i;
            } else if (A[i - 1] >= A[i] && x == y) {
                x = y = i;
            }

        }

        if (x != y) {
            ArrayList<Integer> first = new ArrayList<>();
            first.add(y);
            first.add(x);
            arrayList.add(first);
        }
        return arrayList;
    }
}
