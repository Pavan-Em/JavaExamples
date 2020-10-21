package inputstream;
import java.util.*;
import java.io.*;
public class scannerreader {
	public static void main(String[] args) throws Exception{
		FileInputStream fis=new FileInputStream("C:\\Users\\Windows\\Desktop\\IO\\inputpavan.txt");
		Scanner s=new Scanner(fis);
		while(s.hasNextLine())
		{
			System.out.println(s.nextLine());
		}
	}
}
