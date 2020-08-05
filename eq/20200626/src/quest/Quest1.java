package quest;

import java.util.Scanner;

public class Quest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("입력 : ");
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		
		sc.close();
		
		String[] array1;
		String[] array2;
		
		array1 = a.split("");
		array2 = a.split("");
	
		
		
		for (int i = 0; i < array1.length; i++)
		{
			
			int count = 0;
				
			for (int j = 0; j < array2.length; j++)
			{
				if (array1[j].equals(array2[i]))
				{
					count += 1;
				}
			}
			
			
			System.out.println(array1[i]+"는 "+count+"글자 입니다.");
		}
		
	}

}
