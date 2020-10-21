class patm2
{
	public static void main(String[]args)
	{
		int n=5;char c='a';
		for (int i=0;i<n ;i++ )
		{
			char ch='a';
			for (int j=0;j<n ;j++ )
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
	}
}

//OUTPUT
/* a
   b a
   c b a
   d c b a
   e d c b a */