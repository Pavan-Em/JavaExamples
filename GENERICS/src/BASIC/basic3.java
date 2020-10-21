package BASIC;

import java.util.ArrayList;

public class basic3 {
	public static void main(String[] args) {
		
		ArrayList<String> obj=new ArrayList<String>();
		obj.add("Pavan");
		obj.add("hey");
		System.out.println(print(obj));
	
		
	}
	
	public static ArrayList print(ArrayList l)
	{
		l.add(10);
		return l;
	}

}

