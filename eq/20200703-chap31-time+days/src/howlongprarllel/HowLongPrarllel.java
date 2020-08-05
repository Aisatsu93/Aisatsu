package howlongprarllel;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.List;

public class HowLongPrarllel
{

	public static long fibonacci(long n)
	{
		if (n == 1 || n == 2)
		{
			return 1;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		List<Integer> nums = Arrays.asList(41,42,43,44,45,46);
		
		Instant start = Instant.now();
		nums.parallelStream().map(n -> fibonacci(n)).forEach(r -> System.out.println(r));
		
		Instant end = Instant.now();
		System.out.println("Sequential Processing: " + Duration.between(start, end).toMillis());
	}

}
