package assignment;
import java.util.Scanner;
public class password3 {
	public static void main(String[]args)
	{
		enterpassword();
	}
	
	public static void enterpassword()
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter New Password:");
		String password=s.nextLine();
		checkpassword(password);
	}
	
	public static void checkpassword(String password)
	{
		if(password.length()>=8 && password.length()<=16)
		{
			if(password.charAt(0)>='A'&&password.charAt(0)<='Z'||password.charAt(0)>='a'&&password.charAt(0)<='z'||password.charAt(0)==' '||password.charAt(0)>='0'&&password.charAt(0)<='9')
			{
				outerLoop:{
				for(int i=0;i<password.length();i++)
				{
					if(password.charAt(i)>='A'&&password.charAt(i)<='Z')
					{
						for(int j=0;j<password.length();j++)
						{
							if(password.charAt(j)>='0'&&password.charAt(j)<='9')
							{
								for(int k=0;k<password.length();k++)
								{
									if(password.charAt(k)>=32&&password.charAt(k)<=47||password.charAt(k)>=58&&password.charAt(k)<=64||password.charAt(k)>=91&&password.charAt(k)<=96||password.charAt(k)>=123&&password.charAt(k)<=126)
									{
										for(int l=0;l<password.length();l++)
										{
											if(password.charAt(l)==' ')
											{
												System.out.println("Password Should not have \"Space\"");
												enterpassword();
												break outerLoop;
											}
										}
										confirmpassword(password);
										break outerLoop;
									}
								}
								System.out.println("Password Should have atlest 1 Special Character");
								enterpassword();
								break outerLoop;
							}
						}
						System.out.println("Password should have atlest 1 Number");
						enterpassword();
						break outerLoop;
					}
				}
				System.out.println("Passwrod should have atlest 1 Uppercase");
				enterpassword();
				break outerLoop;
			}
			}
			else
			{
				System.out.println("Password Should not Start with Special Character");
				enterpassword();
			}
		}
		else
		{
			System.out.println("Password should have 8-16 Charater");
			enterpassword();
		}
	}
	
	public static void confirmpassword(String password)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Re-Enetr Password:");
		String repassword=s.nextLine();
		if(password.equals(repassword))
		{
			System.out.println("Successfully Set the PASSWORD");
		
		}
		else
		{
			System.out.println("PASSWORD Not Matching");
			enterpassword();
		}
	}
	
}



