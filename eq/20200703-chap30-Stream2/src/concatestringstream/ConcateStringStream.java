package concatestringstream;

import java.util.stream.Stream;

public class ConcateStringStream
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Stream<String> ss1 = Stream.of("Cake", "Milk");
		Stream<String> ss2 = Stream.of("Lemon", "Jelly");
		
		Stream.concat(ss1, ss2).forEach(s -> System.out.print(s + "\t"));
	}

}
