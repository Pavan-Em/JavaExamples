class p1
{
	public static void main(String[]args)
	{
		char ch='a';
		if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
			System.out.println(ch+" is a Alphabet");
		else if(ch<='0' && ch>='9')
			System.out.println(ch+" is a Number");
		else if (ch==' ')
			System.out.println(ch+" is a space");
		else
			System.out.println(ch+" is special char");
	}
}