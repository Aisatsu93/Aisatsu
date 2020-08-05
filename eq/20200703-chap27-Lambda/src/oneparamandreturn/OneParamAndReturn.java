package oneparamandreturn;

interface HowLong
{
	int len(String s);
}

public class OneParamAndReturn
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		HowLong h1 = s -> s.length();
		System.out.println(h1.len("I am so happy"));
	}

}
