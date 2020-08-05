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
		
		students.add(new Student("�̵���",2009038033,"��"));
		students.add(new Student("������",2007012034,"��"));
		
		for (int i = 0; i < students.size(); i++)
		{
			if (students.get(i).name == ("�̵���"))
			{
				students.get(i).changeId(2019038033);
			}
		}
		
		for (Student print : students)
		{
			System.out.println(String.format("�̸�: %s, �й�: %d, ����: %s", print.name, print.id, print.gender));
		}
		
		
		String[] arr1 = { "�̵���", "������" };
		int[] arr2 = { 2009038033,2007012034 };
		String[] arr3 = { "��", "��" };
		
		
		for (int i = 0; i < arr1.length; i++)
		{
			if (arr1[i].equals("�̵���"))
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
			System.out.println("�̸�: "+arr1[i]+", �й�: "+arr2[i]+", ����: "+arr3[i]);
		}
		
	}

}
