package com.ds;

import java.util.Objects;

public class test {
    public static void main(String[] args) {
        Integer i = 0;
        System.out.println(i != null && !Objects.equals(i, 0));
        System.out.println(i != null && i != 0);
    }
}
