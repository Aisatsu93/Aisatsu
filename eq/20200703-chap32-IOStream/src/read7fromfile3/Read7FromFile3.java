package read7fromfile3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Read7FromFile3
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		InputStream in = null;
		
		try
		{
			in = new FileInputStream("data.dat");
			int dat = in.read();
			System.out.println(dat);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}