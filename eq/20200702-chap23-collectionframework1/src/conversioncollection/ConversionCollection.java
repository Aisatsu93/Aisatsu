package conversioncollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ConversionCollection
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("Toy","Box","Robot","Box");
		list = new ArrayList<>(list);
		
		for(Iterator<String> itr = list.iterator(); itr.hasNext();)
		{
			System.out.print(itr.next()+'\t');
		}
		System.out.println();
		
		list = new LinkedList<>(list);
				
		for(Iterator<String> itr = list.iterator(); itr.hasNext();)
		{
			System.out.print(itr.next()+'\t');
		}
		System.out.println();
	}

}
