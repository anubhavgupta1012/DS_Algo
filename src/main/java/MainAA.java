import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainAA {
    public static void main(String[] args) {
     /*   String[] A = {"0", "0"};
        Arrays.sort(A, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.parseInt(o1 + o2) - Integer.parseInt(o2 + o1);
            }
        });

        String ans = "";

        for (int i = A.length - 1; i >= 0; i--)
            ans += A[i];

        System.out.println(String.valueOf(Integer.parseInt(ans)));*/


        Map<Integer, String> map1 = Map.of(1, "a", 2, "c");
        Map<Integer, String> map2 = Map.of(1, "b", 3, "d");

        List<Map.Entry<Integer, String>> collect = Arrays.asList(map1, map2).
                stream().flatMap(i -> i.entrySet().stream()).collect(Collectors.toList());

        System.out.println(collect);

    }
}
