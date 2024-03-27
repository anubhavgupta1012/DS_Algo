package scaler;

public class BinarySearch{
	public static void main(String[] args) {
		int[] A ={1,3,5,7,8,9,10,11,14,15,17,18,19,20};
		int k = 20;
		System.out.println(BinarySearch(A,k));
	}

	public static int BinarySearch (int[] A, int k){
		return BS(A,k,0,A.length-1);
	}

	public static int BS(int[] A, int k, int left ,int right){
		if(left<=right){
			int mid = (left+right)/2;

			if(A[mid]==k)
					return mid;

			else if(A[mid]>k)
				return BS(A,k,left,mid-1);

			return BS(A,k,mid+1,right);
		}
		return -1;
	}
}