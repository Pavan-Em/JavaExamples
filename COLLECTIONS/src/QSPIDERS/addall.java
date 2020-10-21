package QSPIDERS;
import java.util.*;
public class addall {
	public static void main(String[] args) {
		ArrayList<String> list1=new ArrayList<>();
		ArrayList<String> list2=new ArrayList<>();
		String[] s= {"pava","kera"};
		list1.add("google");
		list2.add("microsoft");
		Collections.addAll(list2, s);
		System.out.println(list2);
		System.out.println(2>1&&4<1?"PAVAN":false);
		System.out.println();
		}
	}

