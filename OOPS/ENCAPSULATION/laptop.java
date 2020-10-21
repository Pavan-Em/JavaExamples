class laptop
{
	private int ram_size;
	
	//GETTER
	int getramsize()
	{
		return ram_size;
	}

	//SETTER
	void setramsize(int ram_size)
	{
		if(ram_size>0)
			this.ram_size=ram_size;
		else
			System.out.println("Ram size cannot be O");
	}
}