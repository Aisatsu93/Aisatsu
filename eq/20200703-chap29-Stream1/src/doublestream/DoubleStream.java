package doublestream;

import java.util.Arrays;

public class DoubleStream
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		double[] ds = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		
		Arrays.stream(ds).forEach(d -> System.out.println(d + "\t"));
		System.out.println();
		
		Arrays.stream(ds, 1, 4).forEach(d -> System.out.println(d + "\t"));
		System.out.println();
	}

}
