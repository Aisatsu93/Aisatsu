package test;

import java.util.Scanner;

public class Quest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("�¾ �⵵��?");
		Scanner sc = new Scanner(System.in);
		int year = 0;
		year = sc.nextInt();
		sc.close();
		
		switch(year%12)
		{
		case 1:
			{
				System.out.println("�߶�");
				break;
			}
		case 2:
			
			{
				System.out.println("����");
				break;
			}
		case 3:
			{
				System.out.println("������");
				break;
			}
		case 4:
			{
				System.out.println("���");
				break;
			}
		case 5:
			{
				System.out.println("�Ҷ�");
				break;
			}
		case 6:
			{
				System.out.println("ȣ���̶�");
				break;
			}
		case 7:
			{
				System.out.println("�䳢��");
				break;
			}
		case 8:
			{
				System.out.println("���");
				break;
			}
		case 9:
			{
				System.out.println("���");
				break;
			}
		case 10:
			{
				System.out.println("����");
				break;
			}
		case 11:
			{
				System.out.println("���");
				break;
			}
		case 12:
			{
				System.out.println("�����̶�");
				break;
			}
		default:
			{
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				break;
			}
			
		}
		
		
	}

}
