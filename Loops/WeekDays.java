import java.util.*;
public class WeekDays{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Choose your number between 0 to 6: ");
		int n = sc.nextInt();
		switch(n){
			case (0): System.out.println("Today is Sunday!");
				break;
			case (1): System.out.println("Today is Monday!");
				break;
			case (2): System.out.println("Today is Tuesday!");
				break;
			case (3): System.out.println("Today is Wednesday!");
				break;
			case (4): System.out.println("Today is Thursday!");
				break;
			case (5): System.out.println("Today is Friday!");
				break;
			case (6): System.out.println("Today is Sunday!");
				break;
			default: System.out.println("You entered the wrong number!");
				break;
			}}}