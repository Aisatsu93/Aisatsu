package First;

import java.util.Scanner;

public class Secondquest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("현재 몇 월 인가요(숫자만 입력하세요.)");
		
		Scanner scan = new Scanner(System.in);
		
		int month = scan.nextInt();
		
		scan.close();
		
		if (month == 12 || month < 3)
		{
			System.out.println("겨울");
		}
		else if (month >= 3 && month < 6)
		{
			System.out.println("봄");
		}
		else if (month >= 6 && month < 9)
		{
			System.out.println("여름");
		}
		else
		{
			System.out.println("가을");
		}
	}

}
