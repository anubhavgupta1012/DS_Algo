package scaler;

public class  NQueens{
	public static void main(String[] args) {
		int n = 4;
		int[][] ans = new int[n][n];
		fill1s(ans,n,0);
	}

	static void fill1s(int[][] ans, int n, int i){

		if(i==n){
			//print the board
			for(int i1 =0;i1<n;i1++){
				for(int j1=0;j1<n;j1++){
					System.out.print(ans[i1][j1]+" ");
				}
				System.out.println();
			}
			System.out.println();
			return;
		}

		for(int j=0;j<n;j++){
			ans[i][j] = 1;
			if(isAllowedToPlace1(ans,i,j)){
				fill1s(ans,n,i+1);
			}
			ans[i][j]=0;
		}
	}


	static boolean isAllowedToPlace1(int[][] ans, int i,int j){
		int i1 = i-1;
		int j1 = j-1;

		for(;i1>=0&&j1>=0;i1--,j1--){
			if(ans[i1][j1]==1){
				return false;
			}
		}

		 i1 = i-1;
		 j1 = j;

		for(;i1>=0;i1--){
			if(ans[i1][j1]==1){
				return false;
			}
		}

		 i1 = i-1;
		 j1 = j+1;

		for(;i1>=0&&j1<ans.length;i1--,j1++){
			if(ans[i1][j1]==1){
				return false;
			}
		}

		return true;
	}
}