package enumconst;

enum Person 
{
	MAN,WOMAN;
	
	@Override
	public String toString()
	{
		return "I am a dog person";
	}
}

public class EnumConst
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println(Person.MAN);
		System.out.println(Person.WOMAN);
	}

}
