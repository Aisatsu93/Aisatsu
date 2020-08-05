package a_20200625;

import java.util.Scanner;

class Swap
{
	public int number1,number2;
	public static void swap(Swap obj)
	{
		int temp;
		temp = obj.number1;
		obj.number1 = obj.number2;
		obj.number2 = temp;
		System.out.println
		("swap : x =" + obj.number1 + ", y = " + obj.number2);
	}
}

public class QueAnswer {
	
	public static int Calc()
	{
		System.out.println("1번 문제"); 
		
		int sum = 0;

		for(int i = 1; i<=100; i++)
		{
			if(i%3!=0) //i가 3의 배수가 아님
			{
				sum +=i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1~100까지 합을 구함(3의 배수 빼고)
		
//		Scanner s;
//		s = new Scanner(System.in);
		
//		Scanner s = new Scanner(System.in);
//		
//		String text = s.nextLine();
//		int temp = s.nextInt();//50\n
//		s.nextLine(); // \n
//		String text2 = s.nextLine(); //\n
//		System.out.println
//		("text : " +text + "temp : " + temp
//				+ "text2 : " + text2);
		
		System.out.println("sum is " + Calc());
		
		
		

		System.out.println("2번 문제");
		Scanner s = new Scanner(System.in);
		//숫자를 입력받으면 그걸 시간과 분으로 바꿔주는 것!
		System.out.print("Input Total Second? ");
		int input = s.nextInt();
		int Minute;
		int Second;
		
		Minute = input / 60; //123/60 = 2.05 -> Hour 2가 들어감
		Second = input % 60; //123을 60으로 나눴을 때 나머지 3. 몫 2
		System.out.println(Minute+"min "+Second+"sec");
		
		Swap a = new Swap();
		a.number1 = 3;
		a.number2 = 5;
		System.out.println("before : x = "+a.number1 + " y : "  + a.number2);
		Swap.swap(a);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
