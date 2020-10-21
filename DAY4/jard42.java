class jard42
{
	public static void main(String[]args)
	{
		double capacity=2.2*1000;
	        double water=capacity*(3/4.0);
		int vol_glass=125;
		int no_glass=(int)(water/vol_glass);
		System.out.println("qty of water in the jug:"+water+"ml");
		System.out.println("no of glass required to empty the jug:"+no_glass+"glasses");	
	}
}