package answer;

import java.util.Arrays;
import java.util.Scanner;

public class Answer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("1번 문제");
		
		Scanner sInput = new Scanner(System.in);
		
		String input = sInput.nextLine();
		int[] alphabet = new int[26];
		
		sInput.close();
		
		for (int i = 0; i < input.length(); i++)
		{
			//'a' = 97 , 'z' = 122
			int index = input.charAt(i) - (int)'a';
			//index = 'x' - 'a'
			//index = 120 - 97 =23
			alphabet[index]++;
		}
		for (int i = 0; i < alphabet.length; i++)
		{
			if (alphabet[i] != 0)
			{
				String sentense = "'"+(char)(i+97)+"'"+"는 "+(alphabet[i])+"개 있습니다.";
				System.out.println(sentense);
			}
		}
		
		System.out.println("2번 문제");
		
		Arrays.fill(alphabet, -1);
		Scanner sInput2 = new Scanner(System.in);
		String Input2 = sInput2.nextLine();

		sInput2.close();
		
		for (int i = 0; i < Input2.length(); i++)
		{
			int index = Input2.charAt(i) - 97;
			if (alphabet[index] == -1)
			{
				alphabet[index] = i;
			}
		}
		for (int i = 0; i < alphabet.length; i++)
		{
			if (alphabet[i] != -1)
			{
				String sentense = "'"+(char)(i+97)+"'"+"는 "+(alphabet[i]+1)+"번째에 처음 나옵니다.";
				System.out.println(sentense);
			}
		}
		
		System.out.println("3번 문제");
		
		//String[] alpha = new String[] {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x"};
		//String[] korean = new String[] {"ㄱ","ㄴ","ㄷ","ㄹ","ㅁ","ㅂ","ㅅ","ㅇ","ㅈ","ㅊ","ㅋ","ㅌ","ㅍ","ㅎ","ㅏ","ㅑ","ㅓ","ㅕ","ㅗ","ㅛ","ㅜ","ㅠ","ㅡ","ㅣ"};

		Scanner sInput3 = new Scanner(System.in);
		String input3 = sInput3.nextLine();
		
		sInput3.close();
		
		char[] test = new char[]{'ㄱ','ㄴ','ㄷ','ㄹ','ㅁ','ㅂ','ㅅ','ㅇ','ㅈ','ㅊ','ㅋ','ㅌ','ㅍ','ㅎ','ㅏ','ㅑ','ㅓ','ㅕ','ㅗ','ㅛ','ㅜ','ㅠ','ㅡ','ㅣ'};
		
		for (int i = 0; i < input3.length(); i++)
		{
			System.out.print(test[input3.charAt(i)-(int)'a']);
		}
		
		
		
		
		
	}

}
