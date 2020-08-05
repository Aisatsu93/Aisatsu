package localdatetimedemo1;

import java.time.LocalDateTime;

public class LocalDateTimeDemo1
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		
		LocalDateTime mt = dt.plusHours(22);
		mt = mt.plusMinutes(35);
		
		System.out.println(mt);
	}

}
