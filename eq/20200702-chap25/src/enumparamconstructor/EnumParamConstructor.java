package enumparamconstructor;

enum Person
{
	MAN(29),WOMAN(25);
	
	int age;
	private Person(int age)
	{
		this.age = age;
	}
	
	@Override
	public String toString()
	{
		return "I am " + age + " years old";
	}
}

public class EnumParamConstructor
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
			
		System.out.println(Person.MAN);
		System.out.println(Person.WOMAN);

	}

}
