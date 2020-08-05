package boundedwildcardgenericmethod;

class Box<T>
{
	private T ob;
	public void set(T o)
	{
		ob = o;
	}
	public T get()
	{
		return ob;
	}
}

class Toy
{
	@Override
	public String toString()
	{
		return "I am a Toy";
	}
}

class Robot
{
	@Override
	public String toString()
	{
		return "I am a Robot";
	}
}

class BoxHandler
{
	public static <T> void outBox(Box<? extends T> box)
	{
		T t = box.get();
		System.out.println(t);
	}
	public static <T> void inBox(Box<? super T> box, T n)
	{
		box.set(n);
	}
}

public class BoundedWildcardGenericMethod
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Box<Toy> tbox = new Box<>();
		BoxHandler.inBox(tbox, new Toy());
		BoxHandler.outBox(tbox);
		
		Box<Robot> rbox = new Box<>();
		BoxHandler.inBox(rbox, new Robot());
		BoxHandler.outBox(rbox);
	}

}
