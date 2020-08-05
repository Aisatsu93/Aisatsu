package createintstream;

import java.util.stream.IntStream;

public class CreateIntStream
{

	public static void showIntStream(IntStream is)
	{
		is.forEach(n -> System.out.print(n + "\t"));
		System.out.println();
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		IntStream is3 = IntStream.of(7, 5, 3);
		showIntStream(is3);
		
		IntStream is4 = IntStream.range(5, 8);
		showIntStream(is4);
		
		IntStream is5 = IntStream.rangeClosed(5, 8);
		showIntStream(is5);
	}

}
