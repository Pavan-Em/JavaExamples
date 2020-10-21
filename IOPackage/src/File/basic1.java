package File;

import java.io.*;

public class basic1 {
	
	public static void main(String[] args) throws IOException {
		
		File f1 = new File("C:\\Users\\Windows\\Desktop\\IOPackage\\pavan.txt");
		System.out.println(f1.exists());
		f1.createNewFile();
		System.out.println(f1.exists());
		
		File f2 =  new File("C:\\Users\\Windows\\Desktop\\IOPackage\\tools");
		System.out.println(f2.exists());
		f2.mkdir();
		
		File f3 = new File("C:\\Users\\Windows\\Desktop\\IOPackage","Kariya.txt");
		f3.createNewFile();
		
		File f4 = new File(f2 , "Seena.txt");
		f4.createNewFile();
		
		System.out.println(f2.isDirectory());
		System.out.println(f1.isFile());
		
		String[] filename = f2.list();
		for(String names : filename)
		{
			System.out.println(names);
		}
		
		System.out.println(f1.length());
		
		File f5 = new File("C:\\Users\\Windows\\Desktop");
		String[] names  =  f5.list();
		int count = 0;
		for(String name : names)
		{
			count++;
			System.out.println(name);
		}
		System.out.println("Number of Files : "+count);
		System.out.println("============================");
		for(String name : names)
		{
			File f = new File(f5,name);
			if(f.isFile())
			System.out.println(name);
		}
	

	}

}
