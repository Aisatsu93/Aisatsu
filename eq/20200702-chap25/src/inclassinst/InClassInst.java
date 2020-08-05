package inclassinst;

class Person
{
	public static final Person MAN = new Person();
	public static final Person WOMAN = new Person();
	
	@Override
	public String toString()
	{
		return "I am a dog person";
	}
}

public class InClassInst
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println(Person.MAN);
		System.out.println(Person.WOMAN);
	}

}
