

					//boolean[],int[],char[],double[] to String

package CONVERSIONS;
import java.util.Arrays;
public class p3 {
	public static void main(String[] args) {
		int[] num= {1,2,3};
		String st=Arrays.toString(num).replaceAll("\\[|\\]|,", "");
		System.out.println(st);
	}
}
