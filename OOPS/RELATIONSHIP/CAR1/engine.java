class engine
{
	private String engine_no;
	private double hp= 550;
	
	//combustion
	void combustion()
	{
		System.out.print("Engine Running");
	}
	
	//pressure
	void pressure()
	{
		System.out.println("Pressure Increasing");
	}
	
	//getter and setter for engine_no
	String getengineno()
	{
		return engine_no;
	}
	void setengineno(String engine_no)
	{
		this.engine_no=engine_no;
	}
	
	//getter and setter for hp
	double gethp()
	{
		return hp;
	}
	void sethp(double hp)
	{
		this.hp=hp;
	}
}