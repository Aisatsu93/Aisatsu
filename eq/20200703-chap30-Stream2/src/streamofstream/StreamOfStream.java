package streamofstream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOfStream
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Stream.of(11, 22, 33, 44).forEach(n -> System.out.print(n + "\t"));
		System.out.println();
		Stream.of("So Simple").forEach(s -> System.out.print(s + "\t"));
		System.out.println();
		
		List<String> sl = Arrays.asList("Toy", "Robot", "Box");
		Stream.of(sl).forEach(w -> System.out.println(w + "\t"));
		System.out.println();
	}

}
