package scaler.array;

public class PartitionElementInQuickSort {
    public static void main(String[] args) {
        int[] A = {8, 9, 3, 1, 5, 6, 10, 7};

        getPartitionedArray(A);
        for (int a : A)
            System.out.print(a + " ");
    }

    private static void getPartitionedArray(int[] A) {
        int n = A.length;

        int i = -1;
        int pivot = A[n - 1];
        for (int j = 0; j < n; j++) {
            if (A[j] <= pivot) {
                i++;
                int temp = A[j];
                A[j] = A[i];
                A[i] = temp;
            }
        }
    }
}
