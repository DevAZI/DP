package knapsackFractional;

public class continue_back {

	static int[] knapsack(int C, int w[], int  p[], int r[], int n)
	{
		int i = 0; 
		int w_now =0;
		while(i<n && w_now <C)
		{
			if(w_now+ w[i]  <= C)
			{
				r[i] = 1;
				w_now += w[i];
			}
			else
			{
				r[i] = (C - w_now ) / w[i];
				
			}
			i++;
		}
		for(int j = 0; j < r.length; j++)
		{
			System.out.println(r[j]);
		}
		return r;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int C = 30;
		int w[] = {10,5,20};
		int p[] = {60,50,140};
		int[] r = new int[3];
		int n = w.length;
		knapsack(C,w,p,r, n);
		
		
		
	}

}
