package questions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) throws Exception {
		
		//to know current directory
		String currdir = System.getProperty("user.dir");
		System.out.println(currdir);
		
		//Find file Extension
		File f = new File(System.getProperty("user.dir")+"\\Q05.java");
		String path = f.getName();
		int index=path.lastIndexOf(".");
		System.out.println(path.substring(index+1));
		
		//count lines in file
		BufferedReader re = new BufferedReader(new FileReader("C:\\Users\\Windows\\Desktop\\PavanTesting.txt"));
		int count = 0;
		Scanner s = new Scanner(re);
		while(s.hasNextLine())
		{
			s.nextLine();
			count++;
		}
		System.out.println(count);
		
		
	}
}
