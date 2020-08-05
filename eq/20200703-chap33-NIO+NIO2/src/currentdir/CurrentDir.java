package currentdir;

import java.nio.file.Path;
import java.nio.file.Paths;

public class CurrentDir
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Path cur = Paths.get("");
		String cdir;
		
		if (cur.isAbsolute())
		{
			cdir = cur.toString();
		}
		else
		{
			cdir = cur.toAbsolutePath().toString();
		}
		System.out.println("Current dir: " + cdir);
	}

}
