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

		
		Student students = new Student("�̵���", 2009038033, "��");
		
		System.out.println("�̸�: "+students.name+", �й�: "+students.id+", ����: "+students.gender);
		
		
	}

}
