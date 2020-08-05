package read7fromfile2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Read7FromFile2
{

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		InputStream in = null;
		
		try
		{
			in = new FileInputStream("data.dat");
			int dat = in.read();
			System.out.println(dat);
		}
		finally
		{
			if(in != null)
				in.close();
		}
	}

}
