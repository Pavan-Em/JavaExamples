package NUMBER;

import java.util.Arrays;

public class anargams {
	static int num=256;
	public static void main(String[] args) {
		String s1="pavan";
		String s2="NaVap";
		if(check(s1,s2))
			System.out.println("Anargams");
		else
			System.out.println("Not Anargams");
	}
	
	public static boolean check(String s1,String s2)
	{
		s1=s1.toLowerCase().replaceAll("\\s", "");
		s2=s2.toLowerCase().replaceAll("\\s", "");
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		int[] count1=new int[num];
		int[] count2=new int[num];
		if(s1.length()==s2.length())
		{
			for(int i=0;i<ch1.length;i++)
			{
				count1[ch1[i]]++;
				count2[ch2[i]]++;
			}
			System.out.println(Arrays.toString(count1));
			System.out.println(Arrays.toString(count2));
			for(int i=0;i<count1.length;i++)
			{
				if(count1[i]!=count2[i])
					return false;
			}
		}
		else
			return false;
		return true;
	}
}
