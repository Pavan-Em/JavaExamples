package user;
import employee.employee;
import te.te;
import dev.dev;
import empdriver.empdriver;

public class user {

	public static void main(String[] args) {
		
		employee e1=empdriver.addemp();
		employee e2=empdriver.addemp();
		System.out.println("==================================");
		System.out.println(e1);
		System.out.println("====================================");
	    System.out.println(e2);
		System.out.println("===================================");
		System.out.println(e1.equals(e2));
	}

}
