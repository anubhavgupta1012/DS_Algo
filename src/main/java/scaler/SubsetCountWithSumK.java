package scaler;

class SubsetCountWithSumK{

	static int count = 0;
	public static void main(String[] args) {
	int[] A = {1 ,1, 1};
	int k = 2;
	computeCount(A,k,A.length,0,0);
	System.out.print(count+"\t");	
	}

	static void computeCount(int[] A, int k,int n,int i,int sum){

		if(sum==k){
			count++;
			return;
		}

		if(i==n)
			return;
		
		computeCount(A,k,n,i+1,sum);
		computeCount(A,k,n,i+1,sum+A[i]);
		
		
	}

}