package DURGA;
import java.util.*;
public class stack {
	public static void main(String[] args) {
		Stack s=new Stack();
		s.add('a');
		s.add('b');
		s.push(10);
		s.add('c');
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.search('a'));
		System.out.println(s.search(10));
		System.out.println(s.search(65));
		
		System.out.println("=====================");
		String sss="hey my name is pavan";
		Scanner ss=new Scanner(sss);
		System.out.println(sss);
		while(ss.hasNext())
		{
			System.out.println(ss.next());
		}
		System.out.println("end");
		System.out.println(sss);
	}
}
