package write7tofile2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Write7ToFile2
{

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		OutputStream out = null;
		
		try
		{
			out = new FileOutputStream("data.dat");
			out.write(7);
		}
		finally
		{
			if(out != null)
				out.close();
		}
	}

}
