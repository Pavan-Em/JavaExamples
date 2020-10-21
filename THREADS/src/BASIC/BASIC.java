package BASIC;

public class BASIC {
	
	public static void main(String[] args) throws Exception{
		System.out.println("main Begin");
		employee e1=new employee( "pavan"  ,  1  ,  60000  ,  "A+");
		employee e2=new employee(  "kera"  ,  2  ,  40000  ,  "B+");
		employee e3=new employee("chomba"  ,  3  ,  90000  ,  "A-");
		e1.start();
		e1.sleep(2000);
		e2.start();
		e2.sleep(2000);
		e3.start();
		//e3.sleep(2000);//main end wont wait to disply
		System.out.println("main end");
	}

}
