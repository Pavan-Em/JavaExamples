class ss
{
     int i=10;
	public String toString()
	{
		ss obj=new ss();
		
		System.out.println("from ss");
		return "";//not possible bcoz type differs
	}

}
class driver
{
	public static void main(String[]args)
	{
		ss obj=new ss();
		System.out.println(obj);
		System.out.println(obj.i);
	}
}