class assig3_3
{
	public static void main(String[]args)
	{
	int m=10;
	int n=4;
	int p=0;
	int x=0;
	if (m <= n)
	{
	 if (m != n)
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
		{ case 0: System.out.println("any num between "+(m-x)+" and "+n+" is divi by 6 and 7");}
	 }
	else if(m == n)
	{
	 if (m%6 == 0 && m%7 == 0)
	  {
	   System.out.println(m+"is divi by both 6 and 7");
	  }
	 else
	  System.out.println("any num between "+m+" and "+n+" is divi by 6 and 7");
	}
	}
	else
	System.out.println("m should be less than n");
	}
}