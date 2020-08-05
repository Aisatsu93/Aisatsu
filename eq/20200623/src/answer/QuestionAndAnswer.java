package answer;

import java.util.Scanner;

public class QuestionAndAnswer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1번 문제
		//피라미드 문제
		
		System.out.println("1번 문제");
		System.out.println("몇 층으로 쌓을래?");
		Scanner s = new Scanner(System.in);
		int floor = 0;
		
		try //예외처리
		{
			floor = s.nextInt();
		} catch (Exception e) {
			System.out.println("실패!!!");
			
			e.printStackTrace();
		} finally
		{
			System.out.println("asdf");
		}
		
		System.out.println("asdf");
		
		for (int i = 0; i < floor; i++)
		{
			for (int j = floor; j >= i; j--)
			{
			System.out.print(" ");
			}
			for (int k = 0; k < 2 * i + 1; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("2번 문제");
		int max;
		int min;
		max = Integer.MIN_VALUE;
		min = Integer.MAX_VALUE;
		for (int i = 0; i < 5; i++)
		{
			int compareValue =  s.nextInt();
			if(compareValue > max)
			{
				max = compareValue;
			}
			if(compareValue < min)
			{
				min = compareValue;
			}
			
		}
		System.out.println
		//("max : " + max + ", min : " + min );
		(String.format("max : %d, min %d", max, min));
		

		String start = "1";
		int nth = s.nextInt();
		s.close();
		
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
