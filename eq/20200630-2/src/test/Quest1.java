package test;

import java.util.Scanner;

class Circle
{
	double rad = 0;
	final double PI = 3.14;
	
	public Circle(double r)
	{
		rad = r;
	}
	
	public double getArea()
	{
		return (rad * rad) * PI;
	}
}

public class Quest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("반지름은?");
		Scanner sc = new Scanner(System.in);
		double radius = sc.nextDouble();
		sc.close();
		
		Circle circle1 = new Circle(radius);
		
		if (radius >= 0)
		{
			System.out.println("원의 반지름은: "+radius);
			System.out.println("원의 넓이는: "+circle1.getArea());
		}
		else
		{
			System.out.println("잘못 입력하셨습니다.");
		}
		
		
	}

}
