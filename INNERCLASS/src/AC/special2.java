package AC;

public class special2 {
	
	public static void main(String[] args) {
		
		pizza obj1=new pizza();
		obj1.size();
		hut obj2=new hut();
		obj2.obj.size();
	}

}


class pizza
{
	public void size()
	{
		System.out.println("Small Size");
	}
}

class hut
{
	pizza obj=new pizza()
			{
				public void size()
				{
					System.out.println("Medium Size");
				}
			};
}
