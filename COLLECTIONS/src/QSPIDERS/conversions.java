package QSPIDERS;
import java.util.*;
public class conversions {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		int[] num=new int[list.size()];
		for(int i=0;i<num.length;i++)
		{
			num[i]=list.get(i);
		}
		System.out.println(Arrays.toString(num));
	}
}
