package answer;

import java.util.Scanner;

class Student
{
	String name;
	int id;
	String gender;

	public void add(int i) {
		// TODO Auto-generated method stub
		id += i;
	}

	public static void check() {
		// TODO Auto-generated method stub
		System.out.println();
	}

	public void remove() {
		// TODO Auto-generated method stub
		
	}

	
}

public class Quest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student num1 = new Student();
		num1.name = "�̵���";
		num1.id = 2009038033;
		num1.gender = "��";
		Student num2 = new Student();
		num2.name = "������";
		num2.id = 2020038011;
		num2.gender = "��";
		Student num3 = new Student();
		num3.name = "���Ѽ�";
		num3.id = 2015012011;
		num3.gender = "��";
		Student num4 = new Student();
		num4.name = "�����";
		num4.id = 2017011023;
		num4.gender = "��";
		
		
		Student.check();
		
		
		num1.add(10000000);
		
		System.out.println(num1.id);
		
		num2.remove();
		
		Scanner sc = new Scanner(System.in);
		
		Student num5 = new Student();
		System.out.println("�̸�: ");
		num5.name = sc.next();
		System.out.println("�й�: ");
		num5.id = sc.nextInt();
		System.out.println("����: ");
		num5.gender = sc.next();
		
		Student num6 = new Student();
		System.out.println("�̸�: ");
		num6.name = sc.next();
		System.out.println("�й�: ");
		num6.id = sc.nextInt();
		System.out.println("����: ");
		num6.gender = sc.next();
		
		sc.close();
		
		
		

	}

}
