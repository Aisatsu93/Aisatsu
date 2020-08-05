package flatmapstream;

import java.util.Arrays;
import java.util.stream.Stream;

public class FlatMapStream
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Stream<String> ss1 = Stream.of("MY_AGE", "YOUR_LIFE");
		Stream<String> ss2 = ss1.flatMap(s -> Arrays.stream(s.split("_")));
		ss2.forEach(s -> System.out.print(s + "\t"));
		System.out.println();
	}

}
