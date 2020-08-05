package quest2;

import java.util.Scanner;

public class QuestTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int min = 0;
		
		Scanner sc = new Scanner(System.in);
		int second = sc.nextInt();
		sc.close();
		
		if (second < 60)
		{
			System.out.println(String.format("%d sec", second));
		}
		
		else if (second >= 60)
		{
			min = second / 60;
			second = second % 60;
			System.out.println(min + "min " + second + "sec");
		}

	}
}
