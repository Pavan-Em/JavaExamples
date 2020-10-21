class p2
{
	public static void main(String[]args)
	{
		char ch='a';
		if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
		{
			switch(ch)
			{
				case 'a':{ System.out.println(ch+" is an vowel");}
				        break;
				case 'e':{ System.out.println(ch+" is an vowel");}
				        break;
				case 'i':{ System.out.println(ch+" is an vowel");}
				        break;
				case 'o':{ System.out.println(ch+" is an vowel");}
				        break;
				case 'u':{ System.out.println(ch+" is an vowel");}
				        break;
				case 'A':{ System.out.println(ch+" is an vowel");}
				        break;
				case 'E':{ System.out.println(ch+" is an vowel");}
				        break;
				case 'I':{ System.out.println(ch+" is an vowel");}
				        break;
				case 'O':{ System.out.println(ch+" is an vowel");}
				        break;
				case 'U':{ System.out.println(ch+" is an vowel");}
				        break;
				default:{System.out.println(ch+" is a consonent");}
			}
		}
			else  
				System.out.println(ch+" is not a Alphabet");
}
}