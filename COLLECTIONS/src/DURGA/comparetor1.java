package DURGA;
import java.util.*;
public class comparetor1 {
	public static void main(String[] args) {
		TreeSet<Character> set=new TreeSet<Character>();
		set.add('a');
		set.add('z');
		set.add('s');
		set.add('d');
		System.out.println(set);
		Comparator c=set.comparator();
		if(c==null)
		{
			System.out.println("Set sorted in default order");
		}
		else
			System.out.println("Set sorted in diff order");
		System.out.println("================================");
		TreeSet<Character> set1=new TreeSet<Character>(new addDescinding());
		set1.add('a');
		set1.add('z');
		set1.add('s');
		set1.add('d');
		System.out.println(set1);
		Comparator c1=set1.comparator();
		System.out.println(c1);
		if(c1==null)
		{
			System.out.println("Set sorted in default order");
		}
		else
			System.out.println("Set sorted in diff order");
		
	}
}

class addDescinding implements Comparator<Character>
{
	public int compare(Character c1,Character c2)
	{
		return c2-c1;
	}
}
