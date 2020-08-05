package filterstream;

import java.util.Arrays;
import java.util.List;

public class FilterStream
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[] ar = { 1, 2, 3, 4, 5 };
		Arrays.stream(ar).filter(n -> n % 2 == 1).forEach(n -> System.out.print(n + "\t"));
		System.out.println();
		
		List<String> list = Arrays.asList("Toy", "Robot", "Box");
		
		list.stream().filter(s -> s.length() == 3).forEach(s -> System.out.print(s + "\t"));
		System.out.println();
	}

}
