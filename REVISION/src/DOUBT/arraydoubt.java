package DOUBT;
import java.util.*;
public class arraydoubt {
	public static void main(String[] args) {
		int[] a;
		a= new int[] {1,2,3,4,5};
		System.out.println(Arrays.toString(a));
		
		Arrays.fill(a, 1,2,9);
		System.out.println(Arrays.toString(a));
		
		ArrayList<Integer> list=new ArrayList<Integer>(Arrays.asList(1,5,4,6));
		
		
		ListIterator<Integer> itr=list.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			itr.set(10);
		}
		System.out.println(list);
		
		int[] num= {9,8};
		Collections.addAll(list,2,2 );
		System.out.println(list);
		
	
	}
}
