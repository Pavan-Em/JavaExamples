package AC;

public class special4 {

	public static void main(String[] args) {
		
		type obj=new type();
		obj.meat.type();
		obj.plant.type();
		obj.both.type();
	}
}

interface animal
{
	void type();
}

class type 
{
	animal meat=new animal()
			{
				public void type()
				{
					System.out.println("Carnivores");
				}
			};
	animal plant=new animal()
			{
				public void type()
				{
					System.out.println("Herbivorus");
				}
			};
	animal both=new animal()
			{
				public void type() 
				{
					System.out.println("Omnivorus");
				}
			};
}
