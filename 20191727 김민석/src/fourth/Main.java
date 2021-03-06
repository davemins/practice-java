package fourth;

import java.util.Scanner;

public class Main {
	//정적 변수를 활용
	static double Hundred = 100.0;
	
	static Scanner scan = new Scanner(System.in);
	
	public static Person[] input(Person[] people) //객체 배열을 매개변수로 전달받는 메소드
	{
		for(int i = 0; i < 5; i++) //for문을 이용하여 5명의 키와 체중 입력
		{
			System.out.print("키와 체중을 입력하시오. : ");
			double var_height, var_weight;
			var_height = scan.nextDouble();
			var_weight = scan.nextDouble();
			people[i] = new Person(var_height, var_weight);
		}
		return people;
	}
	
	public static void main(String[] args) {
		
		Person [] persons = new Person[5]; //객체 배열을 생성
		
		input(persons); //메소드를 이용하여 5명의 키와 체중 입력 
		
		int l, m, n; // 저체중/표준 체중/과체중의 누적수를 저장하는 변수 l, m, n 선언
		
		l = 0;
		m = 0;
		n = 0;
		
		for(int i = 0; i < 5; i++) //for문으로 저체중/표준 체중/과체중을 판단하여 변수 l, m, n의 값을 증가시킴
		{
			
			if ((persons[i].getWeight() / 1.19) + Hundred <= persons[i].getHeight() && persons[i].getHeight() <= (persons[i].getWeight() / 1.0) + Hundred)
		{
			l += 1; //과체중
		}
		else if ((persons[i].getWeight() / 0.99) + Hundred <= persons[i].getHeight() && persons[i].getHeight() <= (persons[i].getWeight() / 0.8) + Hundred)
		{
			m += 1; //표준 체중
		}
		else if ((persons[i].getWeight() / 0.79) + Hundred <= persons[i].getHeight() && persons[i].getHeight() <= (persons[i].getWeight() / 0.60) + Hundred)
		{
			n += 1; //저체중
		}
			
		}
		
		//저체중/표준 체중/과체중의 누적수를 *로 출력
	    System.out.print("저체중(" + n + "명)   |");
	    for (int i = 0; i < n; i++) {
	      System.out.print("*");
	    }
	    System.out.print("\n");
	    
	    System.out.print("표준 체중(" + m + "명) |");
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
