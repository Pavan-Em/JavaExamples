class prob4
{
	public static void main(String[]args)
	{
	int m=5;
	int n=5;
	if (m<=n)
	{
	 if(m==n)
		{
		if (m%2 != 0)
		{
		System.out.println("there is no even num between"+m+"and"+n);
		}
		}
	
	 else if (m <=n)
	 {
	  while (m <= n)
	  {
	   if (m%2 == 0)
	  {
	   System.out.println(m);
	  }
	  m++;
	  }
	 }
	}
	else
	{
	System.out.println("m should be less than n");
	}
	}
}