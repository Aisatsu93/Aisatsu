package answer;

import java.util.Scanner;

public class Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 2; i< 10; i++)
		{
			for (int j = 1; j < 10; j++)
			{
				int gop = i * j;
				System.out.println(String.format("%d * %d = %d", i, j, gop));
			}
		}
		
		Scanner sc = new Scanner(System.in);
		
		String start = "1";
		int nth = sc.nextInt();

		
		sc.close();
	
		for (int i = 0; i<nth; i++)
		{
			System.out.println((i+1)+"번째: " + start);
			String end = ""; //누적값 혹은 뭔가 끊어주는 값
			char number = start.charAt(0); //몇 개 인지 구해야 하는 숫자
			int count = 0; //가리키는 숫자의 개수
			for (int j = 0; j < start.length(); j++)
			{
				//가리키는 숫자랑 다른 숫자가 나오는 경우
				if(number != start.charAt(j))
				{
					end = end + number + count;
					number = start.charAt(j);
					count = 1;
				}
				else // number == start.chatAt(j)
				{
					count++;
				}
			}
			end  = end + number + count;
			start = end;
		}
	}

}
