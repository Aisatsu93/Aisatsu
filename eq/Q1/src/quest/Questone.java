package quest;

import java.util.Scanner;

public class Questone {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if ( a % 12 == 4 )
		{
			System.out.printf("���");
		}
		else if ( a % 12 == 5)
		{
			System.out.printf("�Ҷ�");
		}
		else if ( a % 12 == 6)
		{
			System.out.printf("ȣ���̶�");
		}
		else if ( a % 12 == 7)
		{
			System.out.printf("�䳢��");
		}
		else if ( a % 12 == 8)
		{
			System.out.printf("���");
		}
		else if ( a % 12 == 9)
		{
			System.out.printf("���");
		}
		else if ( a % 12 == 10)
		{
			System.out.printf("����");
		}
		else if ( a % 12 == 11)
		{
			System.out.printf("���");
		}
		else if ( a % 12 == 0)
		{
			System.out.printf("�����̶�");
		}
		else if ( a % 12 == 1)
		{
			System.out.printf("�߶�");
		}
		else if ( a % 12 == 2)
		{
			System.out.printf("����");
		}
		else if ( a % 12 == 3)
		{
			System.out.printf("������");
		}
		
		sc.close();
		
	}
}