package second;

import java.util.Scanner;

public class second {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);					

    int[] scores = new int[5];								//������ �Է��� �迭 ����
    for (int i = 0; i < 5; i++) {							//for�� ���ؼ� 5���� ������ �Է�
      System.out.println("������ �Է��Ͻÿ�.");
      int score = scan.nextInt();
      scores[i] = score;  
    }
    int sum = 0;											//���� ���� ����
    float avg = 0f;											//��� ���� ����
    
    for (int i = 0; i < scores.length; i++) {				//for������ ���� ���
      sum += scores[i];
    }
    
    avg = sum / (float)scores.length;						//������ �迭�� ũ��� ������ ��� ���
    
    int a, b, c, d, f, under;								//������ ��� �� ����� ���� ���� ����
    a = 0;
    b = 0;
    c = 0;
    d = 0;
    f = 0;
    under = 0;
    
    for (int i = 0; i < 5; i++) {							//for������ ��պ��� �̸��� ����� �� ���
      if (scores[i] < avg) {
        under += 1;
      }
    }

    for (int i = 0; i < 5; i++) {							//for������ ������ ���� ���
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
    
    System.out.println("��� �̸� �л� ���� " + under + "���̰� ���� ������ �Ʒ��� �����ϴ�.");				//���� ���� ���
    
    System.out.print("A(" + a + "��)|");
    for (int i = 0; i < a; i++) {
      System.out.print("*");
    }
    System.out.println("");
    
    System.out.print("B(" + b + "��)|");
    for (int i = 0; i < b; i++) {
      System.out.print("*");
    }
    System.out.println("");
    
    System.out.print("C(" + c + "��)|");
    for (int i = 0; i < c; i++) {
      System.out.print("*");
    }
    System.out.println("");
    
    System.out.print("D(" + d + "��)|");
    for (int i = 0; i < d; i++) {
      System.out.print("*");
    }
    System.out.println("");
    
    System.out.print("F(" + f + "��)|");
    for (int i = 0; i < f; i++) {
      System.out.print("*");
    }
    System.out.println("");

    System.out.println("-------------------------");
    System.out.print("����" + scores.length + "��");				//���� ���
    System.out.println("(���" + avg + "��)");					//��� ���
  }
}