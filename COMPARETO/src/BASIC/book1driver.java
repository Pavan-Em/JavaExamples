package BASIC;
import java.util.Arrays;
public class book1driver {
	public static void main(String[] args) {
		book[] book=new book[5];
		book[0]=new book(1,"a",200);
		book[1]=new book(9,"A",362);
		book[2]=new book(-4,"Bpp",520);
		book[3]=new book(6,"aamp",20);
		book[4]=new book(4,"9",49);
		System.out.println("Before Sorting");
		for(int i=0;i<book.length;i++)
		System.out.println(book[i]);
		System.out.println("After sorting Name using compareToIgnoreCase method");
		Arrays.sort(book);
		for(int i=0;i<book.length;i++)
			System.out.println(book[i]);
	}

}
