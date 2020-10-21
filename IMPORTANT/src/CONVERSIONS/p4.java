

						//String[] to Char[]

package CONVERSIONS;
import java.util.Arrays;
public class p4 {
	public static void main(String[] args) {
		String[] st= {"pavan","kera","pavi"};
		System.out.println(Arrays.toString(st));
		System.out.println("====================");
		String s=Arrays.toString(st).replaceAll("\\[|\\]|,|\\s", "");
		System.out.println(s);
		System.out.println("=================");
		char[] ch=s.toCharArray();
		System.out.println(Arrays.toString(ch));
	}
}
