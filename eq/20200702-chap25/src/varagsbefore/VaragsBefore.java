package varagsbefore;

public class VaragsBefore
{
	
	public static void showAll(String...vargs)
	{
		System.out.println("LEN: " + vargs.length);
		
		for(String s : vargs)
		{
			System.out.print(s+'\t');
		}
		System.out.println();
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		showAll(new String[] {"Box"});
		showAll(new String[] {"Box", "Toy"});
		showAll(new String[] {"Box", "Toy", "Apple"});
		
	}

}
