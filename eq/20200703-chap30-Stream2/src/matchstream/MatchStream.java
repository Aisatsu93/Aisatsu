package matchstream;

import java.util.stream.IntStream;

public class MatchStream
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		boolean b = IntStream.of(1,2,3,4,5).allMatch(n -> n % 2 ==0);
		System.out.println("��� ¦���̴�. " + b);
		
		b = IntStream.of(1,2,3,4,5).anyMatch(n -> n % 2 == 0);
		System.out.println("¦���� �ϳ��� �ִ�. " + b);
		
		b = IntStream.of(1,2,3,4,5).noneMatch(n -> n % 2 == 0);
		System.out.println("¦���� �ϳ��� ����. " + b);
	}

}
