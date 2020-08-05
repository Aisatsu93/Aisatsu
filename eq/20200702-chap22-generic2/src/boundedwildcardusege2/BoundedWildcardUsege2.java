package boundedwildcardusege2;

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

class BoxHandler
{
	public static void outBox(Box<? extends Toy> box)
	{
		Toy t = box.get();
		System.out.println(t);
	}
	public static void inBox(Box<? super Toy> box, Toy n)
	{
		box.set(n);
	}
}

public class BoundedWildcardUsege2
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Box<Toy> box = new Box<>();
		BoxHandler.inBox(box, new Toy());
		BoxHandler.outBox(box);
	}

}