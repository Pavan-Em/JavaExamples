package DIXIT;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class e5 {
	public static void main(String[] args) {
	if(createfile("S:\\abc.txt")==null)
		System.out.println("file not created");
	else
		System.out.println("file created");
	}
	
	static FileOutputStream createfile(String path)
	{
		try
		{
			return new FileOutputStream(path);
		}
		catch(FileNotFoundException e)
		{
			return null;
		}
	}
}
