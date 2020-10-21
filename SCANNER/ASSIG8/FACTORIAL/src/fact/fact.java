package fact;

public class fact
{
	public static int facto(int a)
	{
		if(a==1)
			return 1;
		return facto(a-1)*a;
	}
}