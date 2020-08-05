package test;

import java.util.Scanner;

public class Quest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("알파벳을 입력하시오.");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int[] alpha = new int[26];
		sc.close();
		
		for (int i = 0; i < input.length(); i++)
		{
			int num = input.charAt(i) - 97;
			alpha[num]++;
		}
		
		for (int j = 0; j < alpha.length; j++)
		{
			if (alpha[j] != 0)
			{
				System.out.println((char)(j+97)+"는 "+(alpha[j]+"개 있습니다."));
			}
		}
		
	}

}
