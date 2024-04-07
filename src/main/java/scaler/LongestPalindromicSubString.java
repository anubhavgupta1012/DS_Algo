/*
package scaler;

class LongestPalindromicSubString{

	public static void main(String[] args) {
		String str ="forgeeksskeegfor";
		System.out.println(findLPS(str,0,str.length()-1));

	}

	static String findLPS(String str, int i, int j){
		if (i>j)
			return "";
		else if(i==j)
			return new StringBuilder().append(str.charAt(i));
		

		if(str.charAt(i) == str.charAt(j)){
			return findLPS(str,i+1,j-1);
		}else{
			return Math.max(findLPS(str,i+1,j),findLPS(str,i,j-1));
		}
	}
}*/
