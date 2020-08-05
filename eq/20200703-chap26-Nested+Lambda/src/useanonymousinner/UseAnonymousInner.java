package useanonymousinner;

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
		return new Printable()
				{
			public void print()
			{
				System.out.println(con);
			}
				};
	}
}

public class UseAnonymousInner
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Papers p = new Papers("���� ����: �ູ�մϴ�.");
		Printable prn = p.getPrinter();
		prn.print();
	}

}
