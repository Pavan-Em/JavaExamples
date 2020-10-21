package BASIC1;

public class b1  {

	
	 static enum pavan
	{
		hashta,el,fuego
	}
	
	public static void main(String[] args) {
		
		beer b=beer.tub;
		System.out.println(b);
		System.out.println(beer.bud);
		System.out.println("===============");
		System.out.println(pavan.fuego);
		System.out.println(pavan.el);
		System.out.println("=====================");
		beer[] be=beer.values();
		for(beer bbb:be)
		{
			System.out.println(bbb+"--->"+bbb.ordinal());
		}
		System.out.println("==================");
		System.out.println(beer.bira);
	}
}
interface p
{
	
}

enum beer implements p
{
	bud,tub,ub,bira;
	int i=10;
	
}
