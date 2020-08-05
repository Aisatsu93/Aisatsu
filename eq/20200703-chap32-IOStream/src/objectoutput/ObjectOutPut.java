package objectoutput;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutPut
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		sbox.SBox box1 = new sbox.SBox("Robot");
		sbox.SBox box2 = new sbox.SBox("Strawberry");
		
		try(ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream("Object.bin")))
		{
			oo.writeObject(box1);
			oo.writeObject(box2);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
