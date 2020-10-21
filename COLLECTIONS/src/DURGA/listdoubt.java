package DURGA;
import java.util.*;
public class listdoubt {
	public static void main(String[] args) {
		ArrayList<String> list1=new ArrayList<String>(Arrays.asList("pavan","kera","pavi"));
		System.out.println(list1);
		LinkedList<String> list2=new LinkedList<String>(Arrays.asList("deeku","jordi"));
		System.out.println(list2);
		Collections.copy(list1, list2);
		System.out.println(list1);
		list2.remove("jordi");
		
		System.out.println("========================");
		ArrayList<String> list3=new ArrayList<String>();
		String[] s= {"pavan","hey"};
		Collections.addAll(list3, s);
		System.out.println(list3);
		System.out.println("=========================");
		
		ArrayList<Integer> num=new ArrayList<Integer>(Arrays.asList(1,2,3,4,1,9,5));
		int n=Collections.binarySearch(num, 2);
		System.out.println(n);
		System.out.println(num);
		for(int i=0;i<num.size();i++)
		{
			for(int j=i+1;j<num.size();j++)
			{
				if(num.get(j)<num.get(i))
					Collections.swap(num, i, j);
			}
		}
		System.out.println("after");
		System.out.println(num);
		
	}
}
