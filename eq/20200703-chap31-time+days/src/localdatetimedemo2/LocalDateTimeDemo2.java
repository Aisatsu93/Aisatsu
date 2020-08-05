package localdatetimedemo2;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

public class LocalDateTimeDemo2
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		LocalDateTime today = LocalDateTime.now();
		
		LocalDateTime flight1 = LocalDateTime.of(2020, 4, 25, 11, 20);
		
		LocalDateTime flight2 = LocalDateTime.of(2020, 5, 14, 11, 15);
		
		LocalDateTime myFlight;
		if(flight1.isBefore(flight2))
		{
			myFlight = flight1;
		}
		else
		{
			myFlight = flight2;
		}
		
		Period day = Period.between(today.toLocalDate(), myFlight.toLocalDate());
		
		Duration time = Duration.between(today.toLocalTime(), myFlight.toLocalTime());
		
		System.out.println(day);
		System.out.println(time);
	}

}