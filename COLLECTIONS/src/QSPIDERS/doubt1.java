package QSPIDERS;
import java.util.*;
public class doubt1 {
	public static void main(String[] args) {
		ArrayList list1=new ArrayList(Arrays.asList("pavan"));
		ArrayList list2=new ArrayList(Arrays.asList("kera","pavi"));
		list1.addAll(list2);
		System.out.println(list1);
		list1.remove("kera");
		System.out.println(list1);
	}
}
