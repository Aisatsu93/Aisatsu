package lazyopstream;

import java.util.stream.IntStream;

public class LazyOpStream
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		IntStream.of(1, 3, 5).peek(d -> System.out.print(d + "\t"));
		System.out.println();
		
		IntStream.of(5, 3, 1).peek(d -> System.out.print(d + "\t")).sum();
		System.out.println();
	}

}
