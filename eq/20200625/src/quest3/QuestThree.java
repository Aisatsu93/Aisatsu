package quest3;

class Swap {

	int x;
	int y;
	int temp;

	public Swap (int a, int b)
	{
		x = a;
		y = b;
		
		temp = 0;
		
		temp = x;
		x = y;
		y = temp;
		
	}
	
	public void check()
	{
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
}


public class QuestThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int x = 3;
		int y = 5;
		
		Swap swaps = new Swap(x,y);
		
		swaps.check();
		
	}

}
