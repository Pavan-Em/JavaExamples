class assig3_1
{
	public static void main(String[]args)
	{
	int m=100;
	int n=10;
	int p=0;
	if (m <= n)
	{
	while (m <= n)
	{
		if (m%2 != 0)
		{
		p++;
		}
	m++;
	}
	System.out.println("there are"+ p +"odd num");

	}
	else
	System.out.println("m should be less than n");
	}
}