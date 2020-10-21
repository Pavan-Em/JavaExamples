package ADVANCE;

import java.util.Scanner;

public class Advancebankdemo {
	public static void main(String[] args) throws Exception {
		System.out.println("Creating an Account....");
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Acc Num:");
		int acc_num=s.nextInt();
		bank b=new bank(acc_num);
		System.out.println("Account Created..");
		System.out.println("Depositing Money...");
		System.out.print("ENter Amount:");
		double amount=s.nextDouble();
		b.deposit(amount);
		System.out.println("Account Balance:"+b.getBal_amount()+" Rs");
		try
		{
			System.out.println("Withdrawing moaney...");
			System.out.print("ENter Amount:");
			double wamount=s.nextDouble();
			b.withdraw(wamount);
			System.out.println("Account Balance:"+b.getBal_amount()+" Rs");
			System.out.print("ENter Amount:");
			double wwamount=s.nextDouble();
			b.withdraw(wwamount);
			System.out.println("Account Balance:"+b.getBal_amount()+" Rs");
		}
		catch(InsafficientBalance e)
		{
			System.out.println("you are short "+e.getAmount()+" Rs");
			System.out.println(e.getMessage());
		}
		System.out.println("Bank closed");
		
	}
}

class InsafficientBalance extends Exception
{
	private double amount;
	
	public InsafficientBalance(double amount)
	{
		super(Integer.toString((int)amount));
		this.amount=amount;
	}
	
	double getAmount() {
		return amount;
	}
}


class bank
{
	private double bal_amount;
	private int acc_number;
	
	public bank(int acc_num)
	{
		this.acc_number=acc_number;
	}
	
	public void deposit(double amount)
	{
		bal_amount+=amount;
	}
	
	public void withdraw(double amount) throws Exception
	{

			if(amount<=bal_amount)
			{
				bal_amount-=amount;
			}
			else
			{
				double needs=amount-bal_amount;
				throw new InsafficientBalance(needs);
			}
	}
	
	public double getBal_amount()
	{
		return bal_amount;
	}
	
	public int getNumber()
	{
		return acc_number;
	}
}
