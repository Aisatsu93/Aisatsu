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
		// who(Animal.DOG); 컴파일 오류
	}
	
	public static void who (Person man)
	{
		switch (man)
		{
		case MAN:
			System.out.println("남성 손님입니다.");
			break;

		case WOMAN:
			System.out.println("남성 손님입니다.");
			break;
			
		}
	}

}
