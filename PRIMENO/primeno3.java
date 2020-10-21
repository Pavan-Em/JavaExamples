class primeno3
{
	public static void main(String[]args)
	{
	 int n=97;
	 int x=0;
	  int i;
	 for ( i=2;i<n;i++)
	{
	  if (n%i==0)
	   {
	    x++;
	    System.out.print(n +" is not a prime num");
	    break;
	   }
	}
	switch(x)
	{
	case 0:System.out.print(n +"is a prime no");
	}
	}
}