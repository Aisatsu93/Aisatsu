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
		num1.name = "이동준";
		num1.id = 2009038033;
		num1.gender = "남";
		Student num2 = new Student();
		num2.name = "안혜주";
		num2.id = 2020038011;
		num2.gender = "여";
		Student num3 = new Student();
		num3.name = "고한솔";
		num3.id = 2015012011;
		num3.gender = "남";
		Student num4 = new Student();
		num4.name = "안희령";
		num4.id = 2017011023;
		num4.gender = "여";
		
		
		Student.check();
		
		
		num1.add(10000000);
		
		System.out.println(num1.id);
		
		num2.remove();
		
		Scanner sc = new Scanner(System.in);
		
		Student num5 = new Student();
		System.out.println("이름: ");
		num5.name = sc.next();
		System.out.println("학번: ");
		num5.id = sc.nextInt();
		System.out.println("성별: ");
		num5.gender = sc.next();
		
		Student num6 = new Student();
		System.out.println("이름: ");
		num6.name = sc.next();
		System.out.println("학번: ");
		num6.id = sc.nextInt();
		System.out.println("성별: ");
		num6.gender = sc.next();
		
		sc.close();
		
		
		

	}

}
