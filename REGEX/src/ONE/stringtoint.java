package ONE;

public class stringtoint {

	public static void main(String[] args) {
		
		String s="945812";
		
		//converting string to int array
		int[] si=new int[s.length()];
		for(int i=0;i<si.length;i++)
		{
			si[i]=s.charAt(i)-'0';
		}
		for(int i:si)
		{
			System.out.println(i);
		}
		
		//converting String to int
		int sw=Integer.parseInt(s);
		System.out.println(sw);
		
		//anoyher method
		int sw2=0;
		for(int i=0;i<s.length();i++)
		{
			sw2=sw2*10+s.charAt(i)-'0';
		}
		System.out.println(sw2);
	}
}
