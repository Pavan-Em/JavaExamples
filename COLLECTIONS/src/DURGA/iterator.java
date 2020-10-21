package DURGA;
import java.util.*;
public class iterator {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=0;i<=10;i++)
		{
			list.add(i);
		}
		System.out.println(list);
		list.removeIf(n->(n%2!=0));
		System.out.println(list);
	}
}
