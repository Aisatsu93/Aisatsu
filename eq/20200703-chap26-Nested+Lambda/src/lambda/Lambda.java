package lambda;

interface Printable
{
	void print(String s);
}

class Printer implements Printable
{
	public void print(String s) {
		System.out.println(s);
	}
}



public class Lambda
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Printable prn = new Printer();
		prn.print("What is Lambda?");
	}

}
