package ArrayClass;

import java.util.ArrayList;

class Student
{
	// �Ӽ�
	int id;
	String name;
	
	// �ż���
	public int add(int amount)
	{
		id += amount;
		return id;
	}
	public void check()
	{
		System.out.println(" id : " + id);
	}
}

public class arrayClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student st1 =  new Student();
		st1.id = 21210819;
		st1.name = "ȫ����";
		
		st1.add(10000000);
		st1.check();
		
		//�迭
		int[] numberArray = new int[5];
		for(int i = 0; i <5;i++)
		{
			numberArray[i] = i+1;
			System.out.println(numberArray[i]);
		}
		
		//ArrayList
		ArrayList<String> t = new ArrayList<String>();
		ArrayList<Integer> i = new ArrayList<Integer>();
		t.add("�߰�");
		t.add("Java�ϼ���");
		
		i.add(1);
		i.add(0);
		i.add(21210819);
		i.add(2);
		
		System.out.println(t.get(0));
		System.out.println(t.size());
		System.out.println(t.contains("Java"));
		System.out.println(t.contains("Java�ϼ���"));
		
		String con = "abcd";
		System.out.println(con.contains("abcd"));
		
		t.remove("�߰�");
		System.out.println(t.size());
		t.remove(0);
		
		i.remove(0); //�ε��� �� ����
		i.remove((Integer)0); // ArrayList�ȿ� �ִ� �� ����
		
		//Class
		
		
	}

}
