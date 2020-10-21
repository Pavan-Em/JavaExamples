package BASIC1;

import java.util.Arrays;

public class enumconstructor {
	
	public static void main(String[] args) {
		
		beerr b1=beerr.kf;
		System.out.println(b1);
		beerr.hey();
		System.out.println("hello word");
		System.out.println("=========================");
		
		wiskey[] w=wiskey.values();
		System.out.println(Arrays.toString(w));
		for(wiskey ww:w)
		{
			System.out.println(ww+"---->"+ww.getprice());
		}
		System.out.println(wiskey.ib.equals(wiskey.hp));
	}

}

enum beerr
{
	kf,ko,ub;
	
	beerr()
	{
		System.out.println("Constructor");
	}
	
	public static void hey()
	{
		System.out.println("im Static");
	}
}

enum wiskey
{
	ib(180),hp(350),bw;
	int price;
	wiskey(int price)
	{
		this.price=price;
	}
	wiskey(){
		price=99;//this is like default price
	}
	public int getprice()
	{
		return price;
	}

}












