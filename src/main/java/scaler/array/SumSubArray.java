package scaler.array;

public class SumSubArray {
    public static void main(String[] args) {
        int[] A = {3, -2, 6};
        getSubArraySum(A);
        System.out.println();
        getOptimizedSubArraySum(A);
    }

    private static void getSubArraySum(int[] A) {
        int n = A.length;
        for (int s = 0; s < n; s++) {
            for (int e = s; e < n; e++) {
                int sum = 0;
                for (int k = s; k <= e; k++) {
                    sum += A[k];
                }
                System.out.println(sum);
            }
        }
    }

    private static void getOptimizedSubArraySum(int[] A) {
        int n = A.length;
        int[] PS = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += A[i];
            PS[i] = sum;
        }

        for (int s = 0; s < n; s++) {
            for (int e = s; e < n; e++) {
                if (s == 0) System.out.println(PS[e]);
                else System.out.println(PS[e] - PS[s - 1]);
            }
        }
    }
}