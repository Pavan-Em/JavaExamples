package Book;

public class book {
	String title;
	int id;
	double price;
	
	public book(String title,int id,double price)
	{
		this.title=title;
		this.id=id;
		this.price=price;
	}
	
	public String toString()
	{
		return "Id   :"+id+"\nTitle:"+title+"\nPrice:"+price+"\n------------\n";
	}
	
	public boolean equals(Object o)
	{
		book obj=(book)o;
		return title.equals(obj.title) &&
				price==obj.price &&
				id==obj.id;
	}
	
	public int hashCode()
	{
		int hc=0;
		hc+=id;
		hc+=title.hashCode();
		hc+=(int)price;
		return hc;
	}
}
