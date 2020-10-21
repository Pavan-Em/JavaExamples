

			//char[] to String[]

package CONVERSIONS;
import java.util.Arrays;
public class p5 {
	public static void main(String[] args) {
		char[] ch= {'a','b','c'};
		System.out.println("char[]:"+Arrays.toString(ch));
		System.out.println("=======================");
		String s=Arrays.toString(ch).replaceAll("\\[|\\]|,|\\s", "");
		System.out.println("String:"+s);
		System.out.println("==========================");
		String[] st=s.split("");
		System.out.println("String[]:"+Arrays.toString(st));
		
		String ss=new String(ch);
		System.out.println(ss);
	}
}
