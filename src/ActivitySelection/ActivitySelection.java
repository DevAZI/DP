package ActivitySelection;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
 
public class ActivitySelection {
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		
		
		/*
		  time[][0] �� ���۽����� �ǹ� 
		  time[][1] �� ��������� �ǹ� 
		*/
		int[][] time = new int[N][3];
		int[][] tempTime = new int[N][2];
		
		for(int i = 0; i < N; i++) {
			time[i][2]=in.nextInt();
			time[i][0] = in.nextInt();	// ���۽ð� 
			time[i][1] = in.nextInt();	// ����ð� 
			
		}
		
		
		// ������ �ð��� �������� �����ϱ� ���� compare ������ 
		Arrays.sort(time, new Comparator<int[]>() {			
			@Override
			public int compare(int[] o1, int[] o2) {
				
				// ����ð��� ���� ��� ���۽ð��� ���������� �����ؾ��Ѵ�.  
				if(o1[1] == o2[1]) {
					return o1[0] - o2[0];
				}
			
				return o1[1] - o2[1];
			}
 
		});
		//System.out.println(Arrays.toString(time));
		 for (int i = 0; i < time.length; i++) {
		      System.out.println();
		      for (int j = 0; j < time[i].length; j++) {
		      //  System.out.print(time[i][j] + " ");
		      }
		    }
		
		
		int count = 0;
		int prev_end_time = 0;
		
		for(int i = 0; i < N; i++) {
			
			// ���� ����ð��� ���� ȸ�� ���� �ð����� �۰ų� ���ٸ� ���� 
			if(prev_end_time +10<= time[i][0]) {
				prev_end_time = time[i][1];
				System.out.println(time[i][2]+": "+time[i][0]+","+time[i][1]);
				count++;
			}
		}
		
		System.out.println("�ִ뿵ȭ����"+count);
	}
 
}