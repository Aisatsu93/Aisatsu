package roto;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class Rotto
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		
		int[] array = new int[5];
		
		int a = 0;
		
		for (int i = 0; i < 5; i++)
		{
			a = (int) (Math.random()*45) + 1;
			array[i] = a;
			
			for (int j = 0; j < i; j++)
			{
				if(array[i] == array[j])
				{
					i--;
					break;
				}
			}
		}
	
		for (int i = 0; i < array.length; i++)
		{
			
			System.out.println(array[i]);

		}
	}
}
