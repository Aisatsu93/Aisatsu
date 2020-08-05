package test;

public class Quest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		
		for (int i = 1; i <= 100; i++)
		{
			if ( i % 3 != 0)
			{
				sum += i;
				
			}
		}
		
		System.out.println("1~100까지 3의 배수를 제외한 합: "+sum);
		
	}

}
