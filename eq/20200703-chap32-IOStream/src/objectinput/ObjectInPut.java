package objectinput;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInPut
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		try(ObjectInputStream oi = new ObjectInputStream(new FileInputStream("Object.bin")))
		{
			sbox.SBox box1 = (sbox.SBox) oi.readObject();
			System.out.println(box1.get());
			sbox.SBox box2 = (sbox.SBox) oi.readObject();
			System.out.println(box2.get());
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
