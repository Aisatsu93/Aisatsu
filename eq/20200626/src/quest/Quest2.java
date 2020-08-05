package quest;

import java.util.Scanner;

public class Quest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("입력 : ");

		Scanner sc = new Scanner(System.in);
		
		String b = sc.next();
		
		sc.close();
		
		String[] array3;
		
		
		array3 = b.split("");
		
		for (int i = 0; i < b.length(); i++)
		{
			System.out.println(array3[i] + "는 " + (b.indexOf(array3[i])+1) + "번째에서 처음 등장합니다.");
		}
		
		
	}

}
