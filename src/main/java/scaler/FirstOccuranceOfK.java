package scaler;

public class FirstOccuranceOfK{
	static int min=Integer.MAX_VALUE;
	public static void main(String[] args) {
		int[] A ={1,3,5,7,8,9,10,11,14,15,15,15,15,15,15,15,15,15,15,15,15,15,17,18,19,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,};
		int k = 15;
		BinarySearch(A,k);
		System.out.println(min);
	}

	public static void BinarySearch (int[] A, int k){
		BS(A,k,0,A.length-1);
	}

	public static void BS(int[] A, int k, int left ,int right){
		if(left<=right){
			int mid = (left+right)/2;

			if(A[mid]==k){
					 min = Math.min(min,mid);
					 BS(A,k,left,mid-1);
					}

			else if(A[mid]>k)
				 BS(A,k,left,mid-1);

			 BS(A,k,mid+1,right);
		}
	}
}