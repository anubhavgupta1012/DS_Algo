package scaler.array;

public class ArrayReverse {

    static int[] reverse(int[] A) {

        for (int i = 0; i < A.length / 2; i++) {
            int temp = A[i];
            A[i] = A[A.length - 1 - i];
            A[A.length - 1 - i] = temp;

        }
        return A;
    }

    public static void main(String[] args) {
        int[] A = {1, 23, 45, 5, 7, 3,33};
        reverse(A);
        for (int i : A) {
            System.out.print(i + " ");
        }

    }
}
