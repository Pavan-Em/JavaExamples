package QSPIDERS;
import java.util.*;
public class penbox {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		Scanner s=new Scanner(System.in);
		for(int i=0;i<4;i++)
		{
			System.out.print("Enter Ink_color:");
			String ink_color=s.nextLine();
			System.out.print("Enter Price:");
			double price=s.nextDouble();
			s.nextLine();
			list.add(new pen(ink_color,price));		
		}
		System.out.println("Ink_color      Price(Rs)");
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			pen p=(pen)itr.next();
			System.out.println(p.getInk_color()+"               "+p.getPrice()*1.1);
		}
		
	}

}

 class pen
{
	private String ink_color;
	private double price;
	
	public pen (String ink_color,double price)
	{
		this.ink_color=ink_color;
		this.price=price;
	}

	public String getInk_color() {
		return ink_color;
	}

	public void setInk_color(String ink_color) {
		this.ink_color = ink_color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
