package DURGA.MAP;
import java.util.*;
public class treemap {
	public static void main(String[] args) {
		TreeMap<Integer , String>  tree = new TreeMap();
		
		tree.put(2, "kera");
		tree.put(1, "pavi");
		tree.put(4,"jordi");
		tree.put(3, "deeks");
		//tree.put("hey",4);//this leads to class cast Exception
		System.out.println(tree);
		System.out.println(tree.comparator());
		
		
	}
}
