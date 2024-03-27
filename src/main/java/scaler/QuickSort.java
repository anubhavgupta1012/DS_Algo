package scaler;

public class QuickSort{
	public static void main(String[] args) {
		int[] A ={12,45,66,1,34,90,7,45,23};
		quickSort(A,0,A.length-1);

		for(int a:A){
			System.out.print(a+" ");
		}
	}

	public static void quickSort(int[] A, int  left, int right){
		if(left<right){
			int  p = getPartitionElement(A,left,right);
			quickSort(A,left,p-1);
			quickSort(A,p+1,right);
		}
	}

	public static int getPartitionElement(int[] A, int left, int right){

		int j = left-1;
		for(int i=left;i<=right;i++){
			if(A[i]<=A[right]){
				j++;
				int temp = A[j];
				A[j] = A[i];
				A[i] = temp;
			}
		}
		return j;
	}
	
}