package bufferedstreamfilecopier;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class BufferedStreamFileCopier
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("��� ���� : ");
		String src = sc.nextLine();
		
		System.out.println("�纻 �̸�: ");
		String dst = sc.nextLine();
		
		try(BufferedInputStream in = new BufferedInputStream(new FileInputStream(src));
				BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(dst)))
		{
			int data;
			while(true)
			{
				data = in.read();
				if(data == -1)
				{
					break;
				}
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
