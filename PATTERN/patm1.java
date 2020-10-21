class patm1
{
	public static void main(String[]args)
	{
		int x=1;
		int n=5;
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<n ;j++ )
			{
				if(i>=j)
				{
					
					System.out.print(x+" ");
					if(x==1)
						x--;
					else
						x++;
					
				}
				
			}
			System.out.println();
			}
		}
}
//OUTPUT
/* 1
   0 1
   0 1 0
   1 0 1 0
   1 0 1 0 1 */