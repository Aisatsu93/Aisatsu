package quest1;

class Sum
{
	int sum;
	
	public Sum()
	{
		int i;
		
		for (i = 0 ; i < 100 ; i++)
		{
			if (i % 3 != 0)
			{
				sum = sum + i;
			}
		}
	}
	
	public void check()
	{
		System.out.println("1~100사이 3의 배수를 제외한 모든 수의 합 : " + sum);
	}
}

public class QuestOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sum sums = new Sum();
		
		sums.check();
		
	}

}
