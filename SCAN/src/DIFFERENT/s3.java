package DIFFERENT;
import java.util.Scanner;
public class s3 {
	public static void main(String[] args) {
		String s="hey man 23 25 ohoh 24";
		Scanner sc=new Scanner(s);
		sc.useDelimiter("[^A-Za-z]+");
		String[] st=new String[10];
		int i=0;
		while(sc.hasNext())
		{
			System.out.println(sc.next());
			st[i++]=sc.next();
		}
		
		for(int k=0;k<st.length;k++)
		{
			System.out.println(st[k]);
		}
		
		
	}
}
