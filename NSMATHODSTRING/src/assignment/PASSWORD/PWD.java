package assignment.PASSWORD;

import java.util.Scanner;

public class PWD {
	static String pwd;
	public static String EnterPwd()
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Password:");
		pwd=s.nextLine();
		boolean PwdCheck=CheckPwd(pwd);
		if(PwdCheck)
		{
			boolean check=ConfirmPwd(pwd);
			if(check)
			{
				System.out.println("Successfully Set the PASSWORD");
			}
			else
				EnterPwd();
		}
		else
		{
			EnterPwd();
		}
		return pwd;
	}
	
	public static boolean CheckPwd(String pwd)
	{
		if(pwd.length()<8 || pwd.length()>16)
		{
			System.out.println("Password Should 8-16 Cjaracter");
			return false;
		}
		
		char ch=pwd.charAt(0);
		if(!(ch>='A'&&ch<='Z' || ch>='a'&&ch<='z'|| ch==' '|| ch>='0'&&ch<='9'))
		{
			System.out.println("Password Shouldn't Start With SpecialCharacter");
			return false;
		}
		
		int up=0,sc=0,num=0;
	    for(int i=0;i<pwd.length();i++) 
	    {
	    	if(pwd.charAt(i)>='A'&&pwd.charAt(i)<='Z')
	    		up++;
	    	else if(pwd.charAt(i)>='0' &&pwd.charAt(i)<='9' )
	    		num++;
	    	else if(pwd.charAt(i)==' ')
	    	{
	    		System.out.println("Password Shouldn't contain Space");
	    		return false;
	    	}
	    	else
	    		sc++;
	    }
	    if(up<1)
	    {
	    	System.out.println("Password should have Atlest 1 Uppercase");
	    	return false;
	    }
	    else if(sc<1)
	    {
	    	System.out.println("Password Should have Atleast 1 Specialchareter");
	    	return false;
	    }
	    else if(num<1)
	    {
	    	System.out.println("PAssword should have Atlest 1 Number");
	    	return false;
	    }
	    return true;
	}
	
	public static boolean ConfirmPwd(String pwd)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Re-Enter Password:");
		String repwd=s.nextLine();
		if(pwd.equals(repwd))
			return true;
		else
		{
			System.out.println("Password is NOT MATCHING");
			return false;
		}
	}
}
