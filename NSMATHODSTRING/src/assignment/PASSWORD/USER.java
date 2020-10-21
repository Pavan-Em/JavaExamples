package assignment.PASSWORD;

public class USER {
	String password;
	public static void main(String[] args) {
		USER obj=new USER();
		obj.password=PWD.EnterPwd();
		System.out.println("PASSWORD:"+obj.password);
	}

}
