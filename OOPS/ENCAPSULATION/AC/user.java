class user
{
	public static void main(String[]args)
	{
		AC a1=new AC("SONY");
		System.out.println("Brand:" +a1.brand);
		a1.on();
		a1.checkstatus();
		System.out.println("Current Temp:"+a1.getcurtemp()+"°C");
		a1.on();
		a1.increase();
		System.out.println("Current Temp:"+a1.getcurtemp()+"°C");
		a1.increase();
		System.out.println("Current Temp:"+a1.getcurtemp()+"°C");
		a1.increase();
		System.out.println("Current Temp:"+a1.getcurtemp()+"°C");
		a1.increase();
		System.out.println("Current Temp:"+a1.getcurtemp()+"°C");
		a1.increase();
		System.out.println("Current Temp:"+a1.getcurtemp()+"°C");
		a1.setmaxtemp(17);
		a1.setmintemp(28);
		a1.setcurtemp(28);
		a1.off();
		a1.decrease();
		a1.off();
		System.out.println("Status:"+a1.getstatus());
		a1.checkstatus();
		a1.setmaxtemp(10);
		System.out.println("Ststus:"+a1.getstatus());
		a1.increase();
		a1.on();
		a1.increase();
		System.out.println("Status:"+a1.getstatus());
		System.out.println("current temp:"+a1.getcurtemp()+"°C");
		a1.increase();
		System.out.println("Current Temp:"+a1.getcurtemp()+"°C");
		a1.increase();
		System.out.println("Current Temp:"+a1.getcurtemp()+"°C");
		a1.increase();
		System.out.println("Current Temp:"+a1.getcurtemp()+"°C");
		a1.increase();
		System.out.println("Current Temp:"+a1.getcurtemp()+"°C");
		a1.increase();
		System.out.println("Current Temp:"+a1.getcurtemp()+"°C");

	}
}