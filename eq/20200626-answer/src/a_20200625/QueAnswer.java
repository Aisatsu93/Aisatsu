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
		System.out.println("1�� ����"); 
		
		int sum = 0;

		for(int i = 1; i<=100; i++)
		{
			if(i%3!=0) //i�� 3�� ����� �ƴ�
			{
				sum +=i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1~100���� ���� ����(3�� ��� ����)
		
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
		
		
		

		System.out.println("2�� ����");
		Scanner s = new Scanner(System.in);
		//���ڸ� �Է¹����� �װ� �ð��� ������ �ٲ��ִ� ��!
		System.out.print("Input Total Second? ");
		int input = s.nextInt();
		int Minute;
		int Second;
		
		Minute = input / 60; //123/60 = 2.05 -> Hour 2�� ��
		Second = input % 60; //123�� 60���� ������ �� ������ 3. �� 2
		System.out.println(Minute+"min "+Second+"sec");
		
		Swap a = new Swap();
		a.number1 = 3;
		a.number2 = 5;
		System.out.println("before : x = "+a.number1 + " y : "  + a.number2);
		Swap.swap(a);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
