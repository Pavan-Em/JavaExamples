class patm4
{
	public static void main(String[]args)
	{
		int n=5;
		int x=0;
		for (int i=0;i<n ;i++ )
		{
			int y=0;
			for (int j=0;j<n ;j++ )
			{
				if(i>=j)
				{
					System.out.print(x--+" ");
					y++;
				}
			}
			x=y;
			System.out.println();
		}
	}
}
//OUTPUT
/* 0
   1 0
   2 1 0
   3 2 1 0
   4 3 2 1 0 */