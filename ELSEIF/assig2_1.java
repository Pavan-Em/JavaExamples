class assig2_1
{
	public static void main(String[]args)
	{
	char x='a';
	if(x>='a' && x<='z' || x>='A' && x<='Z')
	{
	switch(x)
	{
	case 'a':System.out.println(x+"is a vowel");
		break;
	case 'e':System.out.println(x+"is a vowel");
		break;
	case 'i':System.out.println(x+"is a vowel");
		break;
	case 'o':System.out.println(x+"is a vowel");
		break;
	case 'u':System.out.println(x+"is a vowel");
		break;
	default:System.out.println(x+"is an alphabet");
	}
	}
	else
	System.out.println(x+"is not an alphabet");
	}
}