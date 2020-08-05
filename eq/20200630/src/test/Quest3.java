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

		
		Student students = new Student("이동준", 2009038033, "남");
		
		System.out.println("이름: "+students.name+", 학번: "+students.id+", 성별: "+students.gender);
		
		
	}

}
