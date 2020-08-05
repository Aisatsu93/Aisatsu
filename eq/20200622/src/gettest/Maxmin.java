package gettest;

import java.util.Scanner;

public class Maxmin {
	
	public static void main(String[] args) {

		
		
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		int num5 = sc.nextInt();
		
		sc.close();
		
		int[] arr = { num1, num2, num3, num4, num5 };
		
		int max = arr[0];
		int min = arr[0];
		
		int i;
		
		for (i = 0; i < 5; i++)
		{
			if (arr[i] > max)
				max = arr[i];
		}
		
		System.out.println("max = " + max);
		
		for (i = 0; i < 5; i++)
		{
			if (arr[i] < min)
				min = arr[i];
		}
		
		System.out.println("min = " + min);
		
		
		
	}
}

	




