package scaler.twoPointerArray;

public class PairSum {
    /*
    * Given a sorted array of integers (not necessarily distinct) A and an integer B,
    * find and return how many pair of integers ( A[i], A[j] ) such that i != j have sum equal to B.
    *A = [1, 1, 1]
       B = 2
      OUTPUT ==> 3
    * */
    public static void main(String[] args) {
        int[] A = {1, 2, 6, 6, 7, 9, 9};
        System.out.println(getCountsOfPairs(A, 13));
    }

    static int getCountsOfPairs(int[] A, int k) {
        int ans = 0;
        int i = 0;
        int j = A.length - 1;
        int counti = 0;
        int countj = 0;
        while (i < j) {
            int sum = A[i] + A[j];
            if (sum == k) {
                /*ans += ;*/

                if (A[j] == A[j - 1]) {
                    countj++;
                    j--;
                } else if (A[i] == A[i + 1]) {
                    counti++;
                    i++;
                } else {
                    counti = 0;
                    countj = 0;
                    j--;
                }

            } else if (sum > k) j--;
            else i++;
        }

        return ans;
    }
}
