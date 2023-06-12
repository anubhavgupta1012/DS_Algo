import java.util.HashSet;

public class TestMMM {

    public static void main(String[] args) {

        System.out.println(MatchingCharacters("ghececgkaem"));
    }

    public static int MatchingCharacters(String str) {

        int n = str.length();
        int ans = 0;
        HashSet<Character> set = new HashSet<Character>();

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (str.charAt(i) == str.charAt(j) && j != n - 1) {
                    ans = Math.max(ans, set.size());
                    set = new HashSet<>();
                } else {
                    set.add(str.charAt(j));
                }
            }
        }

        String s = "".split("-")[0];
        return ans;

    }
}
