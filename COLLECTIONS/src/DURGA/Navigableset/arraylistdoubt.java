package DURGA.Navigableset;
import java.util.*;
public class arraylistdoubt {
	public static void main(String[] args) {
		ArrayList<Integer> num=new ArrayList<Integer>(Arrays.asList(2,4,5));
		System.out.println(num);
		num.add(6);
		num.add(5);
		num.remove((Integer)4);
		System.out.println(num);
		
		int[] i= {1,5,4};
		List num2=Arrays.asList(i);
		
		System.out.println(num2.toString());
		i[0]=10;
		System.out.println(num2.toString());
	}
}
