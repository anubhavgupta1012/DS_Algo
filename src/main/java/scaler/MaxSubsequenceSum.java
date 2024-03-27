package scaler;

class MaxSubsequenceSum{
	public static void main(String[] args) {
			int[] A = {1,2,3,-4,5};
			System.out.print(maxSumSubsequence(A,0,A.length));
		}	

		static int maxSumSubsequence(int[] A, int i, int n){
			if(i>=n){
				return 0;
			}
			return Math.max(A[i]+maxSumSubsequence(A,i+1,n),maxSumSubsequence(A,i+1,n));
		}
}