package revnum;

public class revnum
{
	public static int renum(int a)
	{
		int rev=0;
		while(a!=0)
			{
				int r=a%10;
				rev=rev*10+r;
				a=a/10;
			}
			return rev;
	}
}