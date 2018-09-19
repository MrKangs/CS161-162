import java.util.Scanner;
public class Gangsta{
	public static void main(String [] args){;
		Scanner Gangsta = new Scanner(System.in);
		System.out.print("What is your first name?: ");
		String name = Gangsta.next();
		System.out.print("What is your last name?: ");
		String lname = Gangsta.next();
		lname = lname.toUpperCase();
		System.out.println("Your gangsta name is " + name.substring(0,1) + " Diddy " + lname + " " + name + "-izzle");
	}
}