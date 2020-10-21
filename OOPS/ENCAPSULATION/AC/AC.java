class AC
{
	private boolean status;
	private int min_temp=18;
	private int max_temp=27;
	String brand;
	private int cur_temp;

	//Constructor
	AC(String brand)
	{
		this.brand=brand;
	}

	//ON 
	boolean on()
	{
		if(status)
		{
			System.out.println("AC is Running");
			return status;
		}
		else
		{
			this.status=true;
			cur_temp=23;
			return status;
		}
	}

	//OFF
	boolean off()
	{
		status=false;
		return status;
	}

	//To Increase Temp
	int increase()
	{
		if(status)
		{
			if(cur_temp<max_temp)
				cur_temp++;
			else
				System.out.println("Temp is reaches max temp");
		}
		else
			System.out.println("Switch on AC");
		return cur_temp;
	}

	//To Decrease Temp
	int decrease()
	{
		if(status)
		{
			if(cur_temp>min_temp)
				cur_temp--;
			else
				System.out.println("Temp is reaches min temp");
		}
		else
			System.out.println("Switch on AC");
		return cur_temp;
	}

	//To check AC status
	void checkstatus()
	{
		if(status)
			System.out.println("AC is ON");
		else
			System.out.println("AC is OFF");
	}

	//Getter for status
	boolean getstatus()
	{
		return status;
	}

	//Getter and Setter for cur_temp
	int getcurtemp()
	{
		return cur_temp;
	}
	void setcurtemp(int cur_temp)
	{
		if(cur_temp>=min_temp && cur_temp<=max_temp)
			this.cur_temp=cur_temp;
		else
			System.out.println("Cannot change current Temp");
	}

	//Getter and Setter for min_tem
	int getmintemp()
	{
		return min_temp;
	}
	void setmintemp(int min_temp)
	{
		if(min_temp<max_temp)
			this.min_temp=min_temp;
		else
			System.out.println("Min Temp should be less than Max Temp");
	}
	int getmaxtemp()
	{
		return max_temp;
	}

	//Getter and Setter for max_temp
	void setmaxtemp(int max_temp)
	{
		if(max_temp>min_temp)
			this.max_temp=max_temp;
		else
			System.out.println("Max Temp should be greater than Min Temp");
	}

}