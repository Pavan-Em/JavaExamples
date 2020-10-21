class assig2
{
	public static void main(String[]args)
	{
	char val='e';
	if(val>='a' && val<='z' || val>='A' && val <='Z')
	{
		if(val=='a'||val=='e'||val=='i'||val=='o'||val=='u'||val=='A'||val=='E'||val=='I'||val=='O'||val=='U')
		{
		System.out.println(val+"is a vowel");
		}
		else
		{
		System.out.println(val+"is an Alphabet");
		}
	}
		else
		System.out.println(val+"is not an Alphabet");
	
	}
}