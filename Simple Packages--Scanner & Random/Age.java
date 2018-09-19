import java.util.*;
public class Age{
	public static void main(String[] args){
		final int MINOR = 21;
		Scanner sc = new Scanner(System.in);
		System.out.print ("Enter your age: ");
		int age = sc.nextInt();
		System.out.println("You entered: " + age);
		if (age < MINOR){
			System.out.println("Youth is a wonderful thing. Enjoy.");
		} else if (age == MINOR){
			System.out.println("Now, you are getting old");
		} else {
			System.out.println("You are tooooooo old");
		}System.out.println("Age is a state of mind");
	}}