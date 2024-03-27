package scaler;

import java.util.*;

class allPosiibleSubSets{
	static List<List<Integer>> gList = new ArrayList();
	public static void main(String[] args) {
		int[] A = {1,2,3};
		printAllPossibleSubsets(A,new ArrayList(),A.length,0);
		System.out.println(gList);
	}

	static void printAllPossibleSubsets(int[] A, List<Integer> list ,int n ,int i){	
		if(i==n){
			gList.add(list);
			return;
		}
		
		List<Integer> al = new ArrayList();
		al.addAll(list);
		al.add(A[i]);
		printAllPossibleSubsets(A,al,n,i+1);
		printAllPossibleSubsets(A,list,n,i+1);

	}
}