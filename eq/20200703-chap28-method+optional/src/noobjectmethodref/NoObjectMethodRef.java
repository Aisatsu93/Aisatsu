package noobjectmethodref;

import java.util.function.ToIntBiFunction;

class IBox
{
	private int n;
	public IBox (int i)
	{
		n = i;
	}
	
	public int larger(IBox b)
	{
		if(n > b.n)
		{
			return n;
		}
		else
		{
			return b.n;
		}
	}
}

public class NoObjectMethodRef
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		IBox ib1 = new IBox(5);
		IBox ib2 = new IBox(7);
		
		ToIntBiFunction<IBox, IBox> bf = (b1, b2) -> b1.larger(b2);
		int BigNum = bf.applyAsInt(ib1, ib2);
		System.out.println(BigNum);
	}

}
