package nonsafeconst;

interface Animal
{
	int DOG = 1;
	int CAT = 2;
}

interface Person
{
	int MAN = 1;
	int WOMAN = 2;
}

public class NonSafeConst
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		who(Person.MAN);
		who(Animal.DOG);
	}
	
	public static void who(int man)
	{
		switch(man)
		{
		case Person.MAN:
			System.out.println("���� �մ��Դϴ�.");
			break;
		case Person.WOMAN:
			System.out.println("���� �մ��Դϴ�.");
			break;
		}
		
	}

}
