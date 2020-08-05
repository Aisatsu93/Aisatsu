package lambda4;

interface Printable
{
	void print(String s);
}


public class Lambda4
{
	
	public static void ShowString(Printable p, String s)
	{
		p.print(s);
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ShowString((s) -> {System.out.println(s);} , "What is Lambda?");
	}

}
