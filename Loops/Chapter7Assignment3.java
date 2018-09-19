import java.util.*;
public class Chapter7Assignment3{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		boolean okay;
		do {
		System.out.print("Enter Your Integer: ");
		int x =sc.nextInt();
		if (x % 2 == 0) {
		okay = true;
		System.out.println("You typed an EVEN integer.");
		} else {
		okay = false;
		System.out.println(x + " is not an EVEN number");
		}
		} while (!okay);
}}