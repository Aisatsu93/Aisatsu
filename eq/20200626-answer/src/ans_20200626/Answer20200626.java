package ans_20200626;

import java.io.*;
import java.util.Arrays;

public class Answer20200626 {
	public static void main(String[] args) {
		//1�� ����
		//�Էµ� ���ڿ�(��, ���ĺ��ҹ��ڸ� �Է��� ��)���� ������ ���ĺ� ���ڰ� �� �� ������ ����Ͻÿ�.
		//���Ե��� �ʴ� ���ĺ��� 0���̶�� ǥ���ϰų� ǥ�� ���� �ʾƵ� �ȴ�.
		int qNum = 0;
		try {
			qNum = 1;
			System.out.println("1�� ����");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			String N = br.readLine();
			System.out.println(N);
			int[]alphabet = new int[26];
//			Arrays.fill(alphabet, -1);
			for(int i = 0; i<N.length(); i++)
			{
				//97 - a, 122 - z
				int index = N.charAt(i) - 97;
				alphabet[index]++;
			}
			for(int i = 0; i<26; i++)
			{
				if(alphabet[i] != 0) //�� ���� ������ ���� �� �����ϴ� ��
				{
					String sentense = "'"+(char)(i+97)+"'"+"�� "+alphabet[i]+"�� �Դϴ�.\n";
					bw.write(sentense);
				}
			}
			bw.flush();

			
			//2�� ����
			qNum = 2;
			System.out.println("2�� ����");
			//�Էµ� ���ĺ�(��,�ҹ���)���� ������ ���ĺ� ���ڰ� ���ʷ� �����ϴ� ��ġ�� �����ÿ�. 
			//97 - a, 122 - z
			String N2 = br.readLine();
			System.out.println(N2);
			int size = N2.length();
			Arrays.fill(alphabet, -1);
			for(int i = 0; i < size; i++)
			{
				int index = N2.charAt(i) - 97;
				if(alphabet[index] == -1)
					alphabet[index] = i;
				
			}
			for(int i = 0; i<26; i++)
			{
				if(alphabet[i]!=-1)
				{
					String sentense = "'"+(char)(i+97)+"'"+"�� "+(alphabet[i]+1)+"��°�� ó�� ���ɴϴ�.\n";
					bw.write(sentense);
				}
			}
			bw.flush();

			//3�� ����
			qNum = 3;
			System.out.println("3�� ����");
			//�־��� ��ȣǥ�� �̿��Ͽ� �Էµ� ��ȣ�� ���� �ص��Ͻÿ�.
			//97 - a, 122 - z
			String N3 = br.readLine();
			System.out.println(N3);
			char[] test = new char[] 
					{'��', '��', '��','��','��','��','��','��','��','��','��','��','��','��',
					 '��','��','��','��','��','��','��','��','��','��'};
			String N4 = "";
			for(int i = 0; i<N3.length(); i++)
			{
				N4 = String.valueOf(test[N3.charAt(i)-(int)'a']);
				bw.write(N4);
			}
			bw.flush();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(qNum+"��°���� " + "���� �߻�!");
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}
		
	}
}
