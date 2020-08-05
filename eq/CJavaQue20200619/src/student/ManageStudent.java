package student;

import java.util.ArrayList;
import java.util.Scanner;

public class ManageStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student("이동준", 2009038033, "남"));
		students.add(new Student("안혜주", 2020038011, "여"));
		students.add(new Student("고한솔", 2015012011, "남"));
		students.add(new Student("안희령", 2017011023, "여"));

		System.out.println("첫 번째 문제");
		
		for(int i = 0; i<students.size(); i++)
		{
//			System.out.println(
//					String.format
//					("이름 : %s, 학번 : %d, 성별 : %s", 
//							students.get(i).name, students.get(i).number, students.get(i).gender));
			
			System.out.println("이름 : " + students.get(i).name + " 학번 : " + students.get(i).number + " 성별 : " + students.get(i).gender);
		
		}
		
//		for(Student item : students)
//		{
//			System.out.println(String.format("이름 : %s, 학번 : %d, 성별 : %s", item.name, item.number, item.gender));
//		}

		System.out.println("두 번째 문제");
		for(int i = 0; i < students.size(); i++)
		{
			if(students.get(i).name == "이동준")
			{
				students.get(i).setNumber(2019038033);
			}
		}
		for(Student item : students)
		{
			System.out.println(String.format("이름 : %s, 학번 : %d, 성별 : %s", item.name, item.number, item.gender));
		}

		System.out.println("세 번째 문제");
		for(int i = students.size()-1; i >= 0; i--)
		{
			if(students.get(i).name == "안혜주")
			{
				students.remove(i);
				break;
			}
			
		}

		for(Student item : students)
		{
			System.out.println(String.format("이름 : %s, 학번 : %d, 성별 : %s", item.name, item.number, item.gender));
		}

		System.out.println("마지막 네 번째 문제");
		System.out.println();
		for(int i = 0; i <2; i++)
		{
			Scanner scan = new Scanner(System.in);
			String newStudentName = scan.nextLine();
//			Scanner scan2 = new Scanner(System.in);
//			scan.close();
			scan = new Scanner(System.in);
			int newStudentNumber = scan.nextInt();
			scan = new Scanner(System.in);
			String newStudentGender = scan.nextLine();
//			Scanner scan3 = new Scanner(System.in);
//			scan.close();
			//scan.close();
			//scan3.nextLine();
			//scan.close();
			//scan2.close();
			//scan3.close();
			students.add(new Student(newStudentName, newStudentNumber, newStudentGender));
			if(i == 1)
				scan.close();
		}
		for(Student item : students)
		{
			System.out.println(String.format("이름 : %s, 학번 : %d, 성별 : %s", item.name, item.number, item.gender));
		}
		
	}

}
