class car
{
	private boolean status;
	String manufacturer;
	private int min_speed=0;
	private int max_speed=250;
	private int cur_speed;
	engine e=new engine();
	//Constructor
	car(String manufacturer)
	{
		this.manufacturer=manufacturer;
	}
	//START
	boolean start()
	{
		if(status)
		{
			System.out.println("Its Ready");
		}
		else
		{
			status=true;
			cur_speed=0;
		}
		return status;
	}
	//OFF
	boolean off()
	{
		if(cur_speed==min_speed)
		{
			this.status=false;
		}
		else
			System.out.println("Car is moving cannot off the Car");
		return status;
	}
	//STOP
	void stop()
	{
		if(cur_speed==0)
			System.out.println("car is at Rest Condition");
		else
		{
			breaks();
		}
	}
	//DRIVE
	int drive()
	{
		if(status)
		{
				e.combustion();
				accelarate();
		}
			else
				System.out.println("Start the car");
			return cur_speed;
	}
	//ACCELARATE
	int accelarate()
	{
		if(status)
		{
			if(cur_speed < max_speed)
			{
				e.pressure();
				cur_speed++;
			}
			else
				System.out.println("Already Rached the max speed");
		}
		return cur_speed;
	}
	//BREAK
	int breaks()
	{
		if(cur_speed > min_speed)
		{
			cur_speed--;
			if(cur_speed==0)
				System.out.println("Car is at Rest Condition");
		}
		return cur_speed;
	}
	//TO CHECK STATUS OF CAR
	void checkstatus()
	{
		if(status && cur_speed==min_speed)
			System.out.println("Car is in ON Condition");
		else if(status && cur_speed>min_speed)
			System.out.println("Car is in Moving condition");
		else 
			System.out.println("Car is in OFF Condition");
	}
	//GETTER FOR STATUS
	boolean getstatus()
	{
		return status;
	}
	//ONLY GETTER FOR MIN SPEED
	int getminspeed()
	{
		return min_speed;
	}
	//GETTER AND SETTER FOR MAX SPEED
	void setmaxspeed(int max_speed)
	{
		if(max_speed>min_speed)
			this.max_speed=max_speed;
		else
			System.out.println("MAX SPEED cannot be less than MIM SPEED");
	}
	int getmaxspeed()
	{
		return max_speed;
	}
	//GETTER AND SETTER FOR CURREN SPEED	
	int getcurspeed()
	{
		return cur_speed;
	}
	void setcurspeed(int cur_speed)
	{
		if(cur_speed < min_speed)
			this.cur_speed=min_speed;
		else if(cur_speed > max_speed)
			this.cur_speed=max_speed;
		else
			this.cur_speed=cur_speed;
	}
	
}