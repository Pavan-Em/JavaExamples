package LAPTOP;

import java.util.Random;
import java.util.Scanner;

public class laptop {
	private int product_id;
	private String product_code;
	private String product_name;
	private double ram_size;
	private double product_price;
	private static int no_of_products;
	public final laptop[] lapinfo=new laptop[3];
	
	public laptop() {}
	
	//getter and setter for product_id
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}



	//getter and setter for product_code
	public String getProduct_code() {
		return product_code;
	}
	public void setProduct_code(String product_code) {
		this.product_code = product_code;
	}

	//getter and setter for product_name
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	//getter and setter for Ram_size
	public double getRam_size() {
		return ram_size;
	}
	public void setRam_size(double ram_size) {
		this.ram_size = ram_size;
	}

	//getter and setter for product_price
	public double getProduct_price() {
		return product_price;
	}
	public void setProduct_price(double product_price) {
		this.product_price = product_price;
	}
	
	//getter and setter for no_of_products
	public static int getNo_of_products() {
		return no_of_products;
	}
	public static void setNo_of_products(int no_of_products) {
		laptop.no_of_products = no_of_products;
	}
	
	//constructor
	public laptop(String product_name, double ram_size, double product_size) {
		no_of_products++;
		this.product_id=no_of_products;
		this.product_name = product_name;
		this.ram_size = ram_size;
		this.product_price = product_size;
		this.product_code=generatecode(6);
	}
	
	int count=0;
	//to add laptop
	public void addlaptop()
	{
		if(count<lapinfo.length)
		{
			Scanner s=new Scanner(System.in);
			System.out.print("Enter Product Name:");
			String name=s.nextLine().trim();
		    System.out.print("Enter Ram Size    :");
		    double ramsize=s.nextDouble();
		    System.out.print("Enter Price       :");
		    double price=s.nextDouble();
		    lapinfo[count++]=new laptop(name,ramsize,price);
		    System.out.println(name+"Laptop added to the Database");
		}
		else
			System.out.print("No Space to Add Laptop");
	}
	
	//to generate code
	public String generatecode(int a)
	{
		int[] num=new int[a/2];
		char[] ch=new char[a/2];
		String snum="";
		for(int i=0;i<a/2;i++)
		{
			Random r=new Random();
			num[i]=r.nextInt(10);
			snum+=String.valueOf(num[i]);
			ch[i]=(char)(r.nextInt(26)+65);
		}
		return String.copyValueOf(ch)+snum;
	}
	
	//over ride toString
	public String toString()
	{
		System.out.println("ID      :"+product_id);
		System.out.println("Code    :"+product_code);
		System.out.println("Name    :"+product_name);
		System.out.println("Ram-Size:"+ram_size+" GB");
		System.out.println("Price   :"+product_price+" Rs");
		return "";
	}
	
	//override equals
	public boolean equals(Object obj)
	{
		laptop l=(laptop)obj;
		return product_id==l.product_id &&
				product_code.equals(l.product_code) &&
				product_name.equals(l.product_name) &&
				product_price==l.product_price &&
				ram_size==l.ram_size;
	}
	
	//override hashCode
	public int hashCode()
	{
		int hc=0;
		hc+=product_id;
		hc+=product_code.hashCode();
		hc+=product_name.hashCode();
		hc+=(int)product_price;
		hc+=(int)ram_size;
		return hc;
		
	}
	
	//search for laptop
	public laptop searchlaptopbyid(int id)
	{
		for(int i=0;i<lapinfo.length;i++)
		{
			if(id==lapinfo[i].product_id)
			{
				System.out.println("Laptop Found");
				return lapinfo[i];
			}
		}
		return null;
	}
	public laptop searchlaptopbyname(String name)
	{
		for(int i=0;i<lapinfo.length;i++)
		{
			if(name.equals(lapinfo[i].product_name))
			{
				System.out.println("Laptop Found");
				return lapinfo[i];
			}
		}
		return null;
	}
	public laptop searchlaptopbyram(double ramsize)
	{
		for(int i=0;i<lapinfo.length;i++)
		{
			if(ramsize==lapinfo[i].ram_size)
			{
				System.out.println("Laptop Found");
				return lapinfo[i];
			}
		}
		return null;
	}
	
	//to remove laptop
	public laptop removelaptopbyid(int id)
	{
		for(int i=0;i<lapinfo.length;i++)
		{
			if(id==lapinfo[i].product_id)
			{
				System.out.println("Laptop Removed");
				laptop temp=lapinfo[i];
				lapinfo[i]=null;
				return temp;
			}
		}
		return null;
	}
	public laptop removelaptopbyname(String name)
	{
		for(int i=0;i<lapinfo.length;i++)
		{
			if(name.equals(lapinfo[i].product_name))
			{
				System.out.println("Laptop Removed");
				laptop temp=lapinfo[i];
				lapinfo[i]=null;
				return temp;
			}
		}
		return null;
	}
	public laptop removelaptopbyram(double ramsize)
	{
		for(int i=0;i<lapinfo.length;i++)
		{
			if(ramsize==lapinfo[i].ram_size)
			{
				System.out.println("Laptop Removed");
				laptop temp=lapinfo[i];
				lapinfo[i]=null;
				return temp;
			}
		}
		return null;
	}
	
	//to update laptop info
	public laptop updatename(String name)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter New Name:");
		String newname=s.nextLine().trim();
		for(int i=0;i<lapinfo.length;i++)
		{
			if(name.equals(lapinfo[i].product_name))
			{
				System.out.println("Name "+lapinfo[i].product_name+" Changed to "+newname);
				s.close();
				return lapinfo[i];
			}	
		}
		s.close();
		return null;
	}
	public laptop updateram(double ramsize)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter New RamSize:");
		double newramsize=s.nextDouble();
		for(int i=0;i<lapinfo.length;i++)
		{
			if(ramsize==lapinfo[i].ram_size)
			{
				System.out.println("RamSize "+lapinfo[i].ram_size+" Changed to "+newramsize);
				s.close();
				return lapinfo[i];
			}	
		}
		s.close();
		return null;
	}
	public laptop updateprice(double price)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter New Price:");
		double newprice=s.nextDouble();
		for(int i=0;i<lapinfo.length;i++)
		{
			if(price==lapinfo[i].product_price)
			{
				System.out.println("Price "+lapinfo[i].product_price+" Changed to "+newprice);
				s.close();
				return lapinfo[i];
			}	
		}
		s.close();
		return null;
	}
}//class end
