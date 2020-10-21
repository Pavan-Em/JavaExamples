package ThreadGroup;

public class group1 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getThreadGroup().getName());  //main
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
		
		ThreadGroup g=new ThreadGroup("pavan");
		System.out.println(g.getName());
		System.out.println(g.getParent().getName());
		
		ThreadGroup g1 = new ThreadGroup(g,"tootls");
		System.out.println(g1.getParent().getName());
		
		System.out.println(Thread.currentThread().getThreadGroup().getMaxPriority());
		System.out.println(Thread.currentThread().getPriority());
	}
}
