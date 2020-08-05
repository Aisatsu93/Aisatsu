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
		
		
		Student students1 = new Student("이동준", 2009038033, "남");
		Student students2 = new Student("이제영", 2007012034, "여");
		
		Student[] array = new Student[2];
		array[0] = students1;
		array[1] = students2;
		
		for (int i = 0; i < array.length; i++)
		{
			if (array[i].equals("이동준"))
			{
				array[i].id = 2019038033;
				
			}
		}
		
		for (int j = 0; j < array.length; j++)
		{
			System.out.println("이름: "+array[j].name+", 학번: "+array[j].id+", 성별: "+array[j].gender);
		}
		
		
	}

}
