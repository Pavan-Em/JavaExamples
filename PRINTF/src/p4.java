class p4
{
	public static void main(String[]args)
	{
		System.out.printf("%s %s %s\n","5","6","7");
		System.out.printf("%1$s %1$s %1$s\n","5","6","7");
		System.out.printf("%1$d %1$d %1$d\n",5,6,7);
		System.out.printf("%1$s %1$s %1$s\n","5","6","7");
		System.out.printf("%2$s %3$s %1$s\n","5","6","7");
		System.out.printf("%2$s %s %2$s\n","5","6","7");
		System.out.printf("%2$s %<s %<s\n","5","6","7");
		System.out.printf("%2$s %s %<s\n","5","6","7");
		//System.out.printf("%<s %1$s %1$s\n","5","6","7");//ERROR
		System.out.printf("%1$s %2$s\n","1");
	}
}