package scaler;

class Print1s2sOptimised{
	
public static void main(String[] args) {
	int n = 3;
	int[] ans = new int[n];
	print1s2sOptimised(n,0,ans);	
	}	


static void print1s2sOptimised(int n,int i, int[] ans){

	if(i==n){
		for(int j=0;j<n;j++)
			System.out.print(ans[j]);


		System.out.print("\t");
		return;
	}
	
	ans[i] = 1;
	print1s2sOptimised(n,i+1,ans);

	ans[i] = 2;
	print1s2sOptimised(n,i+1,ans);
 	}
}