package DURGA.PROPERTY;
import java.util.*;
import java.io.*;
public class property2 {
	public static void main(String[] args) throws Exception{
		Properties p=new Properties();
		FileInputStream fi=new FileInputStream("C:\\Users\\Windows\\Desktop\\selenim doc\\file.txt.txt");
		p.load(fi);
		System.out.println(p);
		String s=p.getProperty("email");
		System.out.println(s);
		p.setProperty("pwd", "ayyappa");
		p.setProperty("pavan", "Hasta El Feugo");
		FileOutputStream fo=new FileOutputStream("C:\\Users\\Windows\\Desktop\\selenim doc\\file.txt.txt");
		p.store(fo, "Its updated");
	}
}
