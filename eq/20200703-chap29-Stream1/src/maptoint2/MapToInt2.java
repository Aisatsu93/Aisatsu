package maptoint2;

import java.util.Arrays;
import java.util.List;

public class MapToInt2
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		List<String> ls = Arrays.asList("Box", "Robot", "Simple");
		
		ls.stream().mapToInt(s -> s.length()).forEach(n -> System.out.print(n+"\t"));
		System.out.println();
	}

}
