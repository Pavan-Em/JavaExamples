package File;

import java.io.File;

public class File01 {

	public static void main(String[] args) {
		
		File sel = new File("C:\\Users\\Windows\\Desktop\\selenim doc");
		System.out.println(sel.exists());
		System.out.println(sel.isFile());
		System.out.println(sel.isDirectory());
		String[] selList = sel.list();
		System.out.println("==============");
		for(String e : selList)
		{
			if(new File(e).isDirectory())
			System.out.println(e);
		}
		System.out.println("==================");
		System.out.println(sel.length());
	}
}
