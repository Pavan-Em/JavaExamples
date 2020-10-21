package Day02;

public class demo06 {

	public static void main(String[] args) {
		
		StringBuilder s1 = new StringBuilder("pavan");
		System.out.println(s1);
		StringBuilder s2 = new StringBuilder();
		for(int i=0 ; i<s1.length();i++)
		{
			if(s1.charAt(i)>='a' && s1.charAt(i)<='z')
				s2.append((char)(s1.charAt(i)-32));
			else
				s2.append(s1.charAt(i));
		}
		
		System.out.println(s2.toString());
		
		System.out.println(s1.reverse());
	}
}
