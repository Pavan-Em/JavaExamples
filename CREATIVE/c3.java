class c3
{
	public static void main(String[]args)
	{
		int i,j,k,l;
		i=2;j=3;k=5;l=9;
		int a=++i*l/j;
		System.out.println(a);
		a=l/j * ++i;//here i becomes 4
		System.out.println(a);
	}

}