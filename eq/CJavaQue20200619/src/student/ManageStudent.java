package student;

import java.util.ArrayList;
import java.util.Scanner;

public class ManageStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student("�̵���", 2009038033, "��"));
		students.add(new Student("������", 2020038011, "��"));
		students.add(new Student("���Ѽ�", 2015012011, "��"));
		students.add(new Student("�����", 2017011023, "��"));

		System.out.println("ù ��° ����");
		
		for(int i = 0; i<students.size(); i++)
		{
//			System.out.println(
//					String.format
//					("�̸� : %s, �й� : %d, ���� : %s", 
//							students.get(i).name, students.get(i).number, students.get(i).gender));
			
			System.out.println("�̸� : " + students.get(i).name + " �й� : " + students.get(i).number + " ���� : " + students.get(i).gender);
		
		}
		
//		for(Student item : students)
//		{
//			System.out.println(String.format("�̸� : %s, �й� : %d, ���� : %s", item.name, item.number, item.gender));
//		}

		System.out.println("�� ��° ����");
		for(int i = 0; i < students.size(); i++)
		{
			if(students.get(i).name == "�̵���")
			{
				students.get(i).setNumber(2019038033);
			}
		}
		for(Student item : students)
		{
			System.out.println(String.format("�̸� : %s, �й� : %d, ���� : %s", item.name, item.number, item.gender));
		}

		System.out.println("�� ��° ����");
		for(int i = students.size()-1; i >= 0; i--)
		{
			if(students.get(i).name == "������")
			{
				students.remove(i);
				break;
			}
			
		}

		for(Student item : students)
		{
			System.out.println(String.format("�̸� : %s, �й� : %d, ���� : %s", item.name, item.number, item.gender));
		}

		System.out.println("������ �� ��° ����");
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
			System.out.println(String.format("�̸� : %s, �й� : %d, ���� : %s", item.name, item.number, item.gender));
		}
		
	}

}
