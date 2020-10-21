package ONE;

import java.util.Scanner;

public class a10 {
	public static void main(String[] args) {
		
		try
		{
		String st="heheh ohohho";
		Scanner s=new Scanner(st);
		s.close();
		while(s.hasNext()) {
			System.out.println(s.next());
		}
		s.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
