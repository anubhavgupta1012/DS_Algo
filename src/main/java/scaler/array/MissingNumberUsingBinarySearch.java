package scaler.array;

public class MissingNumberUsingBinarySearch {
    public static void main(String[] args) {
        int[] A = {1, 1, 3, 3, 5, 5, 6, 6, 7, 7, 10, 10, 11, 11, 12, 12, 13};
        int index = findIndex(A);
        System.out.println(index);
        System.out.println(A[index]);
    }

    private static int findIndex(int[] A) {
        int ans = -1;
        int n = A.length - 1;
        int left = 0;
        int right = n;

        if (A[0] != A[1]) {
            return 0;
        } else if (A[n] != A[n - 1]) {
            return n;
        }

        while (left <= right) {
            int mid = (left + right) / 2;

            if (A[mid] != A[mid - 1] && A[mid] != A[mid + 1]) {
                ans = mid;
                break;
            } else if (mid % 2 != 0) {
                if (A[mid] == A[mid - 1]) {
                    left = mid + 1;
                } else if (A[mid] == A[mid + 1]) {
                    right = mid - 1;
                }
            } else {
                if (A[mid] == A[mid - 1]) {
                    right = mid - 1;
                } else if (A[mid] == A[mid + 1]) {
                    left = mid + 1;
                }
            }
        }

        return ans;
    }
}
