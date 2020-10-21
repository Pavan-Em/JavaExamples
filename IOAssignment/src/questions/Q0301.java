package questions;

import java.io.File;

public class Q0301 {

	public static void main(String[] args) {
		
		File f1 = new File("C:\\Users\\Windows\\Desktop\\Testing.txt");
		
		File f2 = new File("C:\\Users\\Windows\\Desktop\\PavanTesting.txt");
		
		System.out.println(f1.renameTo(f2));
	}
}
