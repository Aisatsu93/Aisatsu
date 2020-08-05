package targettypes;

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

class EmptyBoxFactory
{
	public static <T> Box<T> makeBox()
	{
		Box<T> box = new Box<T>();
		return box;
	}
}

public class TargetTypes
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Box<Integer> iBox = EmptyBoxFactory.<Integer>makeBox();
		iBox.set(25);
		System.out.println(iBox.get());
	}

}
