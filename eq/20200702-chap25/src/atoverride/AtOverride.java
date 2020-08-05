package atoverride;

interface Viewable
{
	public void showIt(String str);
}

class Viewer implements Viewable
{
	@Override
	public void showIt(String str)
	{
		System.out.println(str);
	}
}

public class AtOverride
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Viewable view = new Viewer();
		view.showIt("Hello Annotations");
	}

}
