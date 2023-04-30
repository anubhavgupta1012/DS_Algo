package scaler.String;

public class longestPalindromicString {
    public String longestPalindrome(String A) {

        int n = A.length();
        int ans = 1;
        String anss = "";

        for (int i = 0; i < n - 1; i++) {
            int p1 = i;
            int p2 = i + 1;

            String temp = checkPalindrom(A, p1, p2);
            if (!temp.equals("")) {
                anss = temp.length() > anss.length() ? temp : anss;
            }
        }


        for (int i = 1; i < n - 1; i++) {
            int p1 = i - 1;
            int p2 = i + 1;

            String temp = checkPalindrom(A, p1, p2);
            if (!temp.equals("")) {
                anss = temp.length() > anss.length() ? temp : anss;
            }
        }

        return anss;

    }

    String checkPalindrom(String str, int p1, int p2) {

        while (p1 >= 0 && p2 <= str.length() - 1 && str.charAt(p1) == str.charAt(p2)) {
            p1--;
            p2++;
        }
        p1++;
        return str.substring(p1, p2);
    }
}
