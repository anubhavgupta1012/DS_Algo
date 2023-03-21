package scaler.array;

public class CarryForward1 {
    public static void main(String[] args) {
        int[] A = {5,-2,3,1,2};
        int B = 3;
        System.out.println(maxSumFromBothSides(A, B));
    }

    static int maxSumFromBothSides(int[] A, int B) {
        int n = A.length;
        int PS[] = new int[n];

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += A[i];
            PS[i] = sum;
        }
        int maxSum = PS[n - 1];
        int swl = n - B;
        int minInSWL = PS[swl - 1];

        for (int i = swl; i < n; i++) {
            int swSum = PS[i] - PS[i - swl];
            if (minInSWL > swSum)
                minInSWL = swSum;
        }
        return maxSum - minInSWL;
    }
}
