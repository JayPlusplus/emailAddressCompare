import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String i,e;
		Address a = new Address();
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please input your phone number");
		i = keyboard.next();
		a.setPhone(i);
		System.out.println("Please input your email");
		e = keyboard.next();
		a.setEmail(e);
		
	}

}
