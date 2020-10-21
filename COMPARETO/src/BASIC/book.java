
package BASIC;

import java.util.Arrays;

public class book implements Comparable
{
	
		int bid;
		String title;
		double cost;
		
	public book(int bid,String title,double cost)
		{
			this.bid=bid;
			this.title=title;
			this.cost=cost;
		}
	
	public String toString()
	{
		return "Book ["+bid+" \t"+title+"\t"+cost+"]";
	}
	
	public int compareTo(Object obj)
	{
		book ob=(book)obj;
		return title.compareToIgnoreCase(ob.title);
	}
	

}


