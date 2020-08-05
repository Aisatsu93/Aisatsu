package gettest;

import java.util.Scanner;

public class Arrangementrules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String start = "1";
		Scanner s = new Scanner(System.in);
		int c = s.nextInt();
		s.close();
		for (int i = 0; i < c; i++)
		{
			System.out.println((i+1)+"¹øÂ°: " + start);
			String end = "";
			char number = start.charAt(0);
			int count = 0;
			for (int j = 0; j < start.length(); j++)
			{
				if (number != start.charAt(j))
				{
					end = end + number + count;
					number = start.charAt(j);
					count = 1;
				}
				else
				{
					count++;
				}
			}
			end = end + number + count;
			
			start = end;
		}
		
	}

}
