package localtimedemo1;

import java.time.LocalTime;

public class LocalTimeDemo1
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		LocalTime now = LocalTime.now();
		System.out.println("���� �ð�: " + now);
		
		LocalTime mt = now.plusHours(2);
		mt = mt.plusMinutes(10);
		
		System.out.println("ȭ�� ���� �ð�: " + mt);
	}

}
