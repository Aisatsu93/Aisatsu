package quest;

import java.util.Date;
import java.util.Scanner;


public class Quset2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		String select;
		

		System.out.println("�̸� : ");
		
		name = sc.next();
		
		System.out.println(name);
		
		while (true)
		{
			
			System.out.println("�Է� : ");
			
			select = sc.next();
			
			
			if (select.equals("������"))
			{
				for (int i = 2; i< 10; i++)
				{
					for (int j = 1; j < 10; j++)
					{
						int gop = i * j;
						System.out.println(String.format("%d * %d = %d", i, j, gop));
					}
				}
			}
			else if (select.equals("����ð�") == true)
			{
				Date today = new Date();
				System.out.println(today);
			}
			else if (select.equals("����"))
			{
				String start = "1";
				int nth = sc.nextInt();
			
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
			else if(select.equals("����"))
				break;
		}
		
		sc.close();
	}

}
