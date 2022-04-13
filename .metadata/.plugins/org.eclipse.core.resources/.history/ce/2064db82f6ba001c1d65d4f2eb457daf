package second;

import java.util.Scanner;

public class second {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);					

    int[] scores = new int[5];								//성적을 입력할 배열 선언
    for (int i = 0; i < 5; i++) {							//for문 통해서 5명의 성적을 입력
      System.out.println("성적을 입력하시오.");
      int score = scan.nextInt();
      scores[i] = score;  
    }
    int sum = 0;											//총합 변수 선언
    float avg = 0f;											//평균 변수 선언
    
    for (int i = 0; i < scores.length; i++) {				//for문으로 총합 계산
      sum += scores[i];
    }
    
    avg = sum / (float)scores.length;						//총합을 배열의 크기로 나누어 평균 계산
    
    int a, b, c, d, f, under;								//평점별 사람 수 계산을 위한 변수 선언
    a = 0;
    b = 0;
    c = 0;
    d = 0;
    f = 0;
    under = 0;
    
    for (int i = 0; i < 5; i++) {							//for문으로 평균보다 미만인 사람의 수 계산
      if (scores[i] < avg) {
        under += 1;
      }
    }

    for (int i = 0; i < 5; i++) {							//for문으로 평점별 누적 계산
      if ((scores[i] <= 100) && (scores[i] >= 90)) {
        a += 1;
      }
      else if ((scores[i] <= 89) && (scores[i] >= 80)) {
        b += 1;
      }
      else if ((scores[i] <= 79) && (scores[i] >= 70)) {
        c += 1;
      }
      else if ((scores[i] <= 69) && (scores[i] >= 60)) {
        d += 1;
      }
      else {
        f += 1;
      }   
    }
    
    System.out.println("평균 미만 학생 수는 " + under + "명이고 성적 분포는 아래와 같습니다.");				//성적 분포 출력
    
    System.out.print("A(" + a + "명)|");
    for (int i = 0; i < a; i++) {
      System.out.print("*");
    }
    System.out.println("");
    
    System.out.print("B(" + b + "명)|");
    for (int i = 0; i < b; i++) {
      System.out.print("*");
    }
    System.out.println("");
    
    System.out.print("C(" + c + "명)|");
    for (int i = 0; i < c; i++) {
      System.out.print("*");
    }
    System.out.println("");
    
    System.out.print("D(" + d + "명)|");
    for (int i = 0; i < d; i++) {
      System.out.print("*");
    }
    System.out.println("");
    
    System.out.print("F(" + f + "명)|");
    for (int i = 0; i < f; i++) {
      System.out.print("*");
    }
    System.out.println("");

    System.out.println("-------------------------");
    System.out.print("총합" + scores.length + "명");				//총합 출력
    System.out.println("(평균" + avg + "점)");					//평균 출력
  }
}