package LAPTOPDRIVER;

import java.util.Arrays;
import java.util.Scanner;

import LAPTOP.laptop;
import SORTBYNAME.sortbyname;
import SORTBYPRICE.sortbyprice;
import SORTBYRAM.sortbyram;

public class laptopdriver {
	static laptop lap=new laptop();
	static Scanner s=new Scanner(System.in);
	public void editlaptopinfo()
	{
		boolean exit=false;
		System.out.println("Welcome to Laptop CRUD Management");
		do
		{
		System.out.println("1: Add Lapyop");
		System.out.println("2: Search Laptop");
		System.out.println("3: Remove Laptop");
		System.out.println("4: Update Laptop Info");
		System.out.println("5: Sort Laptop");
		System.out.println("6: Exit");
		System.out.print("Enter your Choice:");
		int choice=s.nextInt();
			switch(choice)
			{
			case 1:
			{
				lap.addlaptop();
			}break;
			case 2:
			{
				System.out.println("1: Search by Product ID");
				System.out.println("2: Search by Product Name");
				System.out.println("3: Search by Ram Size");
				System.out.print("Enter your Choice:");
				int num=s.nextInt();
				s.nextLine();
				if(num==1)
				{
					System.out.print("Enter Product ID:");
					int id=s.nextInt();
					laptop l=lap.searchlaptopbyid(id);
					if(l!=null)
						System.out.println(l);
					else
						System.out.println("Laptop with ID "+id+" is Not Found");
				}
				if(num==2)
				{
					System.out.print("Enter Product Name:");
					String name=s.nextLine().trim();
					laptop l=lap.searchlaptopbyname(name);
					if(l!=null)
						System.out.println(l);
					else
						System.out.println("Laptop with Name "+name+" is Not Found");
				}
				if(num==3)
				{
					System.out.print("Enter RamSize:");
					double ramsize=s.nextDouble();
					laptop l=lap.searchlaptopbyram(ramsize);
					if(l!=null)
						System.out.println(l);
					else
						System.out.println("Laptop with Ramsize "+ramsize+" is Not Found");
				}
				else
					System.out.println("Enter Proper Choice");
			}
			break;
			case 3:
			{
				System.out.println("1: Remove by Product ID");
				System.out.println("2: Remove by Product Name");
				System.out.println("3: Remove by Ram Size");
				System.out.print("Enter your Choice:");
				int num=s.nextInt();
				if(num==1)
				{
					System.out.print("Enter Product ID:");
					int id=s.nextInt();
					laptop l=lap.removelaptopbyid(id);
					if(l!=null)
						System.out.println(l);
					else
						System.out.println("Laptop with ID "+id+" is Not Found");
				}
				if(num==2)
				{
					System.out.print("Enter Product Name:");
					String name=s.nextLine().trim();
					laptop l=lap.removelaptopbyname(name);
					if(l!=null)
						System.out.println(l);
					else
						System.out.println("Laptop with Name "+name+" is Not Found");
				}
				if(num==3)
				{
					System.out.print("Enter RamSize:");
					double ramsize=s.nextDouble();
					laptop l=lap.removelaptopbyram(ramsize);
					if(l!=null)
						System.out.println(l);
					else
						System.out.println("Laptop with Ramsize "+ramsize+" is Not Found");
				}
				else
					System.out.println("Choice Not Matched");
			}
			break;
			case 4:
			{
				System.out.println("1: Update Product Name");
				System.out.println("2: Update RamSize");
				System.out.println("3: Update Price");
				System.out.print("Enter your Choice:");
				int num=s.nextInt();
				if(num==1)
				{
					System.out.print("Enter Old Product Name:");
					String name=s.nextLine().trim();
					laptop l=lap.updatename(name);
					if(l!=null)
						System.out.println(l);
					else
						System.out.println("Laptop with Name "+name+" is Not Found");
				}
				if(num==2)
				{
					System.out.print("Enter Old RamSize:");
					double ramsize=s.nextDouble();
					laptop l=lap.updateram(ramsize);
					if(l!=null)
						System.out.println(l);
					else
						System.out.println("Laptop with Ramsize "+ramsize+" is Not Found");
				}
				if(num==3)
				{
					System.out.print("Enter Old Price:");
					double price=s.nextDouble();
					laptop l=lap.updateprice(price);
					if(l!=null)
						System.out.println(l);
					else
						System.out.println("Laptop with Price "+price+" is Not Found");
				}
				else
					System.out.println("Choice Not Matched");
			}
			break;
			case 5:
			{
				System.out.println("1: Sort by Name");
				System.out.println("2: Sort by Ramsize");
				System.out.println("3: Sort by Price");
				System.out.print("Enter your Choice:");
				int num=s.nextInt();
				if(num==1)
				{
					Arrays.sort(lap.lapinfo,new sortbyname());
					System.out.println("Sorted By Name");
					for(int i=0;i<lap.lapinfo.length;i++)
					{
						System.out.println(lap.lapinfo[i]);
					}
				}
				if(num==2)
				{
					Arrays.sort(lap.lapinfo,new sortbyram());
					System.out.println("Sorted By RamSize");
					for(int i=0;i<lap.lapinfo.length;i++)
					{
						System.out.println(lap.lapinfo[i]);
					}
				}
				if(num==1)
				{
					Arrays.sort(lap.lapinfo,new sortbyprice());
					System.out.println("Sorted By Price");
					for(int i=0;i<lap.lapinfo.length;i++)
					{
						System.out.println(lap.lapinfo[i]);
					}
				}
				else
					System.out.println("Choice Not Matched");
			}
			break;
			case 6:{ 
				System.out.println("Thanku For Using!!\nBye Bye..");
				exit=true;}break;
			}
		}while(!(exit));
	}
	
}
