package reducestream;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class ReduceStream
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		List<String> ls = Arrays.asList("Box", "Simple", "Complex", "Robot");
		
		BinaryOperator<String> lc = (s1, s2) -> {
			if(s1.length() > s2.length()) {
				return s1;
			}
			else
			{
				return s2;
			}
		};
		
		String str = ls.stream().reduce("", lc);
		System.out.println(str);
	}

}
