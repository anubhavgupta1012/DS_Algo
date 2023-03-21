package scaler.array;

/*
You are given an array of integers of N size.
You have to find that there is any subsequence exists or not whose sum is equal to B.

A=[1,20,13,4,5]
B=18
ans =1;

A=[2,2,2,2]
B=5
ans =0;
*/
public class SubSequenceSumEqualTOB {
    public int solve(int[] A, int B) {
        int n = A.length;
        int x = 1 << n;
        int ans = 0;

        for (int i = 0; i < x; i++) {
            int sum = 0;

            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) sum += A[j];
            }

            if (sum == B) {
                ans = 1;
                break;
            }
        }

        return ans;
    }
}
