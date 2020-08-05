package test;

import java.util.Scanner;

public class Quest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("알파벳을 입력하시오.");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		sc.close();
		
		char[] korean = new char[] { 'ㄱ','ㄴ','ㄷ','ㄹ','ㅁ','ㅂ','ㅅ','ㅇ','ㅈ','ㅊ','ㅌ','ㅋ','ㅍ','ㅎ','ㅏ','ㅑ','ㅓ','ㅕ','ㅗ','ㅛ','ㅜ','ㅠ','ㅡ','ㅣ'};
		
		for (int i = 0; i < input.length(); i++)
		{
			System.out.print(korean[input.charAt(i)-97]);
		}
		
		
	}

}
