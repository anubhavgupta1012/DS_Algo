package com.ds.arrays.questions;

import java.util.Stack;

public class StockSpanOptimised {
    public static void main(String[] args) {
        int A[] = {100, 80, 60, 70, 60, 75, 85};

        int[] stockSpan = findStockSpan(A);
        for (int a : stockSpan) {
            System.out.print(a + " ");
        }
    }

    private static int[] findStockSpan(int[] A) {
        int[] result = new int[A.length];
        result[0] = 1;

        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for (int i = 1; i < A.length; i++) {

            while (!stack.empty() && A[i] >= A[stack.peek()])
                stack.pop();

            if (stack.empty()) {
                result[i] = i + 1;
                stack.push(i);
            } else {
                result[i] = i - stack.peek();
                stack.push(i);
            }
        }

        return result;
    }
}
