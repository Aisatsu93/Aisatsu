package answer;

import java.util.Scanner;

public class QuestionAndAnswer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1�� ����
		//�Ƕ�̵� ����
		
		System.out.println("1�� ����");
		System.out.println("�� ������ ������?");
		Scanner s = new Scanner(System.in);
		int floor = 0;
		
		try //����ó��
		{
			floor = s.nextInt();
		} catch (Exception e) {
			System.out.println("����!!!");
			
			e.printStackTrace();
		} finally
		{
			System.out.println("asdf");
		}
		
		System.out.println("asdf");
		
		for (int i = 0; i < floor; i++)
		{
			for (int j = floor; j >= i; j--)
			{
			System.out.print(" ");
			}
			for (int k = 0; k < 2 * i + 1; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("2�� ����");
		int max;
		int min;
		max = Integer.MIN_VALUE;
		min = Integer.MAX_VALUE;
		for (int i = 0; i < 5; i++)
		{
			int compareValue =  s.nextInt();
			if(compareValue > max)
			{
				max = compareValue;
			}
			if(compareValue < min)
			{
				min = compareValue;
			}
			
		}
		System.out.println
		//("max : " + max + ", min : " + min );
		(String.format("max : %d, min %d", max, min));
		

		String start = "1";
		int nth = s.nextInt();
		s.close();
		
		for (int i = 0; i<nth; i++)
		{
			System.out.println((i+1)+"��°: " + start);
			String end = ""; //������ Ȥ�� ���� �����ִ� ��
			char number = start.charAt(0); //�� �� ���� ���ؾ� �ϴ� ����
			int count = 0; //����Ű�� ������ ����
			for (int j = 0; j < start.length(); j++)
			{
				//����Ű�� ���ڶ� �ٸ� ���ڰ� ������ ���
				if(number != start.charAt(j))
				{
					end = end + number + count;
					number = start.charAt(j);
					count = 1;
				}
				else // number == start.chatAt(j)
				{
					count++;
				}
			}
			end  = end + number + count;
			start = end;
		}
		
	}

}
