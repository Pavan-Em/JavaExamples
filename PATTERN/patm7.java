class patm7
{
	public static void main(String[]args)
	{
		int n=5;
		int x=0;
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<n ;j++ )
			{
				System.out.print(x++ +" ");
			}
			x=i+1;
			System.out.println();
		}
	}
}
//OUTPUT
/*  0 1 2 3 4
    1 2 3 4 5
	2 3 4 5 6
	3 4 5 6 7
	4 5 6 7 8       */