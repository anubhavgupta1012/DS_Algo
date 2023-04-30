package scaler.array;

import java.util.Arrays;
import java.util.HashSet;

public class AggresiveCows {
    public static void main(String[] args) {

        int[] A = {82, 61, 38, 88, 12, 7, 6, 12, 48, 8, 31, 90, 35, 5, 88, 2, 66, 19, 5, 96, 84, 95};
        System.out.println(solve(A, 8));
    }

    public static int solve(int[] A, int B) {

        HashSet<Integer> set = new HashSet();
        for (int i = 0; i < A.length; i++) {
            set.add(A[i]);
        }

        A = new int[set.size()];
        int x = 0;
        for (int a : set) {
            A[x++] = a;
        }
        Arrays.sort(A);

        int n = A.length;
        int left = getMin(A);
        int right = A[n - 1] - A[0];
        int ans = left;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (check(A, mid, B)) {
                ans = mid;
                left = mid + 1;
            } else right = mid - 1;
        }
        return ans;
    }

    public static boolean check(int[] A, int mid, int B) {
        int c = 1;
        int last = A[0];

        int n = A.length;
        for (int i = 1; i < n; i++) {

            if (A[i] - last >= mid) {
                last = A[i];
                c++;
            }
            if (/*(c >= B && i < n - 1) ||*/ (c < B && i >= n - 1)) {
                return false;
            }
        }
        return true;
    }

    public static int getMin(int[] A) {
        int min = A[1] - A[0];

        for (int i = 0; i < A.length - 1; i++) {
            min = Math.min(min, A[i + 1] - A[i]);
        }

        return min;
    }
}
