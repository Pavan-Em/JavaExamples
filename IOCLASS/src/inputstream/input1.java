package inputstream;
import java.util.Scanner;
import java.io.*;
public class input1 {
	public static void main(String[] args) throws FileNotFoundException,IOException {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the path:");
		String path=s.nextLine().trim();
		System.out.println("Enter the file name:");
		String filename=s.nextLine().trim();
		String fullpath=path+"\\"+filename+".txt";
		FileInputStream fis=new FileInputStream(fullpath);
		System.out.println(fis.available());
	//	fis.skip(2);
		int a;
		while((a=fis.read())!=-1)
		{
			System.out.print((char)a);
		
		}
		/*byte[] b=new byte[fis.available()];
		fis.read(b);
		String sen=new String(b);
		System.out.println(sen);*/
		
		fis.close();
		System.out.println();
		System.out.println("im done here");
	}
}
