package answer;

import java.util.Scanner;

public class Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 2; i< 10; i++)
		{
			for (int j = 1; j < 10; j++)
			{
				int gop = i * j;
				System.out.println(String.format("%d * %d = %d", i, j, gop));
			}
		}
		
		Scanner sc = new Scanner(System.in);
		
		String start = "1";
		int nth = sc.nextInt();

		
		sc.close();
	
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
