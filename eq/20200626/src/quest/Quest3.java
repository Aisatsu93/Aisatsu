package quest;


import java.util.Scanner;

public class Quest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("脊径 : ");
		
		String word = sc.next();
		
		sc.close();
		
		String[] arr;
		
		arr = word.split("");
		
		String[] alpha = new String[] {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x"};
		String[] korean = new String[] {"ぁ","い","ぇ","ぉ","け","げ","さ","し","じ","ず","せ","ぜ","そ","ぞ","た","ち","っ","づ","で","に","ぬ","ば","ぱ","び"};

		
		for (int i = 0 ; i < word.length(); i++)
		{			
			for (int j = 0; j < alpha.length; j++)
			{
				if (arr[i].equals(alpha[j]))
				{
					System.out.printf(korean[j]);
				}
			}
		}
		
		
	}

}
