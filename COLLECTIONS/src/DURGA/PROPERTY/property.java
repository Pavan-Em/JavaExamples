package DURGA.PROPERTY;
import java.util.*;
public class property {
	public static void main(String[] args) {
		Properties p=new Properties();
		p.setProperty("Pavan", "Mamtha");
		p.setProperty("Jordan", "Sakshi");
		p.setProperty("Kera", "Patte");
		p.setProperty("Deeka", "Deeksha");
		p.setProperty("PNavi", "Anusha");
		System.out.println(p.size());
		System.out.println(p);
		
		Enumeration e=p.propertyNames();
		while(e.hasMoreElements())
		{
			String s=(String)e.nextElement();
			System.out.println(p.getProperty(s));
		}
		
		
		
	}
}
