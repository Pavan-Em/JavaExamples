class user
{
	public static void main(String[]args)
	{
		car c1=new car("Audi");
		System.out.println("Manufacturer:"+c1.manufacturer);
		System.out.println("HP:"+c1.e.gethp()+" Bhp");
		System.out.println("Engine no:"+c1.e.getengineno());
		c1.e.setengineno("a123");
		System.out.println("Engine no:"+c1.e.getengineno());
		c1.start();
		System.out.println("Current Speed:"+c1.getcurspeed()+"Kmph");
		c1.setcurspeed(248);
		c1.drive();
		System.out.println("Current speed:"+c1.getcurspeed()+" Kmph");
		c1.accelarate();
		System.out.println("Current speed:"+c1.getcurspeed()+" Kmph");
		c1.accelarate();
		System.out.println("Current speed:"+c1.getcurspeed()+" Kmph");
		c1.accelarate();
		System.out.println("Current speed:"+c1.getcurspeed()+" Kmph");
		c1.checkstatus();
		c1.setcurspeed(2);
		System.out.println("Current Speed:"+c1.getcurspeed()+" Kmph");
		c1.breaks();
		System.out.println("Current Speed:"+c1.getcurspeed()+" Kmph");
		c1.breaks();
		System.out.println("Current Speed:"+c1.getcurspeed()+" Kmph");
		c1.breaks();
		System.out.println("Current Speed:"+c1.getcurspeed()+" Kmph");
		c1.checkstatus();
		System.out.println("curren speed:"+c1.getcurspeed()+" kmph");
		c1.accelarate();
		c1.stop();
		c1.accelarate();
		c1.accelarate();
		c1.stop();
		c1.stop();
		c1.accelarate();
		c1.off();


	}
}