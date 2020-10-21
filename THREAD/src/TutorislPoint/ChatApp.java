package TutorislPoint;

public class ChatApp {
	public static void main(String[] args) {
		Chat c = new Chat();
		new Thread1(c);
		new Thread2(c);
	}
}

class Chat
{
	boolean flag = false;
	public synchronized void question(String que) 
	{
		if(flag)
		{
			try {
				wait();
			}catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println(que+"------------>"+Thread.currentThread().getName());
		flag=true;
		try {
			Thread.sleep(2000);} catch (InterruptedException e) {}
		notify();
	}
	
	public synchronized void answer(String ans) 
	{
		if(!flag)
		{
			try {
				wait();
			}catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println(ans+"----------->"+Thread.currentThread().getName());
		flag=false;
		try {
		Thread.sleep(2000);} catch (InterruptedException e) {}
		notify();
	}
}

class Thread1 implements Runnable
{
	String[] s1= {"Hi" , "How are you?","I'm Fine"};
	Chat c;
	public Thread1(Chat c)
	{
		this.c=c;
		new Thread(this, "Question").start();
	}
	
	public void run()
	{
		for(int i=0;i<s1.length;i++)
		{
			c.question(s1[i]);
		}
	}
}

class Thread2 implements Runnable
{
	String[] s2= {"Hi","I'm Fine, How about you?","Great!"};
	Chat c;
	public Thread2(Chat c)
	{
		this.c=c;
		new Thread(this,"Answer").start();;
	}
	
	public void run()
	{
		for(int i=0;i<s2.length;i++)
		{
			c.answer(s2[i]);
		}
	}
}



























