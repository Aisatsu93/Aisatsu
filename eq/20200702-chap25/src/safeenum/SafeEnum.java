package safeenum;

enum Animal
{
	DOG, CAT
}

enum Person
{
	MAN, WOMAN
}

public class SafeEnum
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		who(Person.MAN);
		// who(Animal.DOG); ������ ����
	}
	
	public static void who (Person man)
	{
		switch (man)
		{
		case MAN:
			System.out.println("���� �մ��Դϴ�.");
			break;

		case WOMAN:
			System.out.println("���� �մ��Դϴ�.");
			break;
			
		}
	}

}
