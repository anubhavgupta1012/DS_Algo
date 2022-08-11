package com.ds.StriverSDESheet.Array;

public class PascalsTriangle {
    public static void main(String[] args) {
        int n = 10;

        generatePascalsTriangle(n);
    }

    private static void generatePascalsTriangle(int n) {
        int[][] A = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int k = n - 1; k > i; k--)
                System.out.print(" ");
            for (int j = 0; j <= i; j++) {
                if (j == 0 || (i == j)) {
                    System.out.print(" 1 ");
                    A[i][j] = 1;
                } else {
                    int i1 = A[i - 1][j - 1] + A[i - 1][j];
                    A[i][j] = i1;
                    System.out.print(" " + i1);
                }
            }
            System.out.println();
        }
       /* List<List<Integer>> arrayList = new ArrayList();
        for (int i = 0; i < A.length; i++) {
            ArrayList<Integer> objects = new ArrayList<>();

            for (int j = 0; j < A[i].length; j++) {
                if (A[i][j] != 0)
                    objects.add(A[i][j]);
            }
            arrayList.add(objects);
        }*/


    }
}
