package scaler.array;

public class SubArray {
    public static void main(String[] args) {
        int[] A = {22, 43, 53, 11, 87};

        int n = A.length;

        for (int s = 0; s < n; s++) {
            for (int e = s; e < n; e++) {
                for (int k = s; k <= e; k++) {
                    System.out.print(A[k] + " ");
                }
                System.out.println();
            }
        }
    }
}
