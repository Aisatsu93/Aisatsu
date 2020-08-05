package quest;

import java.util.ArrayList;
import java.util.Scanner;

public class Student
{
	String name;
	int id;
	String gender;
}

public class Quest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Student> students = new ArrayList<Student>();
		
		students.add(new Student("이동준", 2009038033, "남"));
		students.add(new Student("이동준", 2009038033, "남"));
		students.add(new Student("이동준", 2009038033, "남"));
		students.add(new Student("이동준", 2009038033, "남"));
		
		for (Student item : students)
		{
			System.out.println(String.format("이름 : %s"));
		}
		
		for (int i = 0; i<students.size();i++)
		{
			if(students.get(i).name == "이동준")
			{
				students.set(i, students.get(i).number);
			}
		}
			
		
		
		

}
