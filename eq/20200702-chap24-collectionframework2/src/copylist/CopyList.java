package copylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CopyList
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		List<String> src = Arrays.asList("Box","Apple","Toy","Robot");
		
		List<String> dest = new ArrayList<>(src);
		
		Collections.sort(dest);
		System.out.println(dest);
		
		Collections.copy(dest, src);
		
		System.out.println(dest);
	}

}
