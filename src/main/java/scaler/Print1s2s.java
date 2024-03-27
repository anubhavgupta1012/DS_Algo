package scaler;

class Print1s2s{
	public static void main(String[] args) {
		int n = 6;
		print1(n,1,"1");
		print1(n,1,"2");
	}


	static void print1(int n,int i,String s1){

		if(i==n){
			System.out.print(s1+" ");
			return;
		}
		print1(n,i+1,s1+"1");
		print1(n,i+1,s1+"2");
	}
}


