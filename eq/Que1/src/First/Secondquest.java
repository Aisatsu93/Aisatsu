package First;

import java.util.Scanner;

public class Secondquest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("���� �� �� �ΰ���(���ڸ� �Է��ϼ���.)");
		
		Scanner scan = new Scanner(System.in);
		
		int month = scan.nextInt();
		
		scan.close();
		
		if (month == 12 || month < 3)
		{
			System.out.println("�ܿ�");
		}
		else if (month >= 3 && month < 6)
		{
			System.out.println("��");
		}
		else if (month >= 6 && month < 9)
		{
			System.out.println("����");
		}
		else
		{
			System.out.println("����");
		}
	}

}
