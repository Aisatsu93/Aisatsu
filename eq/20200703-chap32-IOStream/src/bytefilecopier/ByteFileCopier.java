package bytefilecopier;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class ByteFileCopier
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
			int data;
			while (true)
			{
				data = in.read();
				if(data == -1)
				{
					break;
				}
				out.write(data);
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}
