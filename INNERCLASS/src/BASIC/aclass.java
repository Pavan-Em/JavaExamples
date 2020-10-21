package BASIC;

public class aclass {
	
	public static void main(String[] args) {
		
		popcorn p=new popcorn();
		p.taste();
		popcorn p1=new popcorn()
				{
					public void taste()
					{
						System.out.println("spicy");
					}
				};
			p1.taste();
			p1.taste();
			p.taste();
			popcorn p2=new popcorn()
					{
						public void taste()
						{
							System.out.println("Sweety");
						}
					};
			p2.taste();
			System.out.println(p.getClass().getName());
			System.out.println(p1.getClass().getName());
			System.out.println(p2.getClass().getName());
	}

}

class popcorn
{
	public void taste()
	{
		System.out.println("salty");
	}
}
