package quest;

import java.util.Scanner;

public class Quest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�Է� : ");

		Scanner sc = new Scanner(System.in);
		
		String b = sc.next();
		
		sc.close();
		
		String[] array3;
		
		
		array3 = b.split("");
		
		for (int i = 0; i < b.length(); i++)
		{
			System.out.println(array3[i] + "�� " + (b.indexOf(array3[i])+1) + "��°���� ó�� �����մϴ�.");
		}
		
		
	}

}
