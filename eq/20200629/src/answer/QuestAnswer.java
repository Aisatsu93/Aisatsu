package answer;

class Student1
{
	String name;
	int id;
	String gender;
	
	public Student1()
	{
		
	}
	
	public Student1(String a, int b, String c)
	{
		name = a;
		id = b;
		gender = c;
	}
	
	public String toString ()
	{
		return "이름: "+ name + ", 학번: " + id + ", 성별: " + gender;
	}
}

public class QuestAnswer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Student1 s1 = new Student1();
		s1.name = "이동준";
		s1.id = 2009038033;
		s1.gender = "남";
		
		Student1 s2 = new Student1("이제영", 2007012034, "여");
		
		Student1 s3 = new Student1("홍동휘", 21210819, "남");
		
		Student1 s4 = new Student1("홍동휘1", 212108191, "남");
		
		Student1[] sArray = new Student1[4];
		sArray[0] = s1;
		sArray[1] = s2;
		sArray[2] = s3;
		sArray[3] = s4;
		
		for (int i = 0; i < sArray.length; i++)
		{
			if (sArray[i].equals("이동준"))
			{
				sArray[i].id = 2019038033;
				
			}
		}
		for (int i = 0; i < sArray.length; i++)
		{
			System.out.println("이름: "+ sArray[i].name + ", 학번: " + sArray[i].id + ", 성별: " + sArray[i].gender);
		}
		
		for (Student1 item : sArray)
		{
			System.out.println("이름: "+ item.name + ", 학번: " + item.id + ", 성별: " + item.gender);
		}
		
		for (Student1 item : sArray)
		{
			System.out.println(item);
		}
		
	}

}




