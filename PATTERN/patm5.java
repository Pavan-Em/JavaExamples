class patm5
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
					if(x==4)
					{
						System.out.print(x +" ");
						x=0;
					}
					else
						System.out.print(x++ +" ");
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
   1 2
   2 3 4
   3 4 0 1
   4 0 3 2 1 */