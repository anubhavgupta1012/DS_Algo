import java.util.*;

public class test {
    public static void main(String[] args) {


        String s = "qoqok,,,SJNSJN";
        System.out.println(isAlphanumeric2(s));


    }

    public static boolean isAlphanumeric2(String text) {
        return text.matches(".*[A-Za-z].*") && text.matches(".*[0-9].*") && text.matches("[A-Za-z0-9]*");

    }

}


class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = 0;

        if (a < b) x = a;
        else x = b;

        int aa = 1;

        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                aa *= i;
            }
        }
        System.out.print(a * b / aa);
    }
}

class Main2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int sum = 0;
        for (int i = str.length() - 1, j = 0; i >= 0; i--, j++) {
            int numericValue = Character.getNumericValue(str.charAt(i));
            sum += numericValue * Math.pow(2, j);
        }

        System.out.print(sum);

    }
}

class Solution {
    public int solve(ArrayList<Integer> A) {

        HashMap<Integer, Integer> map = new HashMap();

        for (int a : A) {
            if (map.containsKey(a)) {
                Integer integer = map.get(a);
                integer++;
                map.put(a, integer);
            } else {
                map.put(a, 1);
            }
        }

        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();

        Integer i = null;
        for (Map.Entry<Integer, Integer> e : entries) {
            if (e.getValue() == 1) {
                i = e.getKey();
                break;
            }
        }
        return i;
    }
}

