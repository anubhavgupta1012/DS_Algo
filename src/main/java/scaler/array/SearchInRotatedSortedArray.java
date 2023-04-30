package scaler.array;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] A = {40, 50, 60, 70, 80, 10, 20, 30};

        int index = findIndex(A, 30);
        System.out.println(index);
    }

    private static int findIndex(int[] A, int k) {

        int ans = -1;
        int n = A.length;

        int left = 0;
        int right = n - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (A[mid] == k) {
                ans = mid;
                break;
            } else if (A[left] < A[mid]) {
                // left to mid is sorted
                if (A[left] <= k && k < A[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                // mid  to right is sorted
                if (A[mid] < k && k <= A[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return ans;
    }
}
