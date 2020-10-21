package ONE;

import java.util.Scanner;

public class s2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=10;
		final int y=20;
		
		switch(x+1)
		{
		case 10: System.out.println("x");
		break;
		case 10+10:System.out.println("y");
		break;
		}
		
		//special case
		byte a=10;
		switch(a)
		{
		case 10:
			break;
		case 100:
			break;
		case (byte) 1000:
			break;
		}
	}
}
