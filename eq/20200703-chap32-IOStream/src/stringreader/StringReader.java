package stringreader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StringReader
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		try(BufferedReader br = new BufferedReader(new FileReader("String.txt")))
		{
			String str;
			while(true)
			{
				str = br.readLine();
				if(str == null)
				{
					break;
				}
				System.out.println(str);
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
