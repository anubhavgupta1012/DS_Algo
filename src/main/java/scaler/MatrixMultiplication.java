package scaler;

class MatrixMultiplication{
	public static void main(String[] args) {
			int[] A = {3,5,7,4};
			System.out.print(getMinCost(A,1,A.length-1));
		}	

	static int getMinCost(int[] A, int i,int j){
			
			if(i==j)
				return 0;
			

			int ans = Integer.MAX_VALUE;
			for(int k=i;k<j;k++){
				int l =getMinCost(A,i,k);
				int r =getMinCost(A,k+1,j);
				ans =  Math.min(ans,l+r + A[i-1]*A[k]*A[j]);
			}
			return ans;
		}
}