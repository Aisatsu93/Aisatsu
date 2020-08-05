package arraylistcollection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCollection
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		
		for (int i = 0; i < list.size(); i++)
		{
			System.out.print(list.get(i)+'\t');
		}
		System.out.println();
		
		list.remove(0);
		
		for (int i = 0; i < list.size(); i++)
		{
			System.out.print(list.get(i)+'\t');
		}
		System.out.println();
	}

}
