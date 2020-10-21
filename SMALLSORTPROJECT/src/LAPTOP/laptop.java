package LAPTOP;
import java.util.Scanner;
public class laptop implements Comparable {
	int pid;
	String name;
	double rsize;
	static Scanner s=new Scanner(System.in);
	//static final laptop[] lap=new laptop[3];
	laptop(){}
	
	public laptop(int pid,String name,double rsize)
	{
		this.pid=pid;
		this.name=name;
		this.rsize=rsize;
	}
	
	public String toString()
	{
		return "[ "+pid+"  ,  "+name+"  ,  "+rsize+" ]";
	}
	
	public boolean equals(Object obj)
	{
		laptop ob=(laptop)obj;
		return pid==ob.pid &&
				name==ob.name &&
				rsize==ob.rsize;
	}
	
	public int hasjCode()
	{
		int hc=0;
		hc+=pid;
		hc+=name.hashCode();
		hc+=(int)rsize;
		return hc;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	}

