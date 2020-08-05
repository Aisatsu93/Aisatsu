package maze;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
public class MazeSolve {
	private static final String PATH = "0";
	private static final String WALL = "1";
	private static final String BLOCKED = "9";
	private static final String ROUTE = "7";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader br = new BufferedReader(
					new InputStreamReader(new FileInputStream(new File("src/maze/map.txt"))));

			int row = 0, col = 0;
			String[] xy = br.readLine().split(" ");
			row = Integer.parseInt(xy[0]);
			col = Integer.parseInt(xy[1]);

			String[][] map = new String[row][col];
			for (int i = 0; i < row; i++) {
				String line = br.readLine();
				String[] pixel = line.split(" ");
				for (int j = 0; j < col; j++) {
					map[i][j] = pixel[j];
				}

			}
			printMap(map);
			if (hasRoute(map, 0, 0)) {
				System.out.println("HasRoute");
			} else {
				System.out.println("Doesn't have");
			}

			printMap(map);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void printMap(String[][] map) {
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static boolean hasRoute(String[][] map, int r, int c)
	{
		boolean result = false;
		if(r < 0 || c<0 || r>=map.length || c>=map[0].length)
		{
			return result;
		}
		else if(map[r][c].equals(BLOCKED) || map[r][c].equals(WALL))
		{
			return result;
		}
		else if(r == (map.length-1) && c == (map[0].length-1))
		{
			map[r][c] = ROUTE;
			result = true;
			return result;
		}
		else if(map[r][c].equals(PATH))
		{
			map[r][c] = ROUTE;
			if (hasRoute(map, r-1, c) || hasRoute(map, r, c-1) || hasRoute(map, r+1, c) || hasRoute(map, r, c+1))
			{
				map[r][c] = ROUTE;
				return true;
			}
			else 
			{
				map[r][c] = BLOCKED;
				return false;
			}
		}
		return result;
	}

}
