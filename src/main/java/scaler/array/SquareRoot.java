package scaler.array;

public class SquareRoot {
    public static void main(String[] args) {
        int n = 81;

        System.out.println(findSquareRoot(n));
    }

    private static int findSquareRoot(int n) {
        int ans = 0;
        int left = 0;
        int right = n / 2;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (mid * mid > n) {
                right = mid - 1;
            } else {
                ans = mid;
                left = mid + 1;
            }
        }
        return ans;
    }
}
