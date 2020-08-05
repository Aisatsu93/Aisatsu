package quest;

import java.util.Scanner;

public class Questone {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if ( a % 12 == 4 )
		{
			System.out.printf("Áã¶ì");
		}
		else if ( a % 12 == 5)
		{
			System.out.printf("¼Ò¶ì");
		}
		else if ( a % 12 == 6)
		{
			System.out.printf("È£¶ûÀÌ¶ì");
		}
		else if ( a % 12 == 7)
		{
			System.out.printf("Åä³¢¶ì");
		}
		else if ( a % 12 == 8)
		{
			System.out.printf("¿ë¶ì");
		}
		else if ( a % 12 == 9)
		{
			System.out.printf("¹ì¶ì");
		}
		else if ( a % 12 == 10)
		{
			System.out.printf("¸»¶ì");
		}
		else if ( a % 12 == 11)
		{
			System.out.printf("¾ç¶ì");
		}
		else if ( a % 12 == 0)
		{
			System.out.printf("¿ø¼þÀÌ¶ì");
		}
		else if ( a % 12 == 1)
		{
			System.out.printf("´ß¶ì");
		}
		else if ( a % 12 == 2)
		{
			System.out.printf("°³¶ì");
		}
		else if ( a % 12 == 3)
		{
			System.out.printf("µÅÁö¶ì");
		}
		
		sc.close();
		
	}
}