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

		
		System.out.println("��������?");
		Scanner sc = new Scanner(System.in);
		double radius = sc.nextDouble();
		sc.close();
		
		Circle circle1 = new Circle(radius);
		
		if (radius >= 0)
		{
			System.out.println("���� ��������: "+radius);
			System.out.println("���� ���̴�: "+circle1.getArea());
		}
		else
		{
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
		
		
	}

}
