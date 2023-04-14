package com.ds.Java.collections;

import java.util.HashMap;

public class CountPairsEqualsToK {
    public static void main(String[] args) {
        int A[] = {2, 5, 1, 5, 2, 7, 6, 10, 6, 6};
        int k = 12;
        HashMap<Integer, Integer> map = new HashMap();

        for (int a : A)
            map.merge(a, 1, Integer::sum);

        int count = 0;

        for (int a : A) {
            int x = k - a;
            if (a != x) {
                if (map.containsKey(a) && map.containsKey(x)) {
                    Integer a1 = map.get(a);
                    Integer a2 = map.get(x);
                    count += a1 * a2;
                    map.remove(a);
                    map.remove(x);
                }
            } else if (a == x && map.containsKey(a)) {
                Integer a1 = map.get(a);
                count += (a1 * (a1 - 1) / 2);
                map.remove(a);
            }
        }

        System.out.println(count);
    }
}
