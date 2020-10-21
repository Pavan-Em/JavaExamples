class pat2
{
	public static void main(String[]args)
	{
		int n=5;
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<n ;j++ )
			{
				if((i+j)>=n-1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		for (int i=0;i<n-1 ;i++ )//diff....row reduces
		{
			for (int j=0;j<n ;j++ )//diff....columns same
			{
				if(i<j)//diff.... !=(i==j)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}