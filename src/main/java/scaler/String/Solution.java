package scaler.String;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("qw");
        strings.add("skms");
        strings.add("sms");
        strings.add("dok");
        strings.add("wq");
        strings.add("ok");
        ArrayList<ArrayList<Integer>> anagrams = anagrams(strings);
        System.out.println(anagrams);

    }

    public static ArrayList<ArrayList<Integer>> anagrams(final List<String> Q) {

        int nn = Q.size();
        String[] A = new String[nn];
        int x = 0;
        for (String str : Q) {
            A[x++] = str;
        }


        int n = A.length;
        ArrayList<ArrayList<Integer>> ll = new ArrayList();


        if (nn == 1) {
            ArrayList<Integer> ls = new ArrayList();
            ls.add(1);
            ll.add(ls);
            return ll;
        }

        for (int i = 0; i < n - 1; i++) {

            String str1 = A[i];
            ArrayList<Integer> l = new ArrayList();
            if (str1 != "$D")
                l.add(i + 1);


            for (int j = i + 1; j < n; j++) {
                if (A[j] == "$D") continue;

                String st2 = A[j];
                if (str1.length() == st2.length() && checkAnagram(str1, st2)) {
                    l.add(j + 1);
                    A[j] = "$D";
                } else if (i == n - 2 && j == n - 1) {
                    ArrayList<Integer> ls = new ArrayList();
                    ls.add(j + 1);
                    ll.add(ls);
                    break;
                }
            }
            if (l.size() > 0)
                ll.add(l);

        }
        return ll;
    }


    public static boolean checkAnagram(String A, String B) {

        if (A.equalsIgnoreCase("$D") || B.equalsIgnoreCase("$D"))
            return false;

        int x[] = new int[26];

        for (int i = 0; i < B.length(); i++) {
            x[B.charAt(i) - 97]++;
        }

        for (int i = 0; i < A.length(); i++) {
            x[A.charAt(i) - 97]--;
        }

        boolean isAnagram = true;

        for (int i : x) {
            if (i != 0) {
                isAnagram = false;
                break;
            }
        }
        return isAnagram;
    }
}

