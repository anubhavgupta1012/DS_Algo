package com.ds.arrays.questions;

public class DoubleStacksIn1Array {

    public static void main(String[] args) {

        TwoStack.push1(2);
        TwoStack.push1(3);
        TwoStack.push2(4);
        System.out.println(TwoStack.pop1());
        System.out.println(TwoStack.pop2());
        System.out.println(TwoStack.pop2());
    }
}

class TwoStack {
    static Integer[] A = new Integer[1000];
    static Integer top1;
    static Integer top2;

    static void push1(int x) {
        if (top1 == null) {
            A[1] = x;
            top1 = 1;
        } else {
            top1 += 2;
            A[top1] = x;
        }

    }

    static void push2(int x) {
        if (top2 == null) {
            A[0] = x;
            top2 = 0;
        } else {
            top2 += 2;
            A[top2] = x;
        }

    }

    static Integer pop1() {
        if (top1 < 1) {
            return -1;
        }
        Integer integer = A[top1];
        A[top1] = null;
        top1 -= 2;
        return integer;

    }

    static int pop2() {
        if (top2 < 0) {
            return -1;
        }
        Integer integer = A[top2];
        A[top2] = null;
        top2 -= 2;
        return integer;
    }

}
