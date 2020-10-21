class P
{
	public static void main(String[]args)
	{
		int n=5;int x=1;
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<n ;j++ )
			{
				if(i+j==n-1)
				{
					System.out.print("*     ");
					x++;
				}
				else
					System.out.print(x+++"     ");

			}
			System.out.println();
		}
	}
}
/* OUTPUT
   
   1    2   3   4   *
   6    7   8   *   10
   11   12  *  14   15
   16   *  18  19   20
   *   22  23  24   25      */