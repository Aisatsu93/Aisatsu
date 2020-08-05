package write7tofile3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Write7ToFile3
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		OutputStream out = null;
		
		try
		{
			out = new FileOutputStream("data.dat");
			out.write(7);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
