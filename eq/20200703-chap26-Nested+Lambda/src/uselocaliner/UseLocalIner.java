package uselocaliner;

interface Printable
{
	void print();
}

class Papers
{
	private String con;
	public Papers(String s)
	{
		con = s;
	}
	
	public Printable getPrinter()
	{
		class Printer implements Printable
		{
			public void print()
			{
				System.out.println(con);
			}
		}
		return new Printer();
	}
}

public class UseLocalIner
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Papers p = new Papers("���� ����: �ູ�մϴ�.");
		Printable prn = p.getPrinter();
		prn.print();
	}

}
