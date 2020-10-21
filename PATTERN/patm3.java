class patm3
{
	public static void main(String[]args)
	{
		int n=7;
		int m=(n/2)+1;
		char c,ch;
		c='a'; ch='a';
		for (int i=0;i<m;i++ )
		{
			ch='a';
			for (int j=0;j<m ;j++ )
			{
				if(i>=j)
				{
					System.out.print(c--+" ");
					ch++;
				}
			}
			c=ch;
			System.out.println();
		}
		for (int i=0;i<m-1;i++ )
		{
			for (int j=0;j<m-1;j++ )
			{
				if((i+j)<=m-2)
				{
					System.out.print(c--+" ");
					
				}
			}
			ch++;
			c=ch;
			System.out.println();
		}
}
}
//OUTPUT
/*  a
    b a
	c b a
	d c b a 
	e d c
	f e 
	g                    */