package Book;
import java.util.*;
public class library {
	ArrayList<book> books=new ArrayList<>();
	
	public void addbook(book b)
	{
		books.add(b);
	}
	
	public void displaybooklist()
	{
		System.out.println(books.toString().replaceAll("\\[|\\]|,","").trim());
	}
	
	Object removebytitle()
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Name:");
		String title=s.nextLine();
		for(int i=0;i<books.size();i++)
		{
			if(title.equalsIgnoreCase(books.get(i).title))
				return books.remove(i);
		}
		return null;
	}
	
	book removeobj()
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Name");
		String title=s.nextLine();
		for(int i=0;i<books.size();i++)
		{
			book o=(book)books.get(i);
		if(title.equalsIgnoreCase(o.title))
		{
			books.remove(o);
			return o;
		}
		
		}
		return null;
	}
}
