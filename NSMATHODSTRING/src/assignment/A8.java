
package assignment;

import java.util.Scanner;

public class A8 {

	public static void main(String[] args) 
	{
       Scanner s=new Scanner(System.in);
       System.out.print("Enter String1:"
       		+ "");
       String s1=s.nextLine().trim();
       System.out.print("ENter Pattern String:");
       String s2=s.nextLine().trim();
       boolean st=false;
       if(s1.length()>=s2.length());
       {
    	   for(int i=0;i<s1.length();i++)
    	   {
    		   int count=0;
    		   if(s1.charAt(i)==s2.charAt(0))
    		   {
    			   for(int j=i,k=0;k<s2.length();j++,k++)
    			   {
    				   if(j>s1.length()-1)//this to avoid sioobe 1st String outofrange
    					   break;
    				   if(s1.charAt(j)==s2.charAt(k))
    				   {
    					   count++;
    				   }
    			   }
    			   if(count==s2.length())
    			   {
    				   st=true;
    				   break;
    			   }
    		   }
    	   }
       }
       if(st)
    	   System.out.println("Pattern found");
       else
    	   System.out.println("pattern not found");
	}

}
