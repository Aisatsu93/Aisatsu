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
		return "�̸�: "+ name + ", �й�: " + id + ", ����: " + gender;
	}
}

public class QuestAnswer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Student1 s1 = new Student1();
		s1.name = "�̵���";
		s1.id = 2009038033;
		s1.gender = "��";
		
		Student1 s2 = new Student1("������", 2007012034, "��");
		
		Student1 s3 = new Student1("ȫ����", 21210819, "��");
		
		Student1 s4 = new Student1("ȫ����1", 212108191, "��");
		
		Student1[] sArray = new Student1[4];
		sArray[0] = s1;
		sArray[1] = s2;
		sArray[2] = s3;
		sArray[3] = s4;
		
		for (int i = 0; i < sArray.length; i++)
		{
			if (sArray[i].equals("�̵���"))
			{
				sArray[i].id = 2019038033;
				
			}
		}
		for (int i = 0; i < sArray.length; i++)
		{
			System.out.println("�̸�: "+ sArray[i].name + ", �й�: " + sArray[i].id + ", ����: " + sArray[i].gender);
		}
		
		for (Student1 item : sArray)
		{
			System.out.println("�̸�: "+ item.name + ", �й�: " + item.id + ", ����: " + item.gender);
		}
		
		for (Student1 item : sArray)
		{
			System.out.println(item);
		}
		
	}

}




