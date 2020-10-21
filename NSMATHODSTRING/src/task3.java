import java.util.Scanner;
public class task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String original_pwd="pavan006";
		System.out.print("Enter Password");
		String pwd=s.nextLine();
		if(original_pwd.equals(pwd))
			System.out.println("Successfully Login");
		else
			System.out.println("Wrong Password");


	}

}
