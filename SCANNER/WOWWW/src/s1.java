import java.util.*;

class s1
{
	public static void main(String[]args)
	{
		String s1="54 4545  sas 45454 45454";
		Scanner s=new Scanner(s1);
		System.out.println(s.hasNext());//true
		while(s.hasNextInt())//it stops execution at 4545
		{
			System.out.println(s.nextInt());
		}
		System.out.println(s.hasNext());//true bcoz while stop exe when it sees string so hasNext() returns true
		String ss="pavan";
		System.out.println(ss.charAt(0));
	}
}


//s.hasNext() search stirng inside scanner and returns true or false like that
//s.hasNextInt() 
//s.hasNextDouble()
//s.hasNextLine()