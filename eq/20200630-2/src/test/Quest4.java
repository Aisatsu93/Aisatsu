package test;

import java.util.Scanner;

public class Quest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("���ĺ��� �Է��Ͻÿ�.");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		sc.close();
		
		char[] korean = new char[] { '��','��','��','��','��','��','��','��','��','��','��','��','��','��','��','��','��','��','��','��','��','��','��','��'};
		
		for (int i = 0; i < input.length(); i++)
		{
			System.out.print(korean[input.charAt(i)-97]);
		}
		
		
	}

}
