class assigpatt2
{
	public static void main(String[]args)
	{
	int n=5;
	for (int i=0;i<n-1;i++)
	{
	char ch='a';
	  for (int j=0;j<n;j++)
	{
	   if (i>=j)
	   System.out.print(j+1);
	   else
	   System.out.print(ch++);
	}
	System.out.println();
	}
	}
}

/* OUTPUT
   1abcd
   12abc
   123ab
   1234a   */