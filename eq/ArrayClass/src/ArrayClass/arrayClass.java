package ArrayClass;

import java.util.ArrayList;

class Student
{
	// 속성
	int id;
	String name;
	
	// 매서드
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
		st1.name = "홍동휘";
		
		st1.add(10000000);
		st1.check();
		
		//배열
		int[] numberArray = new int[5];
		for(int i = 0; i <5;i++)
		{
			numberArray[i] = i+1;
			System.out.println(numberArray[i]);
		}
		
		//ArrayList
		ArrayList<String> t = new ArrayList<String>();
		ArrayList<Integer> i = new ArrayList<Integer>();
		t.add("추가");
		t.add("Java하세요");
		
		i.add(1);
		i.add(0);
		i.add(21210819);
		i.add(2);
		
		System.out.println(t.get(0));
		System.out.println(t.size());
		System.out.println(t.contains("Java"));
		System.out.println(t.contains("Java하세요"));
		
		String con = "abcd";
		System.out.println(con.contains("abcd"));
		
		t.remove("추가");
		System.out.println(t.size());
		t.remove(0);
		
		i.remove(0); //인덱스 값 참조
		i.remove((Integer)0); // ArrayList안에 있는 값 참조
		
		//Class
		
		
	}

}
