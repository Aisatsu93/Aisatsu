package ans_20200626;

import java.io.*;
import java.util.Arrays;

public class Answer20200626 {
	public static void main(String[] args) {
		//1번 문제
		//입력된 문자열(단, 알파벳소문자만 입력할 것)에서 각각의 알파벳 글자가 몇 번 들어갔는지 출력하시오.
		//포함되지 않는 알파벳은 0번이라고 표기하거나 표기 하지 않아도 된다.
		int qNum = 0;
		try {
			qNum = 1;
			System.out.println("1번 문제");
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
				if(alphabet[i] != 0) //한 번도 나오지 않은 건 제외하는 법
				{
					String sentense = "'"+(char)(i+97)+"'"+"는 "+alphabet[i]+"개 입니다.\n";
					bw.write(sentense);
				}
			}
			bw.flush();

			
			//2번 문제
			qNum = 2;
			System.out.println("2번 문제");
			//입력된 알파벳(단,소문자)에서 각각의 알파벳 글자가 최초로 등장하는 위치를 적으시오. 
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
					String sentense = "'"+(char)(i+97)+"'"+"는 "+(alphabet[i]+1)+"번째에 처음 나옵니다.\n";
					bw.write(sentense);
				}
			}
			bw.flush();

			//3번 문제
			qNum = 3;
			System.out.println("3번 문제");
			//주어진 암호표를 이용하여 입력된 암호의 뜻을 해독하시오.
			//97 - a, 122 - z
			String N3 = br.readLine();
			System.out.println(N3);
			char[] test = new char[] 
					{'ㄱ', 'ㄴ', 'ㄷ','ㄹ','ㅁ','ㅂ','ㅅ','ㅇ','ㅈ','ㅊ','ㅋ','ㅌ','ㅍ','ㅎ',
					 'ㅏ','ㅑ','ㅓ','ㅕ','ㅗ','ㅛ','ㅜ','ㅠ','ㅡ','ㅣ'};
			String N4 = "";
			for(int i = 0; i<N3.length(); i++)
			{
				N4 = String.valueOf(test[N3.charAt(i)-(int)'a']);
				bw.write(N4);
			}
			bw.flush();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(qNum+"번째에서 " + "오류 발생!");
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}
		
	}
}
