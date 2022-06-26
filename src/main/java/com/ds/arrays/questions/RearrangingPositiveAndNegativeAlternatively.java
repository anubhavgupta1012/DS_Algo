package com.ds.arrays.questions;

import java.util.ArrayList;
import java.util.List;

public class RearrangingPositiveAndNegativeAlternatively {
    public static void main(String[] args) {
        int A[] = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};

        rearrangingPositiveAndNegativeAlternatively(A);

        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }

    private static void rearrangingPositiveAndNegativeAlternatively(int[] A) {
        List<Integer> B = new ArrayList<>();
        List<Integer> C = new ArrayList<>();

        for (int a : A) {
            if (a >= 0) B.add(a);
            else C.add(a);
        }

        int x = 0;
        int y = 0;
        int z = 0;
        while (!(x >= B.size()) && !(y >= C.size())) {
            A[z] = B.get(x);
            z++;
            x++;

            A[z] = C.get(y);
            y++;
            z++;
        }

        while (!(x >= B.size())) {
            A[z] = B.get(x);
            z++;
            x++;

        }
        while (!(y >= C.size())) {
            A[z] = C.get(y);
            y++;
            z++;

        }

    }

}
