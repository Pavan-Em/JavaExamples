package BASIC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class basic6 {
	
	public static void main(String[] args) {
		
		List<Number> list=Arrays.asList(23.2,54.8);
		System.out.println(list);
		print(list);
	}
	
	public static Collection print(Collection<?> obj)
	{
		return obj;
	}

}
