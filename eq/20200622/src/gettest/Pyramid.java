package gettest;

public class Pyramid {
	
	public static void main(String[] args) {

		int i;
		int j;
	
		for (i = 0; i < 10; i++)
		{
			for (j = 10-i; j > 0; j--)
			{
				System.out.print(" ");
			}
			for (j = 0; j < i*2+1;j++)
			{
				System.out.print("*");
			}
		}
		
		System.out.println();
	
	
	}
}
