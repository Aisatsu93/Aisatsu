package stringoptional1;

import java.util.Optional;

public class StringOptional1
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Optional<String> os1 = Optional.of(new String("Toy1"));
		Optional<String> os2 = Optional.ofNullable(new String("Toy2"));
		
		if(os1.isPresent())
		{
			System.out.println(os1.get());
		}
		if(os2.isPresent())
		{
			System.out.println(os2.get());
		}
		
	}

}
