import java.util.Scanner;
public class assignment3Problem4{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("How many mile have you drive?: ");
		double mile = sc.nextDouble();
		System.out.println("How many gallon have you used?: ");
		double gallon = sc.nextDouble();
		double MpG = (mile/gallon);
		System.out.println("Your car goes " + MpG +" miles per gallon");
	}
}