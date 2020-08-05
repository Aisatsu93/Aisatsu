package bufferedfilecopier;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class BufferedFileCopier
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("��� ���� : ");
		String src = sc.nextLine();
		
		System.out.println("�纻 �̸�: ");
		String dst = sc.nextLine();
		
		try (InputStream in = new FileInputStream(src); OutputStream out = new FileOutputStream(dst))
		{
			byte buf[] = new byte[1024];
			int len;
			
			while (true)
			{
				len = in.read();
				if (len == -1)
				{
					break;
				}
				out.write(buf, 0, len);
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}
