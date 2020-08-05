package wildcardunboxer2;

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
	
	@Override
	public String toString()
	{
		return ob.toString();
	}
}

class Unboxer
{
	public static <T> T openBox(Box<T> box)
	{
		return box.get();
	}
	
	public static <T> void peekBox(Box<?> box)
	{
		System.out.println(box);
	}
}


public class WildcardUnboxer2
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Box<String> box = new Box<>();
		box.set("So Simple String");
		Unboxer.peekBox(box);
	}

}
