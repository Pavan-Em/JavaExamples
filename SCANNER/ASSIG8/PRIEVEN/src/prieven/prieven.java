package prieven;

public class prieven
{
	public static void printeven(int m,int n)
	{
		System.out.println("Even numbers between m and N");
		int x=0;
		if(m<=n)
		{
			for(;m<=n;m++)
			{
				if(m%2==0)
				{
					System.out.print(m+" ");
					x++;
				}
			}
			if(x==0)
				System.out.println("No even num between m and n");
		}
		else
			System.out.println("m should be less then n");
	}

}