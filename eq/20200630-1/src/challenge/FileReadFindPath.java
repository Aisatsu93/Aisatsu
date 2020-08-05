package challenge;

import java.io.*;

public class FileReadFindPath {
	private static final String PATH = "0";
	private static final String WALL = "1";
	private static final String BLOCKED = "9";
	private static final String ROUTE = "7";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			//���� �д� ���
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File("src/challenge/path.txt"))));
			
			//y = ��, x = ��
			int y=0, x=0;
			String[] xy = 
					br.readLine().split(" "); //�� ���� �е�, �������� string�� �ڸ���.  ex) 8 8 �� ��� [0]=8 [1]=8
			y = Integer.parseInt(xy[0]);
			x = Integer.parseInt(xy[1]);
			
			String[][] map = new String[x][y];
			for (int i = 0; i<y; i++)
			{
				String line = br.readLine();
				String[] pixel = line.split(" ");
				for(int j=0; j<x; j++)
				{
					map[i][j] = pixel[j];
				}
			}
			printMap(map);
			
		}catch (Throwable e) {
			// TODO: handle exception
		}
	}
	
	public static void printMap(String[][] map)
	{
		for(int i = 0; i<map.length;i++)
		{
			for(int j = 0; j<map[i].length; j++)
			{
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}

}
