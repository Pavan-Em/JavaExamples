package CONVERSIONS;
			//String to int and int[]
public class p6 {
	public static void main(String[] args) {
		String s="456522";
		System.out.println("String:"+s);
		int num=0;
		for(int i=0;i<s.length();i++)
		{
			num=num*10+(s.charAt(i)-'0');
		}
		System.out.println("Number:"+num);
		int[] numarray=new int[s.length()];
		for(int i=0;i<s.length();i++)
		{
			numarray[i]=s.charAt(i)-'0';
		}
		System.out.print("Arrays:");
		for(int i=0;i<numarray.length;i++)
		{
			System.out.printf("%d ",numarray[i]);
		}
	}
}
