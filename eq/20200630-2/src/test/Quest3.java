package test;

class Student
{
	String name;
	int id;
	String gender;
	
	public Student (String a, int b, String c)
	{
		name = a;
		id = b;
		gender = c;
	}
}

public class Quest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Student students1 = new Student("�̵���", 2009038033, "��");
		Student students2 = new Student("������", 2007012034, "��");
		
		Student[] array = new Student[2];
		array[0] = students1;
		array[1] = students2;
		
		for (int i = 0; i < array.length; i++)
		{
			if (array[i].equals("�̵���"))
			{
				array[i].id = 2019038033;
				
			}
		}
		
		for (int j = 0; j < array.length; j++)
		{
			System.out.println("�̸�: "+array[j].name+", �й�: "+array[j].id+", ����: "+array[j].gender);
		}
		
		
	}

}
