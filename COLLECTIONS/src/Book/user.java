package Book;

public class user {
	public static void main(String[] args) {
		library l=new library();
		l.addbook(new book("Java",1,1250));
		l.addbook(new book("Python",2,1300));
		l.addbook(new book("C++",3,900));
		l.addbook(new book("C#",4,950));
		
		l.displaybooklist();
		System.out.println("=====================");
		book o=l.removeobj();
		if(o!=null)
		{
			System.out.println("Removed Book");
			System.out.println(o);
		}
		else
			System.out.println("book not found");
		System.out.println(l.books);
	}
}
