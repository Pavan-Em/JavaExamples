class assig3_4
{
	public static void main(String[]args)
	{
	int m=5;
	int n=5;
	int p=0;
	int x=0;
	if (m <= n)
	{
	
	     while (m <= n)
	      {
		if (m%6 == 0 && m%7 == 0)
		{
		System.out.println(m+" is divi by both 6 and 7");
		p++;
		}
		x++;
		m++;
	      }
	   switch (p)
		{ 
		case 0: System.out.println("no num between "+(m-x)+" and "+n+" is divi by 6 and 7");
		}
	 }
	else
	System.out.println("m should be less than n");
	}
}