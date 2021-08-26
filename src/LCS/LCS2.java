package LCS;

import java.util.Scanner;

public class LCS2 {

	 public static String traceBack(int C[][], String X, String Y, int i, int j) {
	        if (i == 0 || j == 0) return "";
	        else if (X.charAt(i-1) == Y.charAt(j-1)) {
	            return traceBack(C, X, Y, i - 1, j - 1) + X.charAt(i);
	        }

	        if (C[i][j - 1] >= C[i - 1][j]) {
	            return traceBack(C, X, Y, i, j - 1);
	        }

	        return traceBack(C, X, Y, i - 1, j);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String str1=input.next();
		String str2=input.next();
		String[] s1=str1.split("");
		String[] s2=str2.split("");
		int a = s1.length;
		int b = s2.length;
		int[][] dp=new int[s1.length+1][s2.length+1];
		
		for(int i=1;i<s1.length+1;i++){
			for(int j=1;j<s2.length+1;j++){
				if(s1[i-1].equals(s2[j-1]))
					dp[i][j]=dp[i-1][j-1]+1;
				else
					dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
			}
		}
		traceBack(dp,str1,str2,s1.length,s2.length);
		System.out.println(dp[s1.length][s2.length]);
		
		
	}
	

}
