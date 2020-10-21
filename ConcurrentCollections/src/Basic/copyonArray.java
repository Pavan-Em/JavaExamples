package Basic;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class copyonArray {
	public static void main(String[] args) {
		
		CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<Integer>();
		list.add(4);
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext())
		{
			itr.next();
			itr.remove();
		}
	}
}
