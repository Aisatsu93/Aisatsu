package morning;

import java.util.ArrayList;

class Student
{
	String name;
	int id;
	String gender;
	
	public Student(String a, int b, String c)
	{
		name = a;
		id = b;
		gender = c;
	}
	
	public void changeId(int d)
	{
		id = d;
	}
	
}

public class Quest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Student> students = new ArrayList<>();
		
		students.add(new Student("이동준",2009038033,"남"));
		students.add(new Student("이제영",2007012034,"여"));
		
		for (int i = 0; i < students.size(); i++)
		{
			if (students.get(i).name == ("이동준"))
			{
				students.get(i).changeId(2019038033);
			}
		}
		
		for (Student print : students)
		{
			System.out.println(String.format("이름: %s, 학번: %d, 성별: %s", print.name, print.id, print.gender));
		}
		
		
		String[] arr1 = { "이동준", "이제영" };
		int[] arr2 = { 2009038033,2007012034 };
		String[] arr3 = { "남", "여" };
		
		
		for (int i = 0; i < arr1.length; i++)
		{
			if (arr1[i].equals("이동준"))
			{
				int j = i;
				for (int k = 0; k < arr2.length; k++)
				{
					if (k == j)
					{
						arr2[k] = 2019038033;
					}
				}
			}
		}
		
		for (int i = 0; i < arr1.length; i++)
		{
			System.out.println("이름: "+arr1[i]+", 학번: "+arr2[i]+", 성별: "+arr3[i]);
		}
		
	}

}
