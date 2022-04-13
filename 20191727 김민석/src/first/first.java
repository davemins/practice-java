package first;

import java.util.Scanner;

public class first {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("키와 체중을 입력하시오. ");
		double at = scan.nextDouble();
		double aw = scan.nextDouble();
 		
 		System.out.print("키와 체중을 입력하시오. ");
 		double bt = scan.nextDouble();
 		double bw = scan.nextDouble();		
		
 		System.out.print("키와 체중을 입력하시오. ");
 		double ct = scan.nextDouble();
 		double cw = scan.nextDouble();

 		System.out.print("키와 체중을 입력하시오. ");
 		double dt = scan.nextDouble();
 		double dw = scan.nextDouble();
 		
 		System.out.print("키와 체중을 입력하시오. ");
 		double et = scan.nextDouble();
		double ew = scan.nextDouble();

	    System.out.print("\n");
 		
 		
 		int l, m, n;
 		
		l = 0;
		m = 0;
		n = 0;

		if ((aw / 1.19) + 100 <= at && at <= (aw / 1.0) + 100)
		{
			l += 1;
		}
		else if ((aw / 0.99) + 100 <= at && at <= (aw / 0.8) + 100)
		{
			m += 1;
		}
		else if ((aw / 0.79) + 100 <= at && at <= (aw / 0.60) + 100)
		{
			n += 1;
		}
		
		
		
		if ((bw / 1.19) + 100 <= bt && bt <= (bw / 1.0) + 100)
		{
			l += 1;
		}
		else if ((bw / 0.99) + 100 <= bt && bt <= (bw / 0.8) + 100)
		{
			m += 1;
		}
		else if ((bw / 0.79) + 100 <= bt && bt <= (bw / 0.60) + 100)
		{
			n += 1;
		}
		
		
		
		if ((cw / 1.19) + 100 <= ct && ct <= (cw / 1.0) + 100)
		{
			l += 1;
		}
		else if ((cw / 0.99) + 100 <= ct && ct <= (cw / 0.8) + 100)
		{
			m += 1;
		}
		else if ((cw / 0.79) + 100 <= ct && ct <= (cw / 0.60) + 100)
		{
			n += 1;
		}

		
		
		if ((dw / 1.19) + 100 <= dt && dt <= (dw / 1.0) + 100)
		{
			l += 1;
		}
		else if ((dw / 0.99) + 100 <= dt && dt <= (dw / 0.8) + 100)
		{
			m += 1;
		}
		else if ((dw / 0.79) + 100 <= dt && dt <= (dw / 0.60) + 100)
		{
			n += 1;
		}
		
		
		
		if ((ew / 1.19) + 100 <= et && et <= (ew / 1.0) + 100)
		{
			l += 1;
		}
		else if ((ew / 0.99) + 100 <= et && et <= (ew / 0.8) + 100)
		{
			m += 1;
		}
		else if ((ew / 0.79) + 100 <= et && et <= (ew / 0.60) + 100)
		{
			n += 1;
		}

		
//		저체중(2명) n    | **
//
//		표준 체중(2명) n | **
//
//		과체중(1명)    l | *
		
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
