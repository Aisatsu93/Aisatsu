package genericmethodboxmaker2;

class Box<T> {
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

class Unboxer {
	public static <T> T openBox(Box<T> Box) {
		return Box.get();
	}
}

public class GenericMethodBoxMaker2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<String> box = new Box<>();
		box.set("My Generic Method");
		
		String str = Unboxer.<String>openBox(box);
		System.out.println(str);
	}

}
