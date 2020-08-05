package Test;

import java.util.Scanner;

public class OneTwoThree {

	public static void main(String[] args) {
		
		//input
		Scanner scan = new Scanner(System.in);
		String message;
		message = scan.nextLine();
		
		for(int i = 0; i < 5; i++) {

			System.out.println(message);
		}
		
		for(int i = 0; i < 5; i++)
		{
			System.out.println("HEloo");
		}
		
		int aaaa = 15;
		if( aaaa == 15)
		{
			
		}
		else
		{
			
		}
		
		int abcd = 123;
		
		if(abcd > 100 && abcd < 110)
		{
			
		}
		else if(abcd > 110)
		{
			
		}
		else
		{
			
		}
		
		
		int akj = 12333;
		switch(akj)
		{
		case 1:
			break;
		case 2:
			break;
		case 3:
		case 4:
		case 12333:
			
			break;
		}
		
		while(true)
		{
			break;
		
		}
		
		int qwer = 0;
		while (qwer>10)
		{
			qwer++;
		}
		
		
		
		
		final int MAX = 1024;
		
		//MAX = 100; //변화 안 됨 => 상수니까...
		
		int max = 1024;
		max = 100;//변화가 됨 => 변수니까....
		
		short num11 = 11;
		short num22 = 22;
		short resu = (short) (num11+num22);

		System.out.println("\n");
		System.out.println(max);
		System.out.println(MAX);
		System.out.println();
		
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		System.out.println("2+5=" + 2+5);
		System.out.println("2+5=" + (2+5));
		
		System.out.println("\n");
		
		System.out.println(12);
		System.out.println("12");
		System.out.println("1" + "2");
		System.out.println(1+"2");
		System.out.println("1"+2);
		
		System.out.print("1Hey!!!");
		System.out.print("2Hey!!!");
		
		short num1 = 11;
		short num2 = 22;
//		short result = num1 + num2;
		int result = num1 + num2;
		short result2 = (short)(num1 + num2);
		
		int HeyBaby = (int)'a';
		// string vs char
		// 문자? 
		// 
		
		String hey = "a";
		String hey2 = "sdfsdfsdfsdfsdfsdfa";
		char heyhey = 'a'; //1글자만 됨
//		char heyhey2 = 'aa'; 
		
		char h = hey2.charAt(2); 
		char h2 = "sdfsdfsdfsdfsdfsdfa".charAt(1); //at ~에 
		
		System.out.println();
		System.out.println(result);
		System.out.println(result2);
		System.out.println(HeyBaby);
		System.out.println(h);
		
		
		int a = 59;
		
		char b = (char)a;
		
		int c = (int)b;		
		
		byte abc = 123;
		
		System.out.println(b);

		System.out.println((int)b);
		System.out.println(c);
		System.out.println(abc);
		
		
	}

}
