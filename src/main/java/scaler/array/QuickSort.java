package scaler.array;

public class QuickSort {
    public static void main(String[] args) {
        int A[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 100};

        quickSort(A, 0, A.length - 1);
        for (int a : A)
            System.out.print(a + " ");
    }

    private static void quickSort(int[] A, int left, int right) {
        if (left < right) {
            int p = partition(A, left, right);
            quickSort(A, left, p - 1);
            quickSort(A, p + 1, right);
        }
    }

    private static int partition(int[] A, int left, int right) {

        int pivot = A[right];
        int i = left - 1;

        for (int j = left; j <= right; j++) {
            if (A[j] <= pivot) {
                i++;
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
        return i;
    }
}
