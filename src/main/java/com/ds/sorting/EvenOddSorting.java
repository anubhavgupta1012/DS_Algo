package com.ds.sorting;

import java.util.Arrays;
import java.util.Comparator;

public class EvenOddSorting {
    public static void main(String[] args) {
        //Integer[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        Integer[] A = {9, 10, 11, 12, 13, 14, 1, 2, 3, 4, 5, 6, 7, 8};


        Comparator<Integer> comparator = new Comparator<>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                if (i1 % 2 == 0 && i2 % 2 == 0)
                    return i1 - i2;
                else if (i1 % 2 != 0 && i2 % 2 == 0)
                    return 1;
                else if (i1 % 2 == 0)
                    return -1;
                if (i1 % 2 != 0)
                    return i1 - i2;
                else return 0;
            }
        };
        Arrays.sort(A, comparator);


        for (int a : A)
            System.out.print(a + " ");
    }
}
