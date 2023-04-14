package scaler.array;

public class TotalInversionCount {
    static int conut = 0;

    public static void main(String[] args) {
        int A[] = {2, 3, 0, 1};
        getInvertedCount(A);
        System.out.println(conut);
    }

    private static void getInvertedCount(int[] A) {
        MS(A, 0, A.length - 1);
    }

    private static void MS(int[] A, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            MS(A, left, mid);
            MS(A, mid + 1, right);
            merge(A, left, mid, right);
        }
    }

    private static void merge(int[] A, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] A1 = new int[n1];
        int[] A2 = new int[n2];

        for (int i = 0; i < n1; i++) {
            A1[i] = A[left + i];
        }
        for (int j = 0; j < n2; j++) {
            A2[j] = A[mid + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (A1[i] <= A2[j]) {
                A[k] = A1[i];
                i++;
            } else {
                conut += (n1 - i);
                A[k] = A2[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            A[k] = A1[i];
            i++;
            k++;
        }
        while (j < n2) {
            A[k] = A2[j];
            j++;
            k++;
        }
    }
}