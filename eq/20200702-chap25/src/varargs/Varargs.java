package varargs;

public class Varargs
{

	public static void showAll(String...vargs)
	{
		// TODO Auto-generated method stub
		System.out.println("LEN: " + vargs.length);
		
		for (String s : vargs)
			System.out.print(s + '\t');
		System.out.println();
	}

	public static void main(String[] args)
	{
		showAll("Box");
		showAll("Box", "Toy");
		showAll("Box", "Toy", "Apple");
		
	}
}
