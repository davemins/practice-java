package third;

import java.util.Scanner;

public class Main {
	
	static double Hundred = 100.0;

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		double[][] array = new double[5][2];
		
		for(int i = 0; i < 5; i++)
		{
			System.out.print("키와 체중을 입력하시오. : ");
			array[i][0] = scan.nextDouble();
			array[i][1] = scan.nextDouble();
		}
		
		System.out.println();
		
		int l, m, n;
		
		l = 0;
		m = 0;
		n = 0;

		for(int i = 0; i < 5; i++) 
		{
		if ((array[i][1] / 1.19) + Hundred <= array[i][0] && array[i][0] <= (array[i][1] / 1.0) + Hundred)
		{
			l += 1;
		}
		else if ((array[i][1] / 0.99) + Hundred <= array[i][0] && array[i][0] <= (array[i][1] / 0.8) + Hundred)
		{
			m += 1;
		}
		else if ((array[i][1] / 0.79) + Hundred <= array[i][0] && array[i][0] <= (array[i][1] / 0.60) + Hundred)
		{
			n += 1;
		}
		}
		

	    System.out.print("저체중(" + n + "명)   |");
	    for (int i = 0; i < n; i++) {
	      System.out.print("*");
	    }
	    System.out.print("\n");
	    
	    System.out.print("표준 체중(" + m + "명)|");
	    for (int i = 0; i < m; i++) {
	      System.out.print("*");
	    }
	    System.out.print("\n");
	    
	    System.out.print("과체중(" + l + "명)   |");
	    for (int i = 0; i < l; i++) {
	      System.out.print("*");
	    }
	    System.out.print("\n");
		
	}

}
