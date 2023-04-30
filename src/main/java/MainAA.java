import java.util.Arrays;
import java.util.Comparator;

public class MainAA {
    public static void main(String[] args) {
        String[] A = {"0","0"};
        Arrays.sort(A, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.parseInt(o1 + o2) - Integer.parseInt(o2 + o1);
            }
        });

        String ans = "";

        for (int i = A.length - 1; i >= 0; i--)
            ans += A[i];

        System.out.println(String.valueOf(Integer.parseInt(ans)));
    }
}
