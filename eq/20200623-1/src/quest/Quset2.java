package quest;

import java.util.Date;
import java.util.Scanner;


public class Quset2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		String select;
		

		System.out.println("이름 : ");
		
		name = sc.next();
		
		System.out.println(name);
		
		while (true)
		{
			
			System.out.println("입력 : ");
			
			select = sc.next();
			
			
			if (select.equals("구구단"))
			{
				for (int i = 2; i< 10; i++)
				{
					for (int j = 1; j < 10; j++)
					{
						int gop = i * j;
						System.out.println(String.format("%d * %d = %d", i, j, gop));
					}
				}
			}
			else if (select.equals("현재시간") == true)
			{
				Date today = new Date();
				System.out.println(today);
			}
			else if (select.equals("수열"))
			{
				String start = "1";
				int nth = sc.nextInt();
			
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
			else if(select.equals("종료"))
				break;
		}
		
		sc.close();
	}

}
