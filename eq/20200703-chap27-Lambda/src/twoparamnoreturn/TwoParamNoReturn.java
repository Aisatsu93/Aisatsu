package twoparamnoreturn;

interface Calculate
{
	void cal(int a, int b);
}

public class TwoParamNoReturn
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Calculate c;
		
		c = (a, b) -> System.out.println(a + b);
		c.cal(4, 3);
		
		c = (a, b) -> System.out.println(a - b);
		c.cal(4, 3);
		
		c = (a, b) -> System.out.println(a * b);
		c.cal(4, 3);
	}

}