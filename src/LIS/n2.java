package LIS;
import java.util.*;
public class n2 {
	static int LISusingLCS(Vector<Integer> seq)
	{
	    int n = seq.size();
	 
	    // Create an 2D array of integer
	    // for tabulation
	    int L[][] = new int [n + 1][n + 1];
	 
	    // Take the second sequence as the sorted
	    // sequence of the given sequence
	    Vector<Integer> sortedseq = new Vector<Integer>(seq);
	 
	    Collections.sort(sortedseq);
	    System.out.print(sortedseq);
	    // Classical Dynamic Programming algorithm
	    // for Longest Common Subsequence
	    for (int i = 0; i <= n; i++)
	    {
	        for (int j = 0; j <= n; j++)
	        {
	            if (i == 0 || j == 0)
	            {    L[i][j] = 0;
	            System.out.print(seq.get(j)+"\n");
	            }
	            else if (seq.get(i - 1) == sortedseq.get(j - 1))
	            {  L[i][j] = L[i - 1][j - 1] + 1;
	            System.out.print( seq.get(j)+"\n");
	            }
	 
	            else
	                {L[i][j] = Math.max(L[i - 1][j],
	                                   L[i][j - 1]);
	                System.out.print( seq.get(j)+"\n");
	        }  
	            } System.out.println("\n");
	    }
	 
	    // Return the ans
	    return L[n][n];
	}
	 
	// Driver code
	public static void main(String args[])
	{
	    Vector<Integer> sequence = new Vector<Integer>();
	    sequence.add(1);
	    sequence.add(10);
	    sequence.add(5);
	    sequence.add(20);
	    sequence.add(15);
	    sequence.add(12);
	    sequence.add(30);
	    sequence.add(49);
	    sequence.add(25);
	    sequence.add(35);
	    sequence.add(66);
	    sequence.add(75);
	    sequence.add(44);
	 
	    System.out.println(LISusingLCS(sequence));
	}
}
