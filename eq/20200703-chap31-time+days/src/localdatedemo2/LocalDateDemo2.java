package localdatedemo2;

import java.time.LocalDate;
import java.time.Period;

public class LocalDateDemo2
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		LocalDate today = LocalDate.now();
		System.out.println("Today: " + today);

		LocalDate xmas = LocalDate.of(today.getYear(), 12, 25);
		System.out.println("Xmas: "+ xmas);
		
		Period left = Period.between(today, xmas);
		System.out.println("Xmas까지 앞으로 " + left.getMonths() + "개월 " + left.getDays() + "일");
	}

}
