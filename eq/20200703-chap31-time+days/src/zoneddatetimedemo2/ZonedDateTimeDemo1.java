package zoneddatetimedemo2;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeDemo1
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ZonedDateTime departure = ZonedDateTime.of(LocalDateTime.of(2017, 12, 9, 14, 30),ZoneId.of("Asia/Seoul"));
		System.out.println("Departure : " + departure);
		
		ZonedDateTime arrival = ZonedDateTime.of(LocalDateTime.of(2017, 12, 9, 17, 25), ZoneId.of("Europe/Paris"));
		System.out.println("Arrival : " + arrival);
		
		System.out.println("Flight Time : " + Duration.between(departure, arrival));
	}

}
