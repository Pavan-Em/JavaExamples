package user;
import account.account;
import java.util.Scanner;
class user
{
	public static void main(String[]args)
	{
		account a=new account();
		a.getdetails();
		//a2.getdetails();//cant find symbol bocz i used befor declaration
		System.out.println("===================================");
		account a1=new account (1,"Pavan","KAR006");
		a1.getdetails();
		System.out.println("===================================");
		//account a2=new account();
		//a1.readaccdetails();
		//a1.getdetails();
		System.out.println("===================================");
		Scanner s=new Scanner(System.in);//this also possible
		account a3=new account();
		a3.ano=s.nextInt();
		a3.name=s.next();
		a3.ifsc=s.next();
		a3.getdetails();


	}
}

//here we can pass data 3 type 
//throught constructor pass the data
//empty constructor then pass value through scanner this class oly
//empty constructor then pass valure through scanne rpresent in account