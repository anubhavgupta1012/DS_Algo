package scaler;

public class IterativeBinarySearch{
	public static void main(String[] args) {
		int[] A ={1,3,5,7,8,9,10,11,14,15,17,18,19,20};
		int k = 3;
		System.out.println(BinarySearch(A,k));
	}	

	public static int BinarySearch(int[] A, int k){
		int left =0;
		int right =A.length-1;

		while(left<=right){
			int mid = (left+right)/2;

			if(A[mid]==k){
				return mid;
			}else if(A[mid]>k){
				right = mid-1;
			}else{
				left = mid+1;
			}

		}
		return -1;

	}
}